package com.wsw.wallpaper.ui.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;

/**
 * Create By :wsw
 * 2016-03-14 11:48
 */
public class DrawableUtil {
    public static Drawable getDrawableFromRes(Context context,int resId){
        return context.getDrawable(resId);
    }
}
