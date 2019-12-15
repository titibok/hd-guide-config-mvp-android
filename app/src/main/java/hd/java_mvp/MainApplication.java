package hd.java_mvp;

import android.annotation.SuppressLint;
import android.app.Application;

import org.androidannotations.annotations.EApplication;

import hd.java_mvp.module.ApplicationComponent;
import hd.java_mvp.module.ApplicationModule;
import hd.java_mvp.module.DaggerApplicationComponent;

/**
 * Created by user1 on 6/13/2017.
 */

@SuppressLint("Registered")
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
