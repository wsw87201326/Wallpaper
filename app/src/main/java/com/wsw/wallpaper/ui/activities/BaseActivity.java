package com.wsw.wallpaper.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Create By :wsw
 * 2016-02-25 16:50
 */
public abstract class BaseActivity extends AppCompatActivity implements IBaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initPresenter();
    }
}
