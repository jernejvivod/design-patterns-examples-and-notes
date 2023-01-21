package si.jernej.dp.creational.dependencyinjection;

import si.jernej.dp.creational.dependencyinjection.service.StringDecorationService;

public class Client
{
    private final StringDecorationService stringDecorationService;

    public Client(StringDecorationService stringDecorationService)
    {
        this.stringDecorationService = stringDecorationService;
    }

    public String callService(String string, String decoration)
    {
        return this.stringDecorationService.decorateString(string, decoration);
    }
}
