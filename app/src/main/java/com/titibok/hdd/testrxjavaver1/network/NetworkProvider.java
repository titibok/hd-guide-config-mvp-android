package com.titibok.hdd.testrxjavaver1.network;

import com.titibok.hdd.testrxjavaver1.model.BaseResponse;

import rx.Observable;

/**
 * Created by duonghd on 8/9/2017.
 */

public interface NetworkProvider {
    <TResponse extends BaseResponse<TResult>, TResult> Observable<TResult> transformResponse(
            Observable<TResponse> call);
}
