package si.jernej.dp.creational.dependencyinversion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import si.jernej.dp.creational.dependencyinversion.engine.DieselEngine;
import si.jernej.dp.creational.dependencyinversion.engine.ElectricEngine;
import si.jernej.dp.creational.dependencyinversion.engine.GasolineEngine;

class DependencyInversionTest
{
    @Test
    void testDepenencyInversion()
    {
        Car electricCar = new Car(new ElectricEngine());
        Car gasolineCar = new Car(new GasolineEngine());
        Car dieselCar = new Car(new DieselEngine());

        Assertions.assertEquals("starting electric engine", electricCar.startEngine());
        Assertions.assertEquals("starting gasoline engine", gasolineCar.startEngine());
        Assertions.assertEquals("starting diesel engine", dieselCar.startEngine());
    }
}
