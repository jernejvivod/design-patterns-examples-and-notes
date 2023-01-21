package si.jernej.dp.creational.prototype;

public class NavigationSystem
{
    private String kind;

    public NavigationSystem()
    {
    }

    public NavigationSystem(NavigationSystem navigationSystem)
    {
        this.kind = navigationSystem.kind;
    }

    public String getKind()
    {
        return kind;
    }

    public void setKind(String kind)
    {
        this.kind = kind;
    }

    public NavigationSystem copy()
    {
        return new NavigationSystem(this);
    }
}
