package com.wsw.wallpaper.mvp.model.domain;

import android.util.Log;

import com.wsw.wallpaper.entities.PageEntity;
import com.wsw.wallpaper.mvp.model.repository.PictureRepository;

import javax.inject.Inject;

import rx.Observable;

/**
 * Create By :wsw
 * 2016-03-11 15:46
 */
public class PictureUseCase extends UseCase<PageEntity> {
    private static final String TAG = "PictureUseCase";
    private final PictureRepository mRepository;
    private String title;
    private PageEntity pageEntity;

    @Inject
    public PictureUseCase(PictureRepository repository) {
        this.mRepository = repository;
    }

    public void setParam(String title, PageEntity pageEntity) {
        this.title = title;
        this.pageEntity = pageEntity;
    }

    @Override
    protected Observable<PageEntity> buildUseCaseObservable() {
        return mRepository.getPictureList(title, pageEntity.getNextPage())
                .flatMap(picturePageEntity -> {
                    Log.e(TAG, picturePageEntity.toString());
                    return Observable.just(pageEntity.loadNextFinish(picturePageEntity));
                });
    }
}
