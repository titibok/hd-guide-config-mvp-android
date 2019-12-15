package hd.java_mvp.domain.main;

import hd.java_mvp.module.ActivityModule;
import hd.java_mvp.module.ApplicationComponent;
import hd.java_mvp.domain.base.BaseActivity;
import hd.java_mvp.scope.ActivityScope;

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
