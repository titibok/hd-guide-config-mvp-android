package hd.java_mvp.domain.base;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.hannesdorfmann.mosby.mvp.MvpPresenter;

/**
 * Created by user1 on 6/13/2017.
 */

public class BasePresenter<V extends BaseMvpView> extends MvpBasePresenter<V> implements MvpPresenter<V> {

}
