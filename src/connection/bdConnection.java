package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class bdConnection {
    private static final String URL = "jdbc:sqlite:bookingBd.sqlite";
    public static Connection getConnection() {
        Connection con = null;
        try {
            //Driver
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(URL);
            System.out.println("Connection was successfully established.");
        } catch (ClassNotFoundException e) {
            //Driver exception
            System.err.println("SQLite JDBC driver not found: " + e.getMessage());
        } catch (SQLException except) {
            //Bd exception
            System.err.println("The connection wasn't found. " + except.getMessage());
        }
        return con;
    }
}
