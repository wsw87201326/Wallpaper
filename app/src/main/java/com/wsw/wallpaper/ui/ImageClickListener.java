package com.wsw.wallpaper.ui;

import android.widget.ImageView;

import com.wsw.wallpaper.entities.PicturePageEntity;

/**
 * Create By :wsw
 * 2016-03-11 16:05
 */
public interface ImageClickListener {

    void onElementClick(int position, ImageView imageView , PicturePageEntity.PictureEntity pictureEntity);

}
