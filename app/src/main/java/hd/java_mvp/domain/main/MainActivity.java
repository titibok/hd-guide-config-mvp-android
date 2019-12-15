package hd.java_mvp.domain.main;

import android.annotation.SuppressLint;
import android.widget.TextView;

import androidx.annotation.NonNull;

import hd.java_mvp.MainApplication;
import hd.java_mvp.R;
import hd.java_mvp.module.ActivityModule;

import hd.java_mvp.domain.base.BaseActivity;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.App;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import javax.inject.Inject;

@SuppressLint("Registered")
@EActivity(R.layout.activity_main)
public class MainActivity extends BaseActivity<MainView, MainPresenter> implements MainView {
    @App
    protected MainApplication mainApplication;

    @Inject
    protected MainPresenter presenter;

    @AfterInject
    void initInject() {
        DaggerMainComponent
                .builder()
                .applicationComponent(mainApplication.getApplicationComponent())
                .activityModule(new ActivityModule(this))
                .build()
                .inject(this);
    }

    @ViewById(R.id.textView)
    protected TextView textView;

    @AfterViews
    void init() {
        presenter.getData("AllProducts/Shirts/AoKhoac");
    }

    @NonNull
    @Override
    public MainPresenter createPresenter() {
        return presenter;
    }
}
