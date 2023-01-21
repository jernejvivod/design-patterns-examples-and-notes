package si.jernej.dp.creational.prototype;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrototypeTest
{
    @Test
    void testCopy()
    {
        int topSpeed = 230;
        String brand = "Volvo";
        String color = "grey";
        String model = "V90";
        String navigationSystemKind = "Alpha";

        // suffix to use when updating properties of type String
        String suffixForUpdate = "Updated";

        // Create initial instance.
        Car car = new Car();
        car.setTopSpeed(topSpeed);
        car.setBrand(brand);
        car.setColor(color);
        car.setModel(model);

        NavigationSystem navigationSystem1 = new NavigationSystem();
        navigationSystem1.setKind(navigationSystemKind);
        car.setNavigationSystem(navigationSystem1);

        // Create copy.
        Car carCopy = car.copy();

        // Test initial instance and copy before updating copy.
        Assertions.assertEquals(topSpeed, car.getTopSpeed());
        Assertions.assertEquals(brand, car.getBrand());
        Assertions.assertEquals(color, car.getColor());
        Assertions.assertEquals(model, car.getModel());
        Assertions.assertEquals(navigationSystemKind, car.getNavigationSystem().getKind());

        Assertions.assertEquals(topSpeed, carCopy.getTopSpeed());
        Assertions.assertEquals(brand, carCopy.getBrand());
        Assertions.assertEquals(color, carCopy.getColor());
        Assertions.assertEquals(model, carCopy.getModel());
        Assertions.assertEquals(navigationSystemKind, carCopy.getNavigationSystem().getKind());

        // Update copy.
        carCopy.setTopSpeed(carCopy.getTopSpeed() + 10);
        carCopy.setBrand(carCopy.getBrand() + suffixForUpdate);
        carCopy.setColor(carCopy.getColor() + suffixForUpdate);
        carCopy.setModel(carCopy.getModel() + suffixForUpdate);
        carCopy.getNavigationSystem().setKind(carCopy.getNavigationSystem().getKind() + suffixForUpdate);

        // Test copy properties.
        Assertions.assertEquals(topSpeed + 10, carCopy.getTopSpeed());
        Assertions.assertEquals(brand + suffixForUpdate, carCopy.getBrand());
        Assertions.assertEquals(color + suffixForUpdate, carCopy.getColor());
        Assertions.assertEquals(model + suffixForUpdate, carCopy.getModel());
        Assertions.assertEquals(navigationSystemKind + suffixForUpdate, carCopy.getNavigationSystem().getKind());

        // Make sure properties of initial instance have not changed.
        Assertions.assertEquals(topSpeed, car.getTopSpeed());
        Assertions.assertEquals(brand, car.getBrand());
        Assertions.assertEquals(color, car.getColor());
        Assertions.assertEquals(model, car.getModel());
        Assertions.assertEquals(navigationSystemKind, car.getNavigationSystem().getKind());
    }

    @Test
    void testCopyVehiclesList()
    {
        Car car = new Car();
        car.setTopSpeed(230);
        car.setBrand("Volvo");
        car.setColor("grey");
        car.setModel("V90");

        NavigationSystem navigationSystem1 = new NavigationSystem();
        navigationSystem1.setKind("Alpha");
        car.setNavigationSystem(navigationSystem1);

        Bus bus = new Bus();
        bus.setBrand("MAN");
        bus.setColor("White");
        bus.setDoors(2);
        bus.setModel("Lion's City");

        List<Vehicle> vehicles = List.of(car, bus);
        List<Vehicle> vehiclesCopy = Vehicle.copyVehiclesList(vehicles);

        Assertions.assertEquals(2, vehiclesCopy.size());
        Assertions.assertTrue(vehiclesCopy.get(0) instanceof Car);
        Assertions.assertTrue(vehiclesCopy.get(1) instanceof Bus);

        Assertions.assertNotEquals(vehicles.get(0), vehiclesCopy.get(0));
        Assertions.assertNotEquals(vehicles.get(1), vehiclesCopy.get(1));
    }
}
