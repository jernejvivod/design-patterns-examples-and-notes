package si.jernej.dp.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

import si.jernej.dp.creational.factorymethod.room.Room;

public abstract class MazeGame
{
    private final List<Room> rooms = new ArrayList<>();

    protected MazeGame(int numRooms)
    {
        if (numRooms <= 0)
            throw new IllegalArgumentException("Number of rooms must be greater than 0.");

        for (int i = 0; i < numRooms; i++)
        {
            rooms.add(makeRoom());
        }

        for (int i = 0; i < rooms.size() - 1; i++)
        {
            rooms.get(i).connect(rooms.get(i + 1));
        }
    }

    protected abstract Room makeRoom();

    public String play()
    {
        StringBuilder res = new StringBuilder();
        for (Room room : this.rooms)
        {
            res.append(room.play());
        }

        return res.toString();
    }
}
