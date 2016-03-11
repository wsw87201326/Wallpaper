package com.wsw.wallpaper;

import android.app.Application;

import com.wsw.wallpaper.injector.components.AppComponent;
import com.wsw.wallpaper.injector.components.DaggerAppComponent;
import com.wsw.wallpaper.injector.modules.AppModule;

/**
 * Create By :wsw
 * 2016-02-25 16:48
 */
public class WallPaperApplication extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector() {
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

}
