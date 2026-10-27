package org.example;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static String url = "jdbc:mysql://localhost:3307/ad";
    private static String user = "user";
    private static String pwd = "pwd";

    static void main() {

        String sqlQuery = "select * from equipo";
        String sqlInsert = "insert into equipo (nombre, categoria, disponible) values (?,?,?)";

        try ( Connection conn = DriverManager.getConnection(url,user,pwd);
              PreparedStatement stmt = conn.prepareStatement("insert into equipo (nombre, categoria, disponible) values (?,?,?)");)
        {
            stmt.setString(1,"GTA VI");
            stmt.setString(2,"VideoGame");
            stmt.setBoolean(3,true);
            int  filas = stmt.executeUpdate();

            System.out.println("filas insertadas: "+filas);

        }catch (SQLException e){
            throw new RuntimeException(e);
        }

        /* try con update */


        /* try con delete */


        try (Connection conn = DriverManager.getConnection(url, user, pwd);
             PreparedStatement ps = conn.prepareStatement(sqlQuery);
             ResultSet rs = ps.executeQuery() )
        {

            while (rs.next()) {
                String name = rs.getString("nombre");
                System.out.println(name);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
