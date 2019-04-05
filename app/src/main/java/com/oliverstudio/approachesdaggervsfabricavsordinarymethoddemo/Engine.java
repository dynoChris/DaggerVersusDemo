package com.oliverstudio.approachesdaggervsfabricavsordinarymethoddemo;

import android.util.Log;

import javax.inject.Inject;

public class Engine {

    private EngineDetailOne mEngineDetailOne;

    public Engine(EngineDetailOne engineDetailOne) {
        mEngineDetailOne = engineDetailOne;
        Log.d("devptag", "add Engine");
    }
}
