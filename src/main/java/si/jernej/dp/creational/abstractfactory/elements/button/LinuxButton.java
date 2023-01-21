package si.jernej.dp.creational.abstractfactory.elements.button;

public class LinuxButton extends Button
{
    @Override
    public String draw()
    {
        return "%s: <%s>".formatted(LinuxButton.class.getSimpleName(), this.getCaption());
    }
}
