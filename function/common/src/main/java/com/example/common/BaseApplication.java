package com.example.common;

import android.app.Application;

import androidx.multidex.MultiDex;

public class BaseApplication extends Application {

    private static BaseApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        MultiDex.install(this);
    }

    public static BaseApplication getApplication(){
        return application;
    }
}
