package si.jernej.dp.creational.staticfactorymethod;

public class LinuxLayout implements Layout
{
    @Override
    public String construct()
    {
        return "<%s>".formatted(LinuxLayout.class.getSimpleName());
    }
}
