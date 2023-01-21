package si.jernej.dp.creational.factorymethod;

import si.jernej.dp.creational.factorymethod.room.OrdinaryRoom;
import si.jernej.dp.creational.factorymethod.room.Room;

public class OrdinaryMazeGame extends MazeGame
{
    public OrdinaryMazeGame(int numRooms)
    {
        super(numRooms);
    }

    @Override
    protected Room makeRoom()
    {
        return new OrdinaryRoom();
    }
}
