package com.project.facedemo.net;


import com.project.facedemo.entity.DetectImagBean;
import com.project.facedemo.entity.TestDataBean;

import java.util.HashMap;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Author: ZRT
 * Email: zhuruotong@jeejio.com
 * Date: 2019/6/14 15:52
 * Description: It's use to ...
 */
public interface ApiService {

    /*@GET("query")
    Observable<TestDataBean> getTopMovie(@Query("key") String key);*/

    @POST("detect")
    Observable<DetectImagBean> getDetectResult(@Body HashMap<String,Object> detectMap);
}
