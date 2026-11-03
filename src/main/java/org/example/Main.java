package org.example;

import org.example.data.DataSourceFactory;
import org.example.data.DatabaseInitializer;
import org.example.data.EquipoMysqlDAO;
import org.example.models.Equipo;

import java.sql.*;
import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void main() {

        var ds = DataSourceFactory.getDataSource();
        DatabaseInitializer.initialize(ds);
        DatabaseInitializer.initData(ds);

        var dao = new EquipoMysqlDAO(ds);
        dao.findAll().forEach(System.out::println);

    }
}
