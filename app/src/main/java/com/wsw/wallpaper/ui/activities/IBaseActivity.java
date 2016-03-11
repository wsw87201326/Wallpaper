package com.wsw.wallpaper.ui.activities;

import com.wsw.wallpaper.mvp.views.IView;

/**
 * Create By :wsw
 * 2016-02-25 16:57
 */
public interface IBaseActivity extends IView {

    /**
     * 初始化Dagger2的依赖
     */
    void initializeDependencyInjector();

    /**
     * 初始化界面
     */
    void initContentView();

    /**
     * 初始化ButterKnife
     */
    void initButterKnife();

    /**
     * 初始化标题栏
     */
    void initToolbar();

    /**
     * 初始化界面
     */
    void initView();

}
