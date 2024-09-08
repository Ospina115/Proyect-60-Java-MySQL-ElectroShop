package com.tiendaelectrica.infraestructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/tienda_electrica";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "rokoopercp";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
            return null;
        }
    }
}