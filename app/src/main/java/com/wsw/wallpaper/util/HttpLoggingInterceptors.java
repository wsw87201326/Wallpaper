package com.wsw.wallpaper.util;

import android.util.Log;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Create By :wsw
 * 2016-03-14 09:34
 */
public class HttpLoggingInterceptors implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        RequestBody requestBody = request.body();
        if (requestBody != null)
            Log.i("HttpLoggingInterceptors", "request:<----" + requestBody.toString() + "---->");

        Response response = chain.proceed(request);
        String responseStr = null;
        if (response != null)
            responseStr = response.body().string();
        Log.i("HttpLoggingInterceptors", "response:<----" + responseStr + "---->");
        return response;
    }
}
