package com.oliverstudio.approachesdaggervsfabricavsordinarymethoddemo;

import android.app.Application;

import com.oliverstudio.approachesdaggervsfabricavsordinarymethoddemo.di.AppComponent;
import com.oliverstudio.approachesdaggervsfabricavsordinarymethoddemo.di.DaggerAppComponent;

public class App extends Application {

    private static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    public static AppComponent getComponent() {
        return component;
    }

}
