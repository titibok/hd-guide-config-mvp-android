package com.titibok.hdd.testrxjavaver1.network;

import android.content.Context;

import com.titibok.hdd.testrxjavaver1.model.BaseResponse;

import rx.Observable;
import rx.schedulers.Schedulers;

/**
 * Created by duonghd on 8/9/2017.
 */

public class DefaultNetworkProvider implements NetworkProvider {
    protected Context context;
    private boolean isDebug;

    public DefaultNetworkProvider(Context context, boolean isDebug) {
        this.context = context;
        this.isDebug = isDebug;
    }

    @Override
    public <TResponse extends BaseResponse<TResult>, TResult> Observable<TResult> transformResponse(Observable<TResponse> call) {

        Observable<TResult> res = call
                .observeOn(Schedulers.computation())
//                .onErrorResumeNext(throwable -> new NetworkFilter<TResponse>(this).execute(throwable))
//                .onErrorResumeNext(throwable -> new ApiThrowableFilter<TResponse>().execute(throwable))
                .flatMap(tResponse -> Observable.just(tResponse.getData()));

//        if (enableFilter) {
//            res = filterChain.execute(res);
//        }
        return res.onExceptionResumeNext(Observable.empty());
    }
}
