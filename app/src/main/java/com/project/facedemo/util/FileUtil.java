package com.project.facedemo.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;

/**
 * Author: ZRT
 * Email: zhuruotong@jeejio.com
 * Date: 2019/6/14 10:59
 * Description: 文件操作相关工具类
 */
public class FileUtil {

    /*
     * 获取指定文件大小
     * @param  file  文件
     * */
    public static long getFileSize(File file) throws IOException {
        long size = 0;
        if (file.exists()) {
            FileInputStream fileInputStream = null;
            fileInputStream = new FileInputStream(file);
            size = fileInputStream.available();
        } else {
            Log.d("—ZRT—", "getFileSize------>>" +
                    "指定文件为空");
        }
        return size;
    }

    /*
     * 获取指定文件夹大小
     * @param  file  文件夹
     * */

    public static long getFileSizes(File file) throws IOException {
        long size = 0;
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                size = size + getFileSizes(files[i]);
            } else {
                size = size + getFileSize(files[i]);
            }
        }
        return size;
    }

    /*
     * 将long值的文件/文件夹长度转换为B/KB/MB/GB
     * @param  sizes  文件夹长度
     * */
    public static String toFileSize(long sizes) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String fileSizeString = "";
        String wrongSize = "OB";
        if (sizes == 0) {
            return wrongSize;
        }
        if (sizes < 1024) {
            fileSizeString = decimalFormat.format((double) sizes) + "B";
        } else if (sizes < 1048576) {
            fileSizeString = decimalFormat.format((double) sizes / 1024) + "KB";
        } else if (sizes < 1073741824) {
            fileSizeString = decimalFormat.format((double) sizes / 1048576) + "MB";
        } else {
            fileSizeString = decimalFormat.format((double) sizes / 1073741824) + "GB";
        }
        return fileSizeString;
    }

    /**
     * 获取cache路径
     *
     * @param context
     * @return
     */
    public static String getDiskCachePath(Context context) {
        if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())
                || !Environment.isExternalStorageRemovable()) {
            return context.getExternalCacheDir().getPath();
        } else {
            return context.getCacheDir().getPath();
        }
    }

    /**
     * encodeBase64File:(将文件转成base64 字符串). <br/>
     *
     * @param path 文件路径
     * @return
     * @throws Exception
     * @author guhaizhou@126.com
     * @since JDK 1.6
     */
    public static String encodeBase64File(String path) throws Exception {
        try {
            FileInputStream fis = new FileInputStream(path);//转换成输入流
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int count = 0;
            while((count = fis.read(buffer)) >= 0){
                baos.write(buffer, 0, count);//读取输入流并写入输出字节流中
            }
            fis.close();//关闭文件输入流
            String uploadBuffer = Base64.encodeToString(baos.toByteArray(),Base64.DEFAULT);  //进行Base64编码
            Log.d("—ZRT—",uploadBuffer);
            return uploadBuffer;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * decoderBase64File:(将base64字符解码保存文件). <br/>
     *
     * @param base64Code 编码后的字串
     * @param savePath   文件保存路径
     * @throws Exception
     * @author guhaizhou@126.com
     * @since JDK 1.6
     */
    public static void decoderBase64File(String base64Code, String savePath) throws Exception {
        //byte[] buffer = new BASE64Decoder().decodeBuffer(base64Code);
        byte[] buffer = Base64.decode(base64Code, Base64.DEFAULT);
        FileOutputStream out = new FileOutputStream(savePath);
        out.write(buffer);
        out.close();
    }

    //在SD卡上创建文件夹
    public static String createFiles(String path) {
        File fileSD = Environment.getExternalStorageDirectory();
        String filePath = fileSD.getPath() + path;
        File file = new File(filePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        return filePath;
    }

    /**
     * 判断文件/文件夹是否存在
     */
    public static boolean isExsit(String path) {
        File file = new File(path);
        //判断文件夹是否存在
        if (!file.exists()) {
            return false;
        }
        return true;
    }

    public static Bitmap getBitmapFromFile(String path){
        FileInputStream f = null;
        try {
            f = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Bitmap bm = null;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 10;//图片的长宽都是原来的1/10
        BufferedInputStream bis = new BufferedInputStream(f);
        bm = BitmapFactory.decodeStream(bis, null, options);
        return bm;
    }

}
