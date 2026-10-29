package org.example;

import org.example.data.EquipoMysqlDAO;

public class Main2 {
    static void main() {
        var dao = new EquipoMysqlDAO();
        dao.findAll().forEach(System.out::println);
    }
}
