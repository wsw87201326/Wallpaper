package com.wsw.wallpaper.mvp.presenters;

import android.util.Log;

import com.wsw.wallpaper.entities.PageEntity;
import com.wsw.wallpaper.mvp.model.domain.DefaultSubscriber;
import com.wsw.wallpaper.mvp.model.domain.PictureUseCase;
import com.wsw.wallpaper.mvp.views.IImageView;
import com.wsw.wallpaper.mvp.views.IView;

import javax.inject.Inject;

/**
 * Create By :wsw
 * 2016-02-26 09:44
 */
public class ImagePresenter implements Presenter {
    private static final String TAG = "ImagePresenter";
    private final PictureUseCase mPictureUseCase;
    private IImageView mIImageView;

    @Inject
    public ImagePresenter(PictureUseCase mPictureUseCase) {
        this.mPictureUseCase = mPictureUseCase;
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {
        this.mPictureUseCase.unSubscribe();

    }

    @Override
    public void onPause() {

    }

    @Override
    public void attachView(IView v) {
        mIImageView = (IImageView) v;
    }

    @Override
    public void onCreate() {

    }

    public void loadPicturePage(String title, PageEntity pageEntity) {
        mPictureUseCase.setParam(title, pageEntity);
        mPictureUseCase.execute(new PictureListSubscriber());
    }

    private final class PictureListSubscriber extends DefaultSubscriber<PageEntity> {

        @Override
        public void onCompleted() {
            Log.e(TAG,"onCompleted");

        }

        @Override
        public void onError(Throwable e) {
            Log.e(TAG,"onError");
        }

        @Override
        public void onNext(PageEntity pageEntity) {
            mIImageView.showPictureList(pageEntity);
        }
    }
}
