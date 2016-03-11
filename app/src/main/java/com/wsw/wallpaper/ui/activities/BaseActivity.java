package com.wsw.wallpaper.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wsw.wallpaper.WallPaperApplication;
import com.wsw.wallpaper.injector.components.ActivityComponent;
import com.wsw.wallpaper.injector.components.AppComponent;
import com.wsw.wallpaper.injector.components.DaggerActivityComponent;
import com.wsw.wallpaper.injector.modules.ActivityModule;

/**
 * Create By :wsw
 * 2016-02-25 16:50
 */
public abstract class BaseActivity extends AppCompatActivity implements IBaseActivity {

    private ActivityComponent activityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeActivityInjector();
        initializeDependencyInjector();
        initContentView();
        initButterKnife();
        initToolbar();
        initView();
    }

    private void initializeActivityInjector() {
        activityComponent = DaggerActivityComponent.builder()
                .appComponent(getApplicationComponent())
                .activityModule(getActivityModule())
                .build();
        activityComponent.Inject(this);
    }

    protected AppComponent getApplicationComponent() {
        return ((WallPaperApplication) getApplication()).getAppComponent();
    }

    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

    protected ActivityComponent getActivityComponent() {
        return this.activityComponent;
    }

}
