package com.wsw.wallpaper.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wsw.wallpaper.R;
import com.wsw.wallpaper.entities.PageEntity;
import com.wsw.wallpaper.entities.PicturePageEntity;
import com.wsw.wallpaper.injector.components.MainComponent;
import com.wsw.wallpaper.mvp.presenters.ImagePresenter;
import com.wsw.wallpaper.mvp.views.IImageView;
import com.wsw.wallpaper.ui.adapter.ImageLayoutManager;
import com.wsw.wallpaper.ui.adapter.ImageRecyclerAdapter;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Create By :wsw
 * 2016-02-29 15:08
 */
public class PictureFragment extends BaseFragment implements IImageView {

    private static final String FRAGMENT_TITLE = "fragment_title";
    @Inject
    PageEntity pageEntity;

    @Bind(R.id.image_recycler_view)
    RecyclerView imageRecyclerView;

    @Inject
    ImagePresenter imagePresenter;

    ImageRecyclerAdapter imageRecyclerAdapter;

    @Override
    public void showErrorView() {

    }

    @Override
    public void hideErrorView() {

    }

    @Override
    public void showHDPicture(PicturePageEntity.PictureEntity pictureEntity) {

    }

    @Override
    public void showPictureList(PageEntity pageEntity) {
        this.pageEntity = pageEntity;
        imageRecyclerAdapter.setPageEntity(pageEntity);
    }

    @Override
    public void showLoadingView() {

    }

    @Override
    public void hideLoadingView() {

    }

    @Override
    public void showLightError() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getComponent(MainComponent.class).Inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, rootView);
        setupRecyclerView();
        return rootView;
    }

    private void setupRecyclerView() {
        imageRecyclerAdapter = new ImageRecyclerAdapter(pageEntity, getContext(), (position, imageView, pictureEntity) -> {
            //// TODO: 2016/3/11  点击图片后跳转界面.需要有转场动画
        });
        this.imageRecyclerView.setLayoutManager(new ImageLayoutManager(ImageLayoutManager.defaultSpanCount, ImageLayoutManager.defaultOrientation));
        this.imageRecyclerView.setAdapter(imageRecyclerAdapter);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.imagePresenter.attachView(this);
        if (savedInstanceState == null) {
            this.loadPicturePage();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        imageRecyclerView.setAdapter(null);
        ButterKnife.unbind(this);
    }


    private void loadPicturePage() {
        imagePresenter.loadPicturePage(getArguments().getString(FRAGMENT_TITLE), pageEntity);
    }

    private void refreshPicture() {
        pageEntity.initialPage();
        imagePresenter.loadPicturePage(getArguments().getString(FRAGMENT_TITLE), pageEntity);
    }

    public PictureFragment() {
        setRetainInstance(true);
    }

    public static PictureFragment newInstance(String title) {
        PictureFragment fragment = new PictureFragment();
        Bundle args = new Bundle();
        args.putString(FRAGMENT_TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onStop() {
        super.onStop();
        imagePresenter.onStop();
    }
}
