package com.titibok.hdd.testrxjavaver1.service;

import com.titibok.hdd.testrxjavaver1.model.Product;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by user1 on 6/13/2017.
 */

public interface ProductServiceAPI {
    //---get product
//    @GET("/{path}.json")
//    Observable<Product> getProduct(@Path("path") String path);

    //---get product
    @GET("/{path}.json")
    Call<Product> getProduct(@Path("path") String path);

    @GET("/{path}.json")
    Call<Map<String, Product>> getListProduct(@Path("path") String path);

    @GET("/{path}.json")
    Observable<Map<String, Product>> getProductOb(@Path("path") String path);
}
