//package ua.com.mydb.bl;
//
//import java.sql.*;
//
//public class Route {
//    public static void main(String[] args) {
//        Connection conn = null;
//        PreparedStatement stmt = null;
//
//        try {
//            // з'єднання з базою даних
//            conn = DriverManager.getConnection("jdbc:mysql://localhost/mydatabase", "username", "password");
//
//            // SQL запит для вставки нового маршруту
//            String sql = "INSERT INTO Route (id, name, bus, images) VALUES (?, ?, ?, ?)";
//
//            // створення PreparedStatement з запитом
//            stmt = conn.prepareStatement(sql);
//
//            // встановлення значень параметрів запиту
//            stmt.setInt(1, 1); // id
//            stmt.setString(2, "Route 1"); // name
//            stmt.setString(3, "Bus 1, Bus 2"); // bus
//            stmt.setString(4, "image1.jpg, image2.jpg"); // images
//
//            // виконання запиту
//            stmt.executeUpdate();
//
//            System.out.println("Route added successfully");
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        } finally {
//            try {
//                if (stmt != null) stmt.close();
//                if (conn != null) conn.close();
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//        }
//    }
//}
