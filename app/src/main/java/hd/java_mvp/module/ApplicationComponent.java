package hd.java_mvp.module;

import hd.java_mvp.scope.ApplicationScope;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by user1 on 6/13/2017.
 */
@ApplicationScope
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    Retrofit retrofit();
}
