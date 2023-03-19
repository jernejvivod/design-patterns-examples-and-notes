package si.jernej.dp.creational.objectpool;

import java.util.LinkedList;
import java.util.List;

import si.jernej.dp.creational.objectpool.exception.ConnectionPoolEmptyException;
import si.jernej.dp.creational.objectpool.exception.ConnectionPoolSizeExceededException;

public class ConnectionPool
{
    private final int poolSize;
    private final List<Connection> connections;

    public ConnectionPool(int poolSize)
    {
        this.poolSize = poolSize;
        connections = new LinkedList<>();
        for (int i = 0; i < poolSize; i++)
        {
            connections.add(new Connection());
        }
    }

    public Connection getConnection()
    {
        if (connections.isEmpty())
            throw new ConnectionPoolEmptyException();

        return connections.remove(0);
    }

    public void releaseConnection(Connection connection)
    {
        if (connections.size() >= poolSize)
            throw new ConnectionPoolSizeExceededException();

        connections.add(connection);
    }
}
