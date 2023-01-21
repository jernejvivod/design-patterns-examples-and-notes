package si.jernej.dp.creational.factorymethod.room;

public interface Room
{
    void connect(Room room);

    String play();
}
