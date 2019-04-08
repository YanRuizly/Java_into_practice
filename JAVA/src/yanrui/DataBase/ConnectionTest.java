//package yanrui.DataBase;
//
//import java.sql.*;
//
//public class ConnectionTest {
//    public static void main(String[] args){
//        try {
//            ClassTest.forName("com.mysql.jdbc.Driver");
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wenhua_zhaosheng?characterEncoding=GBK", "root", "123456");
//            Statement statement = conn.createStatement();
//            String sql = "select * from city";
//            ResultSet rs = statement.executeQuery(sql);
//            while (rs.next()){
//                String year = rs.getString("city");
//                System.out.println(year);
//            }
//
//        }catch (ClassNotFoundException e){
//            e.printStackTrace();
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//    }
//}
