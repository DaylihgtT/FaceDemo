package com.project.facedemo.net;


import com.project.facedemo.entity.BeautifulImgBean;
import com.project.facedemo.entity.CompareImgBean;
import com.project.facedemo.entity.CreateBean;
import com.project.facedemo.entity.DetectImagBean;
import com.project.facedemo.entity.SearchImgBean;
import com.project.facedemo.entity.TestDataBean;

import java.util.HashMap;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * Author: ZRT
 * Email: zhuruotong@jeejio.com
 * Date: 2019/6/14 15:52
 * Description: It's use to ...
 */
public interface ApiService {

    /*@GET("query")
    Observable<TestDataBean> getTopMovie(@Query("key") String key);*/

    @Multipart
    @POST("v3/detect")
    Observable<DetectImagBean> getDetectResult(@PartMap HashMap<String, RequestBody> detectMap);

    @Multipart
    @POST("v1/beautify")
    Observable<BeautifulImgBean> getBeautifulResult( @PartMap HashMap<String, RequestBody> beautifulMap);

    @Multipart
    @POST("v3/compare")
    Observable<CompareImgBean> getCompareResult(@PartMap HashMap<String, RequestBody> compareMap);

    @Multipart
    @POST("v3/search")
    Observable<SearchImgBean> getSearchResult(@PartMap HashMap<String, RequestBody> searchMap);

    @Multipart
    @POST("v3/faceset/create")
    Observable<CreateBean> getCreateResult(@PartMap HashMap<String, RequestBody> createMap);
}
