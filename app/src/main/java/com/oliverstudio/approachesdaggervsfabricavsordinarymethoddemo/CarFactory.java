package com.oliverstudio.approachesdaggervsfabricavsordinarymethoddemo;

public class CarFactory {

    public static Car create() {
        EngineDetailOne engineDetailOne = new EngineDetailOne();
        Engine engine = new Engine(engineDetailOne);

        WheelsDetailOne wheelsDetailOne = new WheelsDetailOne();
        Wheels wheels = new Wheels(wheelsDetailOne);

        return new Car(engine, wheels);
    }

}
