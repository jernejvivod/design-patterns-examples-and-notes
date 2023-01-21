package si.jernej.dp.creational.dependencyinversion;

import si.jernej.dp.creational.dependencyinversion.engine.Engine;

public class Car
{
    private final Engine engine;

    // Use dependency injection to provide a specific Engine implementation.
    // Note that the 'high-level' Car class depends on an abstraction, an interface instead of a concrete implementation.
    // The 'low-level' classes implement the Engine interface.
    public Car(Engine engine)
    {
        this.engine = engine;
    }

    // Call method defined in Engine interface.
    public String startEngine()
    {
        return this.engine.start();
    }
}
