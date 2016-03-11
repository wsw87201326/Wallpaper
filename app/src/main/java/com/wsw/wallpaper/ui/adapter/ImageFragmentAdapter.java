package com.wsw.wallpaper.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.wsw.wallpaper.ui.fragment.PictureFragment;

import javax.inject.Inject;

/**
 * Created by 24363 on 2016/3/11.
 */
public class ImageFragmentAdapter extends FragmentPagerAdapter {

    private final String[] titles;

    @Inject
    public ImageFragmentAdapter(FragmentManager fm, String[] titles) {
        super(fm);
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return PictureFragment.newInstance(titles[position]);
    }

    @Override
    public int getCount() {
        return titles.length;
    }
}
