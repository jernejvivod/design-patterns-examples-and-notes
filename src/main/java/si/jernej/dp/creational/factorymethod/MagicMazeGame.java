package si.jernej.dp.creational.factorymethod;

import si.jernej.dp.creational.factorymethod.room.MagicRoom;
import si.jernej.dp.creational.factorymethod.room.Room;

public class MagicMazeGame extends MazeGame
{
    public MagicMazeGame(int numRooms)
    {
        super(numRooms);
    }

    @Override
    protected Room makeRoom()
    {
        return new MagicRoom();
    }
}
