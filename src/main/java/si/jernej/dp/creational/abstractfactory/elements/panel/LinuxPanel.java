package si.jernej.dp.creational.abstractfactory.elements.panel;

public class LinuxPanel extends Panel
{
    @Override
    public String draw()
    {
        return "%s: <%s>".formatted(LinuxPanel.class.getSimpleName(), this.getTitle());
    }
}
