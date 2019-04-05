package com.oliverstudio.approachesdaggervsfabricavsordinarymethoddemo.di;

import com.oliverstudio.approachesdaggervsfabricavsordinarymethoddemo.Car;
import com.oliverstudio.approachesdaggervsfabricavsordinarymethoddemo.Engine;
import com.oliverstudio.approachesdaggervsfabricavsordinarymethoddemo.EngineDetailOne;
import com.oliverstudio.approachesdaggervsfabricavsordinarymethoddemo.Wheels;
import com.oliverstudio.approachesdaggervsfabricavsordinarymethoddemo.WheelsDetailOne;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    @Provides
    Car provideCar(Engine engine, Wheels wheels) {
        return new Car(engine, wheels);
    }

    @Provides
    Engine provideEngine(EngineDetailOne engineDetailOne) {
        return new Engine(engineDetailOne);
    }

    @Provides
    Wheels provideWheels(WheelsDetailOne wheelsDetailOne) {
        return new Wheels(wheelsDetailOne);
    }

    @Provides
    EngineDetailOne provideEngineDetailOne() {
        return new EngineDetailOne();
    }

    @Provides
    WheelsDetailOne provideWheelsDetailOne() {
        return new WheelsDetailOne();
    }

}
