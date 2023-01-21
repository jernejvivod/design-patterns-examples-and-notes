package si.jernej.dp.creational.dependencyinjection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import si.jernej.dp.creational.dependencyinjection.service.BasicStringDecorationService;
import si.jernej.dp.creational.dependencyinjection.service.FancyStringDecorationService;

class DependencyInjectionTest
{
    @Test
    void testDependencyInjection()
    {
        ClientUser clientUser = new ClientUser();
        String stringDecoratedBasic = clientUser.decorateString("test", "*", ClientUser.DecorationType.BASIC);
        String stringDecoratedFancy = clientUser.decorateString("test", "*", ClientUser.DecorationType.FANCY);

        Assertions.assertEquals("* test *", stringDecoratedBasic);
        Assertions.assertEquals("<<<*>> ^*^> test <^*^ <<*>>>", stringDecoratedFancy);
    }

    @Test
    void testDependencyInjectionWithServiceInjector()
    {
        Client2 client1 = new Client2();
        Client2 client2 = new Client2();

        ServiceInjector serviceInjector = new ServiceInjector();

        serviceInjector.injectServices(client1, new BasicStringDecorationService());
        serviceInjector.injectServices(client2, new FancyStringDecorationService());

        String res11 = client1.callService("test", "*");
        String res21 = client2.callService("test", "*");

        Assertions.assertEquals("* test *", res11);
        Assertions.assertEquals("<<<*>> ^*^> test <^*^ <<*>>>", res21);

        serviceInjector.changeServiceForClients(new BasicStringDecorationService());

        String res12 = client1.callService("test", "*");
        String res22 = client2.callService("test", "*");

        Assertions.assertEquals("* test *", res12);
        Assertions.assertEquals("* test *", res22);
    }
}
