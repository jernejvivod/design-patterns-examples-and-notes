package si.jernej.dp.creational.dependencyinversion.engine;

public class GasolineEngine implements Engine
{
    @Override
    public String start()
    {
        return "starting gasoline engine";
    }
}
