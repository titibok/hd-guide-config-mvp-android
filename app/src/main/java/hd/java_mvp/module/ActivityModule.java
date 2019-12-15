package hd.java_mvp.module;

import hd.java_mvp.domain.base.BaseActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by user1 on 6/13/2017.
 */
@Module
public class ActivityModule {
    private BaseActivity activity;

    public ActivityModule(BaseActivity activity) {
        this.activity = activity;
    }

    @Provides
    BaseActivity provideActivity() {
        return activity;
    }
}
