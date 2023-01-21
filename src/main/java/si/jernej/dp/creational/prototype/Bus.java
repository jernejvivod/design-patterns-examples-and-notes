package si.jernej.dp.creational.prototype;

public class Bus extends Vehicle
{
    private int doors;

    public Bus()
    {
    }

    private Bus(Bus bus)
    {
        super(bus);
        this.doors = bus.doors;
    }

    public int getDoors()
    {
        return doors;
    }

    public void setDoors(int doors)
    {
        this.doors = doors;
    }

    @Override
    public Vehicle copy()
    {
        return new Bus(this);
    }
}
