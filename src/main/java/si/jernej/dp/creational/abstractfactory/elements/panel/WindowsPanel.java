package si.jernej.dp.creational.abstractfactory.elements.panel;

public class WindowsPanel extends Panel
{
    @Override
    public String draw()
    {
        return "%s: <%s>".formatted(WindowsPanel.class.getSimpleName(), this.getTitle());
    }
}
