package si.jernej.dp.creational.staticfactorymethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import si.jernej.dp.creational.abstractfactory.sys.SysParams;

class StaticFactoryMethodTest
{
    @Test
    void testFactoryMethod()
    {
        Layout factory = Layout.factory();
        String res = factory.construct();

        String expected = switch (SysParams.SYS_TYPE)
                {
                    case LINUX -> "<LinuxLayout>";
                    case MAC_OS -> "<MacOsLayout>";
                    case WINDOWS -> "<WindowsLayout>";
                };

        Assertions.assertEquals(expected, res);
    }
}
