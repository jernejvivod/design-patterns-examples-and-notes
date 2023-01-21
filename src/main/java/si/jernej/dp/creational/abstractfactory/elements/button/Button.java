package si.jernej.dp.creational.abstractfactory.elements.button;

public abstract class Button
{
    private String caption;

    public String getCaption()
    {
        return caption;
    }

    public void setCaption(String caption)
    {
        this.caption = caption;
    }

    public abstract String draw();
}
