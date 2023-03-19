package si.jernej.dp.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonTest
{
    @Test
    void testSingleton()
    {
        A a1 = A.getInstance();
        A a2 = A.getInstance();

        Assertions.assertSame(a1, a2);
    }
}
