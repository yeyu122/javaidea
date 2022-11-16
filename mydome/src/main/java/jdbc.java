import java.sql.*;

public class jdbc {
    public static void main(String[] args) throws SQLException {
        String url ="jdbc:mysql://localhost:3306/user";
        Connection conn= DriverManager.getConnection(url,"root","root");
        Statement statement=conn.createStatement();
//        String sql="INSERT INTO dept VALUES('6','啊啊大V','的总股本');";
        ResultSet resultSet= statement.executeQuery("SELECT * FROM emp;");
        while (resultSet.next()){
            int id=resultSet.getInt(1);
            String name=resultSet.getString(2);
            float sal=resultSet.getFloat(6);
            System.out.println(id+"--"+name+"工资:"+sal);
        }
//        String sql="SELECT * FROM emp;";
//        statement.execute(sql);
//        System.out.println(sql);
        conn.close();
    }
}
