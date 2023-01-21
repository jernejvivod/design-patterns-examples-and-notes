package si.jernej.dp.creational.staticfactorymethod;

public class WindowsLayout implements Layout
{
    @Override
    public String construct()
    {
        return "<%s>".formatted(WindowsLayout.class.getSimpleName());
    }
}
