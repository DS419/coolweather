package com.coolweather.app.util;

/**
 * Created by 13036 on 2016/4/1.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
