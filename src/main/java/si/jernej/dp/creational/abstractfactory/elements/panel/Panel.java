package si.jernej.dp.creational.abstractfactory.elements.panel;

public abstract class Panel
{
    private String title;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public abstract String draw();
}
