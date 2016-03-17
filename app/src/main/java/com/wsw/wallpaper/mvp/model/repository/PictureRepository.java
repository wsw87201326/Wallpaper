package com.wsw.wallpaper.mvp.model.repository;

import com.wsw.wallpaper.entities.PicturePageEntity;
import com.wsw.wallpaper.mvp.model.CharacterRepository;
import com.wsw.wallpaper.mvp.model.net.WallpaperApi;

import javax.inject.Inject;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Create By :wsw
 * 2016-02-26 09:50
 */
public class PictureRepository implements CharacterRepository {
    public static final String BASE_URL = "http://image.so.com/";//基础请求地址
    public static final String SRP = "srp";//请求所需要的,可能是排序???
    public static final int PN = 20;//每页的图片个数????
    private WallpaperApi mWallpaperApi;

    @Inject
    PictureRepository() {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();

        Retrofit wallpaperApiAdapter = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .baseUrl(BASE_URL)
                .build();

        mWallpaperApi = wallpaperApiAdapter.create(WallpaperApi.class);
    }


    @Override
    public Observable<PicturePageEntity> getPictureList(String title, int pageNumber) {
        return mWallpaperApi.getPictureList(title, SRP, PN * pageNumber, PN);
    }
}
