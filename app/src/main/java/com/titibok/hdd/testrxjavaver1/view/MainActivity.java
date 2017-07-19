package com.titibok.hdd.testrxjavaver1.view;

import android.support.annotation.NonNull;
import android.widget.TextView;

import com.titibok.hdd.testrxjavaver1.MainApplication;
import com.titibok.hdd.testrxjavaver1.R;
import com.titibok.hdd.testrxjavaver1.base.BaseActivity;
import com.titibok.hdd.testrxjavaver1.module.ActivityModule;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.App;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import javax.inject.Inject;

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

    //----------------------------------------------------------------------------------------------
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
