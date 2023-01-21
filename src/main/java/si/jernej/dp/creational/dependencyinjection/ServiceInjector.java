package si.jernej.dp.creational.dependencyinjection;

import java.util.HashSet;
import java.util.Set;

import si.jernej.dp.creational.dependencyinjection.service.StringDecorationService;

public class ServiceInjector
{
    private final Set<HasServiceSetter> clients = new HashSet<>();

    public void injectServices(HasServiceSetter client, StringDecorationService stringDecorationService)
    {
        clients.add(client);
        client.setService(stringDecorationService);
    }

    public void changeServiceForClients(StringDecorationService stringDecorationService)
    {
        clients.forEach(c -> c.setService(stringDecorationService));
    }
}
