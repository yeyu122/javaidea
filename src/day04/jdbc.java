package day04;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/user";
        Connection conn = DriverManager.getConnection(url,"root","root");
        Statement statement=conn.createStatement();
        String sql="DELETE FROM dept WHERE id='1';";
        statement.execute(sql);
        conn.close();
    }
}
