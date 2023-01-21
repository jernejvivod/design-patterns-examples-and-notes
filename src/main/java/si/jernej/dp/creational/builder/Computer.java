package si.jernej.dp.creational.builder;

/**
 * The builder pattern is useful when there are operations that are valid during construction that are not valid once the object is built.
 * This is most obviously the case for building immutable objects, but it also applies very often when only some aspects of the object are immutable.
 */
public class Computer
{
    private final String processor;
    private final int ram;
    private final int storage;
    private final String graphicsCard;

    private static class Builder
    {
        private String processor;
        private int ram;
        private int storage;
        private String graphicsCard;

        public Builder processor(String processor)
        {
            this.processor = processor;
            return this;
        }

        public Builder ram(int ram)
        {
            this.ram = ram;
            return this;
        }

        public Builder storage(int storage)
        {
            this.storage = storage;
            return this;
        }

        public Builder graphicsCard(String graphicsCard)
        {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Computer build()
        {
            return new Computer(this);
        }
    }

    private Computer(Builder builder)
    {
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }

    public String summary()
    {
        return """
                processor: %s
                ram: %d
                storage: %d
                graphicsCard: %s
                """.formatted(this.processor, this.ram, this.storage, this.graphicsCard);
    }

    // The director knows how to use the builder methods to construct objects. It can be similar to the Abstract Factory pattern
    // in the sence that it can provide different methods that construct different kinds of Computer instances using the builder.
    public static final class Assembler
    {
        private Assembler()
        {
        }

        public static Computer createComputer(String processor, int ram, int storage, String graphicsCard)
        {
            return new Computer.Builder()  // only the director knows this logic
                    .processor(processor)
                    .ram(ram)
                    .storage(storage)
                    .graphicsCard(graphicsCard)
                    .build();
        }

        public static Computer createRandom()
        {
            return new Builder()
                    .processor("random")
                    .ram(16)
                    .storage(256)
                    .build();
        }
    }
}
