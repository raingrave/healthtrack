package br.fiap.healthtrack.database;

import java.sql.SQLException;
import java.sql.Connection;

public interface DatabaseConnectionInterface {
    public Connection getConnection() throws SQLException;
    public void disconnect() throws SQLException;
}
