package si.jernej.dp.creational.lazyinitialization.obj;

public class ExpensiveObject
{
    private final int a;

    private ExpensiveObject(int a)
    {
        this.a = a;
    }

    public int getA()
    {
        return a;
    }

    public static ExpensiveObject create()
    {
        return new ExpensiveObject(7);
    }
}
