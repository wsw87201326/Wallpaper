package com.wsw.wallpaper.mvp.presenters;

import com.wsw.wallpaper.mvp.views.IView;
import com.wsw.wallpaper.mvp.views.MainView;

import javax.inject.Inject;

/**
 * Create By :wsw
 * 2016-02-26 09:44
 */
public class MainPresenter implements Presenter {
    MainView view;

    @Inject
    MainPresenter() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void attachView(IView v) {
        view = (MainView) v;
    }

    @Override
    public void onCreate() {

    }
}
