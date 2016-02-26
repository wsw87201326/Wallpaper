package com.wsw.wallpaper.mvp.presenters;

import com.wsw.wallpaper.mvp.views.IView;

/**
 * Create By :wsw
 * 2016-02-26 09:44
 */
public interface Presenter {
    void onStart();

    void onStop();

    void onPause();

    void attachView (IView v);

    void onCreate();

}
