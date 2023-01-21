package si.jernej.dp.creational.abstractfactory.elements.button;

public class MacOsButton extends Button
{
    @Override
    public String draw()
    {
        return "%s: <%s>".formatted(MacOsButton.class.getSimpleName(), this.getCaption());
    }
}
