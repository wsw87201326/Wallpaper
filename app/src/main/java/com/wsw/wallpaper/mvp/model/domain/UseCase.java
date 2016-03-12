package com.wsw.wallpaper.mvp.model.domain;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.Subscriptions;

/**
 * Create By :wsw
 * 2016-03-11 15:38
 */
public abstract class UseCase<T> {
    private Subscription subscription = Subscriptions.empty();

    protected abstract Observable<T> buildUseCaseObservable();

    @SuppressWarnings("unchecked")
    public void execute(Subscriber UseCaseSubscriber) {
        this.subscription = this.buildUseCaseObservable()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(UseCaseSubscriber);
    }

    public void unSubscribe() {
        if (!subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
    }
}