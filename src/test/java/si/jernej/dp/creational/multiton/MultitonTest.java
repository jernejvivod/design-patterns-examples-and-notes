package si.jernej.dp.creational.multiton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultitonTest
{
    @Test
    void testMultiton()
    {
        Printer printer1 = Printer.getInstance("a");
        Printer printer2 = Printer.getInstance("b");
        Printer printer3 = Printer.getInstance("c");
        Printer printer4 = Printer.getInstance("a");

        Assertions.assertEquals("a", printer1.getName());
        Assertions.assertEquals("b", printer2.getName());
        Assertions.assertEquals("c", printer3.getName());
        Assertions.assertEquals("a", printer4.getName());

        Assertions.assertThrows(MaxInstancesExceededException.class, () -> Printer.getInstance("d"));
    }
}
