/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.wsw.wallpaper.injector.components;


import android.support.v7.app.AppCompatActivity;

import com.wsw.wallpaper.injector.Activity;
import com.wsw.wallpaper.injector.modules.ActivityModule;
import com.wsw.wallpaper.ui.activities.BaseActivity;

import dagger.Component;

@Activity
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void Inject(BaseActivity baseActivity);
    
    String[] getTitles();

    AppCompatActivity activity();
}
