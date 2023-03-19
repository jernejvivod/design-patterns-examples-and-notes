package si.jernej.dp.creational.lazyinitialization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import si.jernej.dp.creational.lazyinitialization.obj.ExpensiveObject;

class LazyInitializationTest
{
    @Test
    void test()
    {
        ExpensiveObject resFirstCall = LazySingleton.getExpensiveObject();
        ExpensiveObject resSecondCall = LazySingleton.getExpensiveObject();
        ExpensiveObject resThirdCall = LazySingleton.getExpensiveObject();

        Assertions.assertSame(resFirstCall, resSecondCall);
        Assertions.assertSame(resFirstCall, resThirdCall);
        Assertions.assertSame(resSecondCall, resThirdCall);
    }
}
