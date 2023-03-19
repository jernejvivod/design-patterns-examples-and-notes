package si.jernej.dp.creational.multiton;

import java.util.HashMap;
import java.util.Map;

public class Printer
{
    private static final int MAX_PRINTERS = 3;
    private static final Map<String, Printer> instances = new HashMap<>();

    private final String name;

    private Printer(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public static synchronized Printer getInstance(String name)
    {
        if (!instances.containsKey(name))
        {
            if (instances.size() >= MAX_PRINTERS)
                throw new MaxInstancesExceededException();

            instances.put(name, new Printer(name));
        }

        return instances.get(name);
    }
}
