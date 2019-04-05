package com.oliverstudio.approachesdaggervsfabricavsordinarymethoddemo;

import android.util.Log;

import javax.inject.Inject;

public class Wheels {

    private WheelsDetailOne mWheelsDetailOne;

    public Wheels(WheelsDetailOne wheelsDetailOne) {
        mWheelsDetailOne = wheelsDetailOne;
        Log.d("devptag", "add Wheels");
    }
}
