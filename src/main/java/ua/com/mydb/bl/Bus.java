//package ua.com.mydb.bl;
//
//
//public class Bus {
//    public static void main(String[] args) {
//        Connection conn = null;
//        PreparedStatement stmt = null;
//
//        try {
//            // з'єднання з базою даних
//            conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "M0970773385mixa");
//
//            // SQL запит для вставки нового автобуса
//            String sql = "INSERT INTO Bus (id, name, description, route_id, interval_id) VALUES (?, ?, ?, ?, ?)";
//
//            // створення PreparedStatement з запитом
//            stmt = conn.prepareStatement(sql);
//
//            // встановлення значень параметрів запиту
//            stmt.setInt(1, 1); // id
//            stmt.setString(2, "Bus 1"); // name
//            stmt.setString(3, "Description of Bus 1"); // description
//            stmt.setInt(4, 1); // route_id
//            stmt.setInt(5, 1); // interval_id
//
//            // виконання запиту
//            stmt.executeUpdate();
//
//            System.out.println("Bus added successfully");
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
