package com.wsw.wallpaper.injector.components;

import com.wsw.wallpaper.injector.modules.MainActivityModule;
import com.wsw.wallpaper.ui.activities.MainActivity;

import dagger.Component;

/**
 * Create By :wsw
 * 2016-02-26 09:34
 */
@Component(dependencies = AppComponent.class, modules = MainActivityModule.class)
public interface MainComponent extends ActivityComponent {
    void Inject(MainActivity mainActivity);


}
