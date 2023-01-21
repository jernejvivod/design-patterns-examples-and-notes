package si.jernej.dp.creational.abstractfactory.elements.panel;

public class MacOsPanel extends Panel
{
    @Override
    public String draw()
    {
        return "%s: <%s>".formatted(MacOsPanel.class.getSimpleName(), this.getTitle());
    }
}
