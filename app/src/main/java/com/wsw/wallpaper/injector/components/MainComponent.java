package com.wsw.wallpaper.injector.components;

import com.wsw.wallpaper.injector.Activity;
import com.wsw.wallpaper.injector.modules.ActivityModule;
import com.wsw.wallpaper.injector.modules.MainActivityModule;
import com.wsw.wallpaper.ui.fragment.PictureFragment;

import dagger.Component;

/**
 * Create By :wsw
 * 2016-02-26 09:34
 */
@Activity
@Component(dependencies = AppComponent.class, modules = {MainActivityModule.class, ActivityModule.class})
public interface MainComponent extends ActivityComponent {
    void Inject(PictureFragment pictureFragment);
}
