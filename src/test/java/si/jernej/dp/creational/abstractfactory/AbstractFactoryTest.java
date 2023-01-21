package si.jernej.dp.creational.abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import si.jernej.dp.creational.abstractfactory.elements.button.Button;
import si.jernej.dp.creational.abstractfactory.elements.panel.Panel;
import si.jernej.dp.creational.abstractfactory.sys.SysParams;

class AbstractFactoryTest
{
    @Test
    void testAbstractFactory()
    {
        GUIFactory factory = GUIFactory.getFactory();

        Button button = factory.getButton();
        button.setCaption("test");
        String resButton = button.draw();

        Panel panel = factory.getPanel();
        panel.setTitle("test");
        String resPanel = panel.draw();

        String expectedButtonDrawResult = switch (SysParams.SYS_TYPE)
                {
                    case LINUX -> "LinuxButton: <test>";
                    case MAC_OS -> "MacOsButton: <test>";
                    case WINDOWS -> "WindowsButton: <test>";
                };

        String expectedPanelDrawResult = switch (SysParams.SYS_TYPE)
                {
                    case LINUX -> "LinuxPanel: <test>";
                    case MAC_OS -> "MacOsPanel: <test>";
                    case WINDOWS -> "WindowsPanel: <test>";
                };

        Assertions.assertEquals(expectedButtonDrawResult, resButton);
        Assertions.assertEquals(expectedPanelDrawResult, resPanel);
    }
}
