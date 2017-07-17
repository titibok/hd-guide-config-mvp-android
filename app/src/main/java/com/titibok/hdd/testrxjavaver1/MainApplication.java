package com.titibok.hdd.testrxjavaver1;

import android.app.Application;

import com.titibok.hdd.testrxjavaver1.module.ApplicationComponent;
import com.titibok.hdd.testrxjavaver1.module.ApplicationModule;
import com.titibok.hdd.testrxjavaver1.module.DaggerApplicationComponent;

import org.androidannotations.annotations.EApplication;

/**
 * Created by user1 on 6/13/2017.
 */
@EApplication
public class MainApplication extends Application {
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
