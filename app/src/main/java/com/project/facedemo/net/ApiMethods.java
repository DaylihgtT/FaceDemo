package com.project.facedemo.net;

import com.project.facedemo.entity.BeautifulImgBean;
import com.project.facedemo.entity.CompareImgBean;
import com.project.facedemo.entity.CreateBean;
import com.project.facedemo.entity.DetectImagBean;
import com.project.facedemo.entity.SearchImgBean;
import com.project.facedemo.entity.TestDataBean;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.MediaType;
import okhttp3.RequestBody;

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
    public static void getTopMovie(Observer<TestDataBean> observer, String key) {
        ApiSubscribe(Api.getApiService().getTopMovie(key), observer);
    }*/

    public static void getDetectImageResult(Observer<DetectImagBean> observer, HashMap<String,RequestBody> detectMap){
        ApiSubscribe(Api.getApiService().getDetectResult(detectMap),observer);
    }

    public static void getBeautifulImageResult(Observer<BeautifulImgBean> observer, HashMap<String,RequestBody> beautifulMap){
        ApiSubscribe(Api.getApiService().getBeautifulResult(beautifulMap),observer);
    }

    public static void getCompareImageResult(Observer<CompareImgBean> observer, HashMap<String, RequestBody> compareMap){
        ApiSubscribe(Api.getApiService().getCompareResult(compareMap),observer);
    }

    public static void getSearchImageResult(Observer<SearchImgBean> observer, HashMap<String, RequestBody> searchMap){
        ApiSubscribe(Api.getApiService().getSearchResult(searchMap),observer);
    }

    public static void getCreateResult(Observer<CreateBean> observer, HashMap<String, RequestBody> createMap){
        ApiSubscribe(Api.getApiService().getCreateResult(createMap),observer);
    }

}
