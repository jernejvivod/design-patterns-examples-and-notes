package si.jernej.dp.creational.singleton;

public class A
{
    private static A instance;

    private final int val;

    private A(int val)
    {
        this.val = val;
    }

    public int getVal()
    {
        return val;
    }

    static
    {
        A.instance = new A(7);
    }

    public static A getInstance()
    {
        return instance;
    }
}
