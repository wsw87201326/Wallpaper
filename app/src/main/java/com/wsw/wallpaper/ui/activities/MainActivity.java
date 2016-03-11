package com.wsw.wallpaper.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.wsw.wallpaper.R;
import com.wsw.wallpaper.injector.HasComponent;
import com.wsw.wallpaper.injector.components.DaggerMainComponent;
import com.wsw.wallpaper.injector.components.MainComponent;
import com.wsw.wallpaper.ui.adapter.ImageFragmentAdapter;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements HasComponent {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.tabs)
    TabLayout tabs;
    @Bind(R.id.appbar)
    AppBarLayout appbar;
    @Bind(R.id.container)
    ViewPager container;
    @Bind(R.id.main_content)
    CoordinatorLayout mainContent;

    private MainComponent mainComponent;

    @Inject
    ImageFragmentAdapter adapter;

    @Override
    public void initializeDependencyInjector() {
        this.mainComponent = DaggerMainComponent.builder()
                .activityModule(getActivityModule())
                .appComponent(getApplicationComponent())
                .build();
    }

    @Override
    public void initContentView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    public void initButterKnife() {
        ButterKnife.bind(this);
    }

    @Override
    public void initToolbar() {
        setSupportActionBar(toolbar);
    }

    @Override
    public void initView() {
        container.setAdapter(adapter);
        tabs.setupWithViewPager(container);
    }

    @Override
    public MainComponent getComponent() {
        return this.mainComponent;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

}
