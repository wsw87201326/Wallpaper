package com.wsw.wallpaper.mvp.views;

import com.wsw.wallpaper.entities.PageEntity;
import com.wsw.wallpaper.entities.PicturePageEntity;

/**
 * Created by wsw on 2016/3/11.
 */
public interface IImageView extends IView {
    void showPictureList(PageEntity pageEntity);

    void showLoadingView();

    void hideLoadingView();

    void showLightError();

    void hideErrorView();

    void showHDPicture(PicturePageEntity.PictureEntity pictureEntity);

}
