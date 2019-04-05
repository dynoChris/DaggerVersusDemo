package com.oliverstudio.approachesdaggervsfabricavsordinarymethoddemo;

import javax.inject.Inject;

public class Engine {

    private EngineDetailOne mEngineDetailOne;

    @Inject
    public Engine(EngineDetailOne engineDetailOne) {
        mEngineDetailOne = engineDetailOne;
    }
}
