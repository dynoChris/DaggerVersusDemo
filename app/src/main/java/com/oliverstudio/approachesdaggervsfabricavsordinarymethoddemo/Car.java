package com.oliverstudio.approachesdaggervsfabricavsordinarymethoddemo;

import android.util.Log;

public class Car {

    private Engine mEngine;
    private Wheels mWheels;

    public Car(Engine engine, Wheels wheels) {
        mEngine = engine;
        mWheels = wheels;
    }

    public void drive() {
        Log.d("devptag", "driving");
    }
}
