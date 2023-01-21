package si.jernej.dp.creational.prototype;

import java.util.List;

public abstract class Vehicle
{
    private String brand;
    private String model;
    private String color;

    protected Vehicle()
    {
    }

    protected Vehicle(Vehicle vehicle)
    {
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public static List<Vehicle> copyVehiclesList(List<Vehicle> vehicles)
    {
        return vehicles.stream().map(Vehicle::copy).toList();
    }

    public abstract Vehicle copy();
}
