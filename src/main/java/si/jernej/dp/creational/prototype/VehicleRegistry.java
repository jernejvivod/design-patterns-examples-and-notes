package si.jernej.dp.creational.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRegistry
{
    private final Map<String, Vehicle> registry = new HashMap<>();

    public void add(String key, Vehicle vehicle)
    {
        registry.put(key, vehicle);
    }

    public Optional<Vehicle> get(String key)
    {
        return Optional.ofNullable(registry.get(key));
    }
}
