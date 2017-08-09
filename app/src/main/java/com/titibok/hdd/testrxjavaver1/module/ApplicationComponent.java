package com.titibok.hdd.testrxjavaver1.module;

import com.titibok.hdd.testrxjavaver1.network.NetworkProvider;
import com.titibok.hdd.testrxjavaver1.scope.ApplicationScope;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by user1 on 6/13/2017.
 */
@ApplicationScope
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    Retrofit retrofit();

    NetworkProvider networkProvider();
}
