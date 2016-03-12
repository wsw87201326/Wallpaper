package com.wsw.wallpaper.mvp.model;

import com.wsw.wallpaper.entities.PicturePageEntity;

import rx.Observable;

/**
 * Created by wsw on 2016/3/11.
 */
public interface CharacterRepository {

    Observable<PicturePageEntity> getPictureList(String title, int pageNumber);

}
