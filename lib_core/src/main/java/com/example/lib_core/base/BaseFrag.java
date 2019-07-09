package com.example.lib_core.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
 *@Auther:苏格拉没有底
 *@Date: 2019/7/9
 *@Time:21:24
 *@Description:作用:
 * */public  abstract class BaseFrag  extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(bindLayoutId(),container,false);


        return view;
    }


    protected abstract int bindLayoutId();

    @Override
    public void onDestroy() {
        super.onDestroy();

    }
}
