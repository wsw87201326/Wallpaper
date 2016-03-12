/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.wsw.wallpaper.injector.modules;


import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.wsw.wallpaper.R;
import com.wsw.wallpaper.injector.Activity;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    private final AppCompatActivity appCompatActivity;

    public ActivityModule(AppCompatActivity appCompatActivity) {
        this.appCompatActivity = appCompatActivity;
    }

    @Provides @Activity
    AppCompatActivity provideAppCompatActivity() {
        return this.appCompatActivity;
    }

    @Provides @Activity
    FragmentManager provideFragmentManager(){
        return appCompatActivity.getSupportFragmentManager();
    }

    @Activity
    @Provides
    public String[] provideTitles() {
        return appCompatActivity.getResources().getStringArray(R.array.image_title);
    }

}
