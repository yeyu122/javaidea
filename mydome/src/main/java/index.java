import java.sql.*;
import java.util.Scanner;

public class index {
    public static void main(String[] args) throws SQLException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name=sc.next();
        String url ="jdbc:mysql://localhost:3306/user";
        Connection conn= DriverManager.getConnection(url,"root","root");
        Statement statement=conn.createStatement();
        ResultSet rs= statement.executeQuery("SELECT PASSWORD FROM login WHERE USER='"+name+"';");
        if(rs.next()){
            System.out.println("请输入密码:");
            String pw = sc.next();
            String password=rs.getString("password");
            if(password.equals(pw)){
                System.out.println("登录成功");
            }else{
                System.out.println("登录失败");
            }
        }else {
            System.out.println("用户不存在");
            System.out.println("开始注册......你的名字是:"+name);
            System.out.println("请输入注册密码:");
            String psw = sc.next();
            statement.executeUpdate("INSERT INTO login VALUES(NULL,'"+name+"','"+psw+"');");
            System.out.println("注册成功!!!");
        }
        conn.close();
//        conn.close();
    }
}
