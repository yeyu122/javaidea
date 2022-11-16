import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dautil {
    public static Connection getconn() throws SQLException {
        String url ="jdbc:mysql://localhost:3306/user";
        Connection conn= DriverManager.getConnection(url,"root","root");
        return conn;
    }
    public static Statement getstste() throws SQLException {
        String url ="jdbc:mysql://localhost:3306/user";
        Connection conn= DriverManager.getConnection(url,"root","root");
        Statement statement=conn.createStatement();
        return statement;
    }
}
