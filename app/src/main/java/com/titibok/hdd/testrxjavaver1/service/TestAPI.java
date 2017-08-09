package com.titibok.hdd.testrxjavaver1.service;

import com.titibok.hdd.testrxjavaver1.model.BaseResponse;
import com.titibok.hdd.testrxjavaver1.model.Campass;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by duonghd on 8/9/2017.
 */

public interface TestAPI {
    @GET("api/campasses")
    Observable<BaseResponse<List<Campass>>> getCampasses();
}
