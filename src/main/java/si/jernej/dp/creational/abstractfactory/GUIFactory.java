package si.jernej.dp.creational.abstractfactory;

import si.jernej.dp.creational.abstractfactory.elements.button.Button;
import si.jernej.dp.creational.abstractfactory.elements.button.LinuxButton;
import si.jernej.dp.creational.abstractfactory.elements.button.MacOsButton;
import si.jernej.dp.creational.abstractfactory.elements.button.WindowsButton;
import si.jernej.dp.creational.abstractfactory.elements.panel.LinuxPanel;
import si.jernej.dp.creational.abstractfactory.elements.panel.MacOsPanel;
import si.jernej.dp.creational.abstractfactory.elements.panel.Panel;
import si.jernej.dp.creational.abstractfactory.elements.panel.WindowsPanel;
import si.jernej.dp.creational.abstractfactory.sys.SysParams;

/**
 * The Abstract Factory Pattern provides a way to encapsulate a group of individual factories that have a common theme.
 * The client does not know (nor care) about which concrete objects it gets from each of these internal factories since it uses only the generic interfaces.
 * This separates the details of implementation of a set of objects from its general usage.
 */
public abstract class GUIFactory
{
    // static method for obtaining the factory (contains the logic for selecting the factory to create)
    public static GUIFactory getFactory()
    {
        SysParams.SysType sysType = SysParams.SYS_TYPE;

        return switch (sysType)
                {
                    case LINUX -> new LinuxFactory();
                    case MAC_OS -> new MacOSFactory();
                    case WINDOWS -> new WindowsFactory();
                };
    }

    // abstract getButton factory method overriden in concrete factories
    public abstract Button getButton();

    public abstract Panel getPanel();

    // concrete factories
    private static class LinuxFactory extends GUIFactory
    {
        @Override
        public Button getButton()
        {
            return new LinuxButton();
        }

        @Override
        public Panel getPanel()
        {
            return new LinuxPanel();
        }
    }

    private static class MacOSFactory extends GUIFactory
    {
        @Override
        public Button getButton()
        {
            return new MacOsButton();
        }

        @Override
        public Panel getPanel()
        {
            return new MacOsPanel();
        }
    }

    private static class WindowsFactory extends GUIFactory
    {
        @Override
        public Button getButton()
        {
            return new WindowsButton();
        }

        @Override
        public Panel getPanel()
        {
            return new WindowsPanel();
        }
    }
}
