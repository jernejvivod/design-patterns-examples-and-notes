package si.jernej.dp.creational.abstractfactory.elements.button;

public class WindowsButton extends Button
{
    @Override
    public String draw()
    {
        return "%s: <%s>".formatted(WindowsButton.class.getSimpleName(), this.getCaption());
    }
}
