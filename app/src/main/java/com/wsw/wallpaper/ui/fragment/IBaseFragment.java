package com.wsw.wallpaper.ui.fragment;

/**
 * Create By :wsw
 * 2016-02-26 09:32
 */
public interface IBaseFragment {

    /**
     * 显示错误界面
     */
    void showErrorView();

    /**
     * 隐藏错误界面
     */
    void hideErrorView();

    /**
     * 显示加载界面
     */
    void showLoadingView();

    /**
     * 隐藏加载界面
     */
    void hideLoadingView();
}
