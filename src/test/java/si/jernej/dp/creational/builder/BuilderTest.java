package si.jernej.dp.creational.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BuilderTest
{
    @Test
    void testBuilder()
    {
        Computer randomComputer = Computer.Assembler.createRandom();
        Computer specificComputer = Computer.Assembler.createComputer(
                "test1",
                32,
                256,
                "test2"
        );

        String randomComputerExpectedSummary = """
                processor: random
                ram: 16
                storage: 256
                graphicsCard: null
                """;

        String specificComputerExpectedSummary = """
                processor: test1
                ram: 32
                storage: 256
                graphicsCard: test2
                """;

        Assertions.assertEquals(randomComputerExpectedSummary, randomComputer.summary());
        Assertions.assertEquals(specificComputerExpectedSummary, specificComputer.summary());
    }
}
