package com.wsw.wallpaper.injector.modules;

import com.wsw.wallpaper.WallPaperApplication;
import com.wsw.wallpaper.mvp.model.repository.PictureRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Create By :wsw
 * 2016-02-25 17:13
 */
@Module
public class AppModule {
    private final WallPaperApplication mWallPaperApplication;

    public AppModule(WallPaperApplication wallPaperApplication) {
        this.mWallPaperApplication = wallPaperApplication;
    }

    @Singleton
    @Provides
    public WallPaperApplication provideWallPaperApplication() {
        return this.mWallPaperApplication;
    }


    @Provides
    @Singleton
    PictureRepository providePictureRepository(PictureRepository pictureRepository) {
        return pictureRepository;
    }

}
