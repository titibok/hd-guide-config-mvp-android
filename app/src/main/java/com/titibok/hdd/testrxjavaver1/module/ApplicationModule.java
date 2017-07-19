package com.titibok.hdd.testrxjavaver1.module;

import com.titibok.hdd.testrxjavaver1.MainApplication;
import com.titibok.hdd.testrxjavaver1.scope.ApplicationScope;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.titibok.hdd.testrxjavaver1.utils.Constants.ROOT_URL;

/**
 * Created by user1 on 6/13/2017.
 */

@Module
public class ApplicationModule {
    private MainApplication application;

    public ApplicationModule(MainApplication application) {
        this.application = application;
    }

    @Provides
    @ApplicationScope
    MainApplication provideApplication() {
        return application;
    }

    @Provides
    @ApplicationScope
    Retrofit provideRetrofit() {
        return new Retrofit.Builder().baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }
}
