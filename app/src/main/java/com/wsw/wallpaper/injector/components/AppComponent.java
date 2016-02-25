package com.wsw.wallpaper.injector.components;

import com.wsw.wallpaper.WallPaperApplication;
import com.wsw.wallpaper.injector.modules.AppModule;

import dagger.Component;

/**
 * Create By :wsw
 * 2016-02-25 17:13
 */
@Component(dependencies = AppModule.class)
public interface AppComponent {
    WallPaperApplication app();

}
