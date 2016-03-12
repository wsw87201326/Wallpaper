package com.wsw.wallpaper.mvp.model.net;

import com.wsw.wallpaper.entities.PicturePageEntity;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Create By :wsw
 * 2016-02-26 10:08
 */
public interface WallpaperApi {


    @GET("j")
    Observable<PicturePageEntity> getPictureList(@Query("q") String title, @Query("src") String src, @Query("sn") int sn, @Query("pn") int pn);

}
