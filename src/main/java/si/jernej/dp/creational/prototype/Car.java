package si.jernej.dp.creational.prototype;

public class Car extends Vehicle
{
    private int topSpeed;
    private NavigationSystem navigationSystem;

    public Car()
    {
    }

    private Car(Car car)
    {
        super(car);
        this.topSpeed = car.topSpeed;
        this.navigationSystem = car.navigationSystem.copy();  // if we just assigned navigationSystem, we would be making a shallow copy
    }

    public int getTopSpeed()
    {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed)
    {
        this.topSpeed = topSpeed;
    }

    public NavigationSystem getNavigationSystem()
    {
        return navigationSystem;
    }

    public void setNavigationSystem(NavigationSystem navigationSystem)
    {
        this.navigationSystem = navigationSystem;
    }

    @Override
    public Car copy()
    {
        return new Car(this);
    }
}
