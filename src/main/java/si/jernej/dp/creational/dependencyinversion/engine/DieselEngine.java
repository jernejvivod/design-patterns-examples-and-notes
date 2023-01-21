package si.jernej.dp.creational.dependencyinversion.engine;

public class DieselEngine implements Engine
{
    @Override
    public String start()
    {
        return "starting diesel engine";
    }
}
