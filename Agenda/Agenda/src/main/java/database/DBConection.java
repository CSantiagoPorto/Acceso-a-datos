package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConection {//PERMITE LLEGAR A LA CONEXIÓN

    private static Connection connection;
    private void createConnection() throws SQLException {
        //DriverManager es una clase de Java que analiza todos los drivers instalados en el sistema y permite conectarse a la base de datos
        //Usamos el método .getConnection() porque necesitamos obtener la conexión
        //Pide 3 parámetros:
        //      Dónde me quiero conectar, que lo pasamos como url -> String url= "jdcb:mysql://127.0.0.1:3306/contactos_ue";
        //      Usuario -> root
        //      Contraseña->""
        //Vamos a usar un String template para que los coja del SchemaDB
        //Cuando usemos el .getConection() nos hace manejar errores, porque no existe, los usuario/contraseña no existe, no tiene privilegios
        //Lo ponemos en la firma del método
        String url= String.format("jdbc:mysql://%s:%s/%s",SchemaDB.HOST,SchemaDB.PORT,SchemaDB.DB_NAME);

            connection= DriverManager.getConnection(url,"root","");


    }



    public Connection getConnection() throws SQLException{
        if(connection==null){
            createConnection();

        }

        return connection;
    }
    public void closeConnection(){

        try {
            connection.close();
            connection=null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
