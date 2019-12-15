package hd.java_mvp.domain.main;

import android.annotation.SuppressLint;

import hd.java_mvp.service.ProductServiceAPI;
import hd.java_mvp.domain.base.BasePresenter;
import hd.java_mvp.model.Product;

import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Retrofit;

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

    @SuppressLint("CheckResult")
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
