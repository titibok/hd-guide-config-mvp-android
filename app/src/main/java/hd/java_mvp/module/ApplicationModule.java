package hd.java_mvp.module;

import dagger.Module;
import dagger.Provides;
import hd.java_mvp.MainApplication;
import hd.java_mvp.scope.ApplicationScope;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static hd.java_mvp.utils.Constants.ROOT_URL;

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
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }
}
