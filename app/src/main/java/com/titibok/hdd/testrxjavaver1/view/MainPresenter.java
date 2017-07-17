package com.titibok.hdd.testrxjavaver1.view;

import com.titibok.hdd.testrxjavaver1.base.BasePresenter;
import com.titibok.hdd.testrxjavaver1.model.Product;
import com.titibok.hdd.testrxjavaver1.service.ProductServiceAPI;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Retrofit;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by user1 on 6/13/2017.
 */

public class MainPresenter extends BasePresenter<MainView> {
    @Inject
    protected Retrofit retrofit;

    @Inject
    public MainPresenter() {
    }

    private ProductServiceAPI productServiceAPI;
    private Call<Product> productCall;

    public void getData(String path) {
        productServiceAPI = retrofit.create(ProductServiceAPI.class);
//        Call<Product> productCall = productServiceAPI.getProduct(path);
//        productCall.enqueue(new Callback<Product>() {
//            @Override
//            public void onResponse(Call<Product> call, Response<Product> response) {
//                int i = 0;
//                i = i + 1;
//
//                //do something
//            }
//
//            @Override
//            public void onFailure(Call<Product> call, Throwable t) {
//                int i = 0;
//                i = i + 1;
//
//                //do something
//            }
//        });

        productServiceAPI.getProductOb(path)
                .flatMap(stringProductMap -> {
                    stringProductMap.remove("-KhIZA8HdofOerJ-ukc7");
                    return Observable.just(stringProductMap);
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(products -> {
                    int i = 0;
                    i = i + 1;
                    //update ui
                }, Throwable::printStackTrace);
    }

//    public void abc() {
//        productCall.cancel();
//    }
}
