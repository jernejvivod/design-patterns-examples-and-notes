package si.jernej.dp.creational.dependencyinjection;

import si.jernej.dp.creational.dependencyinjection.service.BasicStringDecorationService;
import si.jernej.dp.creational.dependencyinjection.service.FancyStringDecorationService;

public class ClientUser
{
    public enum DecorationType
    {
        BASIC,
        FANCY
    }

    public String decorateString(String string, String decoration, DecorationType decorationType)
    {
        Client client = switch (decorationType)
                {
                    case BASIC -> new Client(new BasicStringDecorationService());
                    case FANCY -> new Client(new FancyStringDecorationService());
                };

        return client.callService(string, decoration);
    }
}
