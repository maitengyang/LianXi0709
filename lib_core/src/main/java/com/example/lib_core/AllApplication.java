package com.example.lib_core;

import android.app.Application;
import android.content.Context;

/*
 *@Auther:苏格拉没有底
 *@Date: 2019/7/9
 *@Time:21:18
 *@Description:作用:
 * */public class AllApplication extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
