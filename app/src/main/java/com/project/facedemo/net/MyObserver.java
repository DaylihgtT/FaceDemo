package com.project.facedemo.net;

import android.content.Context;
import android.util.Log;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Author: ZRT
 * Email: zhuruotong@jeejio.com
 * Date: 2019/6/14 17:02
 * Description: It's use to ...
 */
public class MyObserver<T> implements Observer<T> {
    private static final String TAG = "—ZRT—Observer—";
    private ObserverOnNextListener listener;
    private Context context;

    public MyObserver(Context context, ObserverOnNextListener listener) {
        this.listener = listener;
        this.context = context;
    }
    @Override
    public void onSubscribe(Disposable d) {
        Log.d(TAG, "onSubscribe: "+"--------->>");
        //添加业务处理
    }

    @Override
    public void onNext(T t) {
        listener.onNext(t);
    }

    @Override
    public void onError(Throwable e) {
        Log.e(TAG, "onError: "+e.getMessage()+"--------->>");
        //添加业务处理
    }

    @Override
    public void onComplete() {
        Log.d(TAG, "onComplete: "+"--------->>");
        //添加业务处理
    }

}
