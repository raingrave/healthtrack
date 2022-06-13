package br.fiap.healthtrack.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDatabaseConnection implements DatabaseConnectionInterface {
    private Connection connection;
    public OracleDatabaseConnection() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","rm92763","080882");
    }
    public Connection getConnection() {
        return this.connection;
    }
    public void disconnect() throws SQLException {
        this.connection.close();
    }
}
