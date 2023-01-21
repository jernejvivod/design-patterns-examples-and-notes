package si.jernej.dp.creational.dependencyinjection.service;

public class FancyStringDecorationService implements StringDecorationService
{
    @Override
    public String decorateString(String string, String decoration)
    {
        return "<<<%1$s>> ^%1$s^> %2$s <^%1$s^ <<%1$s>>>".formatted(decoration, string);
    }
}
