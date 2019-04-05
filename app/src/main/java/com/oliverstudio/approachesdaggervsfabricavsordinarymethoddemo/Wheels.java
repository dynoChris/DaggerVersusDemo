package com.oliverstudio.approachesdaggervsfabricavsordinarymethoddemo;

import javax.inject.Inject;

public class Wheels {

    private WheelsDetailOne mWheelsDetailOne;

    @Inject
    public Wheels(WheelsDetailOne wheelsDetailOne) {
        mWheelsDetailOne = wheelsDetailOne;
    }
}
