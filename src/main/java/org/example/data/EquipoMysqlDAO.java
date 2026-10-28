package org.example.data;

import org.example.models.Equipo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EquipoMysqlDAO implements DAO<Equipo> {

    private String url = "jdbc:mysql://localhost:3307/ad";
    private String user = "user";
    private String pwd = "pwd";

    private String sqlQuery = "select * from equipo";

    @Override
    public Equipo findById(Long id) {
        return null;
    }

    @Override
    public List<Equipo> findAll() {
        List<Equipo> salida = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url, user, pwd);
             PreparedStatement ps = conn.prepareStatement(sqlQuery);
             // Ejecuta la consulta SELECT para obtener todos los registros
             ResultSet rs = ps.executeQuery() )
        {
            while (rs.next()) {
                Equipo equipo = new Equipo();
                equipo.setId(rs.getLong("id"));
                equipo.setNombre(rs.getString("nombre"));
                equipo.setCategoria(rs.getString("categoria"));
                equipo.setDisponible(rs.getBoolean("disponible"));
                salida.add(equipo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return salida;
    }

    @Override
    public Equipo save(Equipo entity) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void update(Equipo entity) {

    }
}
