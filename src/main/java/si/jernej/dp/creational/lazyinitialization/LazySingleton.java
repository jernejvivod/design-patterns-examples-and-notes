package si.jernej.dp.creational.lazyinitialization;

import si.jernej.dp.creational.lazyinitialization.obj.ExpensiveObject;

public final class LazySingleton
{
    private static ExpensiveObject expensiveObject;

    private LazySingleton()
    {
    }

    public static ExpensiveObject getExpensiveObject()
    {
        if (expensiveObject == null)
        {
            expensiveObject = ExpensiveObject.create();
        }
        return expensiveObject;
    }
}
