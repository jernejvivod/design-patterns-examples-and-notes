package si.jernej.dp.creational.dependencyinversion.engine;

public class ElectricEngine implements Engine
{
    @Override
    public String start()
    {
        return "starting electric engine";
    }
}
