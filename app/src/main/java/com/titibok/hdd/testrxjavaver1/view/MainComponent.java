package com.titibok.hdd.testrxjavaver1.view;

import com.titibok.hdd.testrxjavaver1.base.BaseActivity;
import com.titibok.hdd.testrxjavaver1.module.ActivityModule;
import com.titibok.hdd.testrxjavaver1.module.ApplicationComponent;
import com.titibok.hdd.testrxjavaver1.scope.ActivityScope;

import dagger.Component;

/**
 * Created by user1 on 6/13/2017.
 */
@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface MainComponent {
    BaseActivity activity();

    MainPresenter mainPresenter();

    void inject(MainActivity mainActivity);
}
