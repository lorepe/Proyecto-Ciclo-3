package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    Connection connection; // Variable de conexion tipo conexion  

    static String bd = "typicalfood"; //Nombre de la base de datos
    static String port = "3307"; //Puerto de conexion de HeidiSQL
    static String login = "root"; //Usuario base de datos
    static String password = "admin"; //Constraseña base de datos

    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:" + this.port + "/" + this.bd;
            connection = DriverManager.getConnection(url, this.login, this.password);
            System.out.println("¡Conexion establecida!");
        } catch (Exception ex) {
            System.out.println("¡Error de conexion!");
        }
    }

    /* Metodo para conectar a la base de datos */
    public Connection getConnection() {
        return connection;

    }

    /* Metodo para descecontar la base de datos */
    public void desconectar() {
        connection = null;
    }

}
