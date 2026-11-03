package org.example.data;

import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {

    /**
     * Inicializa las tablas necesarias a partir de un script init.sql
     */
    public static void initialize(DataSource ds){
        executeScript(ds, "/init.sql");
    }

    /**
     * Añade los datos iniciales a partir de un script data.sql
     * Solo añade los datos si la tabla esta vacia.
      */
    public static void initData(DataSource ds){
        String sql = "SELECT COUNT(*) FROM equipo";
        try (Connection conn = ds.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            if (rs.next() && rs.getInt(1) == 0) {
                executeScript(ds, "/data.sql");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Ejecuta un script SQL ubicado en el classpath.
     *
     * @param ds           {@link DataSource} del que se obtendrán las conexiones
     * @param resourcePath ruta del recurso dentro del classpath (p. ej. {@code "/init.sql"})
     * @throws RuntimeException si el recurso no existe o falla su ejecución
     */
    private static void executeScript(DataSource ds, String resourcePath) {
        InputStream is = DatabaseInitializer.class.getResourceAsStream(resourcePath);
        if (is == null) {
            throw new RuntimeException("No se encontró el recurso " + resourcePath);
        }

        StringBuilder script = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                String trimmed = line.trim();
                if (trimmed.isEmpty() || trimmed.startsWith("--")) {
                    continue;
                }
                script.append(line).append('\n');
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (Connection conn = ds.getConnection();
             Statement st = conn.createStatement()) {
            for (String statement : script.toString().split(";")) {
                if (!statement.isBlank()) {
                    st.execute(statement);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
