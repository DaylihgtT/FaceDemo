package com.project.facedemo.net;

import com.project.facedemo.entity.DetectImagBean;
import com.project.facedemo.entity.TestDataBean;

import java.util.HashMap;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Author: ZRT
 * Email: zhuruotong@jeejio.com
 * Date: 2019/6/14 17:05
 * Description: It's use to ...
 */
public class ApiMethods {
    /**
     * 封装线程管理和订阅的过程
     */
    public static void ApiSubscribe(Observable observable, Observer observer) {
        observable.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    /**
     * 用于获取豆瓣电影Top250的数据
     *
     * @param observer 由调用者传过来的观察者对象
     * @param key      appKey
    public static void getTopMovie(Observer<TestDataBean> observer, String key) {
        ApiSubscribe(Api.getApiService().getTopMovie(key), observer);
    }*/

    public static void getDetectImageResult(Observer<DetectImagBean> observer, HashMap<String,Object> detectMap){
        ApiSubscribe(Api.getApiService().getDetectResult(detectMap),observer);
    }
}
