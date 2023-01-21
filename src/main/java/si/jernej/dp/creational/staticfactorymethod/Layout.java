package si.jernej.dp.creational.staticfactorymethod;

import si.jernej.dp.creational.staticfactorymethod.sys.SysParams;

public interface Layout
{
    String construct();

    static Layout factory()
    {
        return switch (SysParams.SYS_TYPE)
        {
            case LINUX ->  new LinuxLayout();
            case MAC_OS -> new MacOsLayout();
            case WINDOWS -> new WindowsLayout();
        };
    }
}
