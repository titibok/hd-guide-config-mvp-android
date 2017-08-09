package com.titibok.hdd.testrxjavaver1.module;

import com.titibok.hdd.testrxjavaver1.BuildConfig;
import com.titibok.hdd.testrxjavaver1.MainApplication;
import com.titibok.hdd.testrxjavaver1.network.DefaultNetworkProvider;
import com.titibok.hdd.testrxjavaver1.network.NetworkProvider;
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

//    @Provides
//    @ApplicationScope
//    Retrofit provideRetrofit() {
//        return new Retrofit.Builder().baseUrl(ROOT_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//                .build();
//    }

    @Provides
    @ApplicationScope
    Retrofit provideRetrofit2() {
        return new Retrofit.Builder().baseUrl("http://web.beesightsoft.com/bss-toanlvt/feedme/service/public/en/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    @Provides
    @ApplicationScope
    NetworkProvider networkProvider(){
        return new DefaultNetworkProvider(application, BuildConfig.DEBUG);
    }
}
