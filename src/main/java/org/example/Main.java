package org.example;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static String url = "jdbc:mysql://localhost:3307/ad";
    private static String user = "user";
    private static String pwd = "pwd";

    static void main() {

        /*
        Create -> sqlInsert
        Read -> sqlQuery
                sqlFindById
        Update -> sqlUpdate
        Delete -> sqlDelete
         */
        String sqlQuery = "select * from equipo";
        String sqlFindById = "select * from equipo where id = ?";
        String sqlInsert = "insert into equipo (nombre, categoria, disponible) values (?,?,?)";
        String sqlUpdate = "update equipo set disponible = ? where id = ?";
        String sqlDelete = "delete from equipo where id = ?";

        // Bloque try para insertar un nuevo equipo en la base de datos
        try ( Connection conn = DriverManager.getConnection(url,user,pwd);
              PreparedStatement stmt = conn.prepareStatement(sqlInsert))
        {
            stmt.setString(1,"GTA VI");
            stmt.setString(2,"VideoGame");
            stmt.setBoolean(3,true);

            // Ejecuta la sentencia INSERT en la base de datos
            int  filas = stmt.executeUpdate();

            System.out.println("filas insertadas: "+filas);

        }catch (SQLException e){
            throw new RuntimeException(e);
        }


        // Bloque try para actualizar un equipo existente en la base de datos
        try (Connection conn = DriverManager.getConnection(url, user, pwd);
             PreparedStatement stmt = conn.prepareStatement(sqlUpdate)) {
            stmt.setBoolean(1, false);
            stmt.setInt(2, 1);

            // Ejecuta la sentencia UPDATE en la base de datos
            int filas = stmt.executeUpdate();

            System.out.println("filas actualizadas: " + filas);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // Bloque try para eliminar un equipo de la base de datos
        try (Connection conn = DriverManager.getConnection(url, user, pwd);
             PreparedStatement stmt = conn.prepareStatement(sqlDelete)) {
            stmt.setInt(1, 1);

            // Ejecuta la sentencia DELETE en la base de datos
            int filas = stmt.executeUpdate();

            System.out.println("filas eliminadas: " + filas);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // Bloque try para consultar todos los equipos de la base de datos
        try (Connection conn = DriverManager.getConnection(url, user, pwd);
             PreparedStatement ps = conn.prepareStatement(sqlQuery);
             // Ejecuta la consulta SELECT para obtener todos los registros
             ResultSet rs = ps.executeQuery() )
        {

            while (rs.next()) {
                String name = rs.getString("nombre");
                System.out.println(name);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        // Bloque try para consultar un equipo por su ID
        try (Connection conn = DriverManager.getConnection(url, user, pwd);
             PreparedStatement ps = conn.prepareStatement(sqlFindById)) {
            ps.setInt(1, 1);

            // Ejecuta la consulta SELECT filtrando por ID
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("nombre");
                    String categoria = rs.getString("categoria");
                    boolean disponible = rs.getBoolean("disponible");
                    System.out.println("Equipo encontrado - ID: " + id + ", Nombre: " + name + ", Categoría: " + categoria + ", Disponible: " + disponible);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
