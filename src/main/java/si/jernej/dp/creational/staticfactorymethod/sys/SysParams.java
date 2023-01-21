package si.jernej.dp.creational.staticfactorymethod.sys;

import java.util.Random;

public final class SysParams
{
    public enum SysType
    {
        LINUX,
        MAC_OS,
        WINDOWS
    }

    private static final Random random = new Random();

    public static final SysType SYS_TYPE;

    static
    {
        SYS_TYPE = SysType.values()[random.nextInt(SysType.values().length)];
    }
}
