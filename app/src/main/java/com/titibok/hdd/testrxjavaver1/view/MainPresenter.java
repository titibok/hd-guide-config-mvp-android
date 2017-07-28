package com.titibok.hdd.testrxjavaver1.view;

import com.titibok.hdd.testrxjavaver1.base.BasePresenter;
import com.titibok.hdd.testrxjavaver1.model.Product;
import com.titibok.hdd.testrxjavaver1.service.ProductServiceAPI;

import java.util.Map;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by user1 on 6/13/2017.
 */

public class MainPresenter extends BasePresenter<MainView> {
    private ProductServiceAPI productServiceAPI;
    private Call<Map<String, Product>> productCall;
    private Retrofit retrofit;

    @Inject
    public MainPresenter(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    public void getData(String path) {
        productServiceAPI = retrofit.create(ProductServiceAPI.class);

//        productCall = productServiceAPI.getListProduct(path);
//        productCall.enqueue(new Callback<Map<String, Product>>() {
//            @Override
//            public void onResponse(Call<Map<String, Product>> call, Response<Map<String, Product>> response) {
//                //Log.e("test", "ok1");
//            }
//
//            @Override
//            public void onFailure(Call<Map<String, Product>> call, Throwable t) {
//                //Log.e("test", "ok2");
//            }
//        });

        productServiceAPI.getProductOb(path)
                .flatMap(stringProductMap -> {
                    stringProductMap.remove("-KhIZA8HdofOerJ-ukc7");
                    return Observable.just(stringProductMap);
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(stringProductMap -> {
                    //Log.e("test", "" + products.size());
                    int i = 0;
                    i = i + 1;
                    //update ui
                }, Throwable::printStackTrace);
    }
}
