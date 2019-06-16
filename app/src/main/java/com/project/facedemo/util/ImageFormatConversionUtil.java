package com.project.facedemo.util;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PixelFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Author: ZRT
 * Email: zhuruotong@jeejio.com
 * Date: 2019/6/14 11:14
 * Description: It's use to ...
 */
public class ImageFormatConversionUtil {

    //Drawable转为Bitmap
    public static Bitmap drawableToBitmap(Drawable drawable) {
        Bitmap bitmap = null;

        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        // 取 drawable 的颜色格式,Bitmap.createBitmap 第三个参数
        Bitmap.Config config = drawable.getOpacity() != PixelFormat.OPAQUE ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888); // Single color bitmap will be created of 1x1 pixel
        } else {
            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        }
        //将drawable内容画到画布中
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmap;
    }

    //Bitmap转换为File
    public static File saveBitmapFile(Bitmap bitmap, String filePath, String fileName) {
        File file = new File(fileName);//将要保存图片的路径
        /*if (!file.exists()) {
            try {
                file.mkdir();
                file.createNewFile();
            } catch (IOException e) {
                Log.e("—ZRT—", "error---------->>" + e.getMessage());
                e.printStackTrace();
            }
        }*/
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bos);
            bos.flush();
            bos.close();
        } catch (IOException e) {
            Log.e("—ZRT—", "error---------->>" + e.getMessage());
            e.printStackTrace();
        }

        return file;
    }

    /**
     * 得到资源文件中图片的Uri
     *
     * @param context 上下文对象
     * @param id      资源id
     * @return Uri
     */
    public static Uri getUriFromDrawableRes(Context context, int id) {
        Resources resources = context.getResources();
        String path = ContentResolver.SCHEME_ANDROID_RESOURCE + "://"
                + resources.getResourcePackageName(id) + "/"
                + resources.getResourceTypeName(id) + "/"
                + resources.getResourceEntryName(id);
        return Uri.parse(path);
    }

    /**
     * uri 转 File
     * @param uri
     * @return
     */
    public static File uriTurnFile(Uri uri, Activity activity){

        if(uri == null){
            return null;
        }
        File file = null;
        String[] proj = { MediaStore.Images.Media.DATA };
        Cursor actualimagecursor = activity.managedQuery(uri, proj, null,
                null, null);
        int actual_image_column_index = actualimagecursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
        actualimagecursor.moveToFirst();
        String img_path = actualimagecursor.getString(actual_image_column_index);
        file = new File(img_path);
        return file;
    }

    /**
     * drawable 转 File
     * @param mContext
     * @param drawableId drawable的ID
     * @param fileName 转换后的文件名
     * @param path   文件存储路径
     */

    public static File drawableToFile(Context mContext,int drawableId,String fileName,String path){
        /*Bitmap bitmap = BitmapFactory.decodeResource(mContext.getResources(),drawableId);
        File file = new File(path);
        if (!file.exists()){
            file.mkdirs();
        }
        String defaultImgPath = path +"/"+fileName;
        file = new File(defaultImgPath);
        try {
            file.createNewFile();
            FileOutputStream fOut = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG,20,fOut);
            fOut.flush();
            fOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;*/
        BitmapDrawable d = (BitmapDrawable) mContext.getResources().getDrawable(drawableId);
        Bitmap img = d.getBitmap();

        String filPath = path+ File.separator + fileName;
        try{
            OutputStream os = new FileOutputStream(filPath);
            img.compress(Bitmap.CompressFormat.PNG, 100, os);
            os.close();
        }catch(Exception e){
            Log.e("TAG", "", e);
        }

        File file = new File(path);
        return file;
    }

}
