package hd.java_mvp.domain.base;

import com.hannesdorfmann.mosby.mvp.MvpActivity;

import org.androidannotations.annotations.EActivity;

/**
 * Created by user1 on 6/13/2017.
 */

@EActivity
public abstract class BaseActivity<V extends BaseMvpView, P extends BasePresenter<V>> extends MvpActivity<V, P> {

}
