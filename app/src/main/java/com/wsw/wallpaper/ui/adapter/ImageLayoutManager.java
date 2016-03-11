package com.wsw.wallpaper.ui.adapter;

import android.support.v7.widget.StaggeredGridLayoutManager;

/**
 * Create By :wsw
 * 2016-03-11 16:00
 */
public class ImageLayoutManager extends StaggeredGridLayoutManager {
    public static int defaultSpanCount = 2;
    public static int defaultOrientation = StaggeredGridLayoutManager.VERTICAL;

    public ImageLayoutManager(int spanCount, int orientation) {
        super(spanCount, orientation);
    }
}