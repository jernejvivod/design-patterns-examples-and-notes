package si.jernej.dp.creational.factorymethod.room;

public class OrdinaryRoom implements Room
{
    private Room nextRoom;

    @Override
    public void connect(Room room)
    {
        this.nextRoom = room;
    }

    @Override
    public String play()
    {
        return MagicRoom.class.getSimpleName() + (this.nextRoom != null ? " <with next>" : "");
    }
}
