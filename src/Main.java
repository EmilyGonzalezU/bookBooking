import connection.bdConnection;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection con = bdConnection.getConnection();
        if (con != null) {
            System.out.println("Realizando operaciones en la base de datos...");
        } else {
            System.out.println("No se pudo establecer la conexión con la base de datos.");
        }
    }
}