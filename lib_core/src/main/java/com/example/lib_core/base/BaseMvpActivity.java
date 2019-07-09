package com.example.lib_core.base;

/*
 *@Auther:苏格拉没有底
 *@Date: 2019/7/9
 *@Time:21:30
 *@Description:作用:
 * */public abstract class BaseMvpActivity<P extends BasePresenter> extends BaseActivity {
    public M model;
    public P presenter;
    @Override
    protected void initData() {

        presenter = (P) initPresenter();
        if (presenter!=null){
            model = (M) presenter.getModel();
            if (model!=null){
                //绑定
                presenter.attach(model,this);

            }
        }

        init();
    }

    protected abstract void init();



    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter!=null){
            //解绑
            presenter.dettach();
        }
    }
}
