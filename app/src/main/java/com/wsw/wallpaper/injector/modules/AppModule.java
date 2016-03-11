package com.wsw.wallpaper.injector.modules;

import com.wsw.wallpaper.R;
import com.wsw.wallpaper.WallPaperApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Create By :wsw
 * 2016-02-25 17:13
 */
@Module
public class AppModule {
    private final WallPaperApplication wallPaperApplication;

    public AppModule(WallPaperApplication wallPaperApplication) {
        this.wallPaperApplication = wallPaperApplication;
    }

    @Singleton
    @Provides
    public WallPaperApplication provideWallPaperApplication() {
        return this.wallPaperApplication;
    }

    @Singleton
    @Provides
    public String[] provideTitles() {
        return wallPaperApplication.getResources().getStringArray(R.array.image_title);
    }
}
