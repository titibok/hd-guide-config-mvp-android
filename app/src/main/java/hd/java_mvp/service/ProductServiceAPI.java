package hd.java_mvp.service;

import java.util.Map;

import hd.java_mvp.model.Product;
import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

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
