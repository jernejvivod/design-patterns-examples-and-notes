package si.jernej.dp.creational.objectpool;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import si.jernej.dp.creational.objectpool.exception.ConnectionPoolEmptyException;

class ObjectPoolTest
{
    @Test
    void testObjectPool()
    {
        ConnectionPool connectionPool = new ConnectionPool(3);
        Connection connection1 = connectionPool.getConnection();
        Connection connection2 = connectionPool.getConnection();
        Connection connection3 = connectionPool.getConnection();

        Assertions.assertNotSame(connection1, connection2);
        Assertions.assertNotSame(connection1, connection3);
        Assertions.assertNotSame(connection2, connection3);

        Assertions.assertThrows(ConnectionPoolEmptyException.class, connectionPool::getConnection);

        connectionPool.releaseConnection(connection3);

        Connection connection4 = connectionPool.getConnection();

        Assertions.assertSame(connection3, connection4);
    }
}
