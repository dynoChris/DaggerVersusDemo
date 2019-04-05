package com.oliverstudio.approachesdaggervsfabricavsordinarymethoddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EngineDetailOne engineDetailOne = new EngineDetailOne();
        Engine engine = new Engine(engineDetailOne);

        WheelsDetailOne wheelsDetailOne = new WheelsDetailOne();
        Wheels wheels = new Wheels(wheelsDetailOne);

        Car car = new Car(engine, wheels);
    }
}
