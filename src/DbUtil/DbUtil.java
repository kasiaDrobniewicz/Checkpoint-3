package DbUtil;

import java.sql.*;

public class DbUtil {

    private static Connection dbConnection = null;

    public static Connection getConnection() {

        if (dbConnection != null) {
            return dbConnection;
        }
        else {
            try {
                Class.forName("org.sqlite.JDBC");

                dbConnection = DriverManager.getConnection("jdbc:sqlite:db");
                dbConnection.setAutoCommit(false);
            } catch ( Exception e ) {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
            }
            return dbConnection;
        }
    }

    public static void closeDbConnection() {
        try {
            dbConnection.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }
}