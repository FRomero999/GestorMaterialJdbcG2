package org.example;

import org.example.data.EquipoMysqlDAO;
import org.example.models.Equipo;

import java.sql.*;
import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void main() {

        var dao = new EquipoMysqlDAO();

        Long id = 10L;

        Optional<Equipo> e = dao.findById(id);
        e.ifPresent(equipo -> {
            dao.deleteById(equipo.getId());
        });


    }
}
