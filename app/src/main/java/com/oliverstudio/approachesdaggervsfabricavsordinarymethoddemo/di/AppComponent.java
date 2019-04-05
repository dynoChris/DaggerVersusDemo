package com.oliverstudio.approachesdaggervsfabricavsordinarymethoddemo.di;

import com.oliverstudio.approachesdaggervsfabricavsordinarymethoddemo.MainActivity;

import dagger.Component;

@Component(modules = CarModule.class)
public interface AppComponent {
    void injectMainActivity(MainActivity mainActivity);
}
