package com.backend.integrador;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;

public class Application {
    private static final Logger LOGGER = Logger.getLogger(Application.class);
    public static void main(String[] args) {

        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:~/backendintegrador;INIT=RUNSCRIPT FROM 'create.sql'", "sa", "sa");
            LOGGER.info("La conexion a la bd se hizo correctamente");
        } catch (Exception e){
            e.printStackTrace();
            LOGGER.error("Hubo un error al conectarse a la base de datos");
        } finally {
            try {
                connection.close();
                LOGGER.info("La conexion a la bd se cerro correctamente");
            } catch (Exception ex){
                ex.printStackTrace();
                LOGGER.error("No se pudo cerrar la conexion a la bd");
            }
        }

    }
}
