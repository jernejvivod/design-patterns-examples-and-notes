package si.jernej.dp.creational.staticfactorymethod;

public class MacOsLayout implements Layout
{
    @Override
    public String construct()
    {
        return "<%s>".formatted(MacOsLayout.class.getSimpleName());
    }
}
