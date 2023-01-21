package si.jernej.dp.creational.dependencyinjection;

import si.jernej.dp.creational.dependencyinjection.service.StringDecorationService;

public class Client2 implements HasServiceSetter
{
    private StringDecorationService stringDecorationService;

    @Override
    public void setService(StringDecorationService stringDecorationService)
    {
        this.stringDecorationService = stringDecorationService;
    }

    public String callService(String string, String decoration)
    {
        return this.stringDecorationService.decorateString(string, decoration);
    }
}
