package dao;

import database.DBConection;
import database.SchemaDB;
import model.Usuario;
import java.sql.*;

public class UsuarioDAO {

    //Aquí van todas las acciones contra base de datos -> CRUD (CreateReadUpdateDelte)
    private Connection connection; //Necesitamos la conexion
    private PreparedStatement preparedStatement; //->Para poder trabajar con inserciones
    private ResultSet resultSet;//-> para poder trabajar con selecciones
    private Statement statement;
    //No necesitamos constructor porque cada vez que necesitamos la conexión te dan la copia y si no la crea


    public boolean registrarUsuario(Usuario usuario) throws SQLException {

        //Los datos se piden en la parte lógica de la vista, esto es de la base de datos
        connection= new DBConection().getConnection();
        /*statement =connection.createStatement();
        String query= String.format("INSERT INTO %s(%s,%s,%s,%s) VALUE ('%s','%s','%d')", SchemaDB.COL_NAME,
                SchemaDB.COL_MAIL,SchemaDB.COL_PASS,SchemaDB.COL_PH, usuario.getNombre(),usuario.getCorreo(),usuario.getPass(),
                usuario.getTelefono());
        statement.execute(query);
        Con Statement hay que pasarle la consulta en texto plano. Es peligroso y poco funcional. Mucho mejor preparedStatement*/


        String query= String.format("INSERT INTO %s(%s,%s,%s,%s,%s) VALUE (?,?,?,?,?)",SchemaDB.TAB_USER ,SchemaDB.COL_NAME,
                SchemaDB.COL_MAIL,SchemaDB.COL_PASS,SchemaDB.COL_PH, SchemaDB.COL_ID_PER);
        preparedStatement= connection.prepareStatement(query);
        preparedStatement.setString(1, usuario.getNombre());
        preparedStatement.setString(2, usuario.getCorreo());
        preparedStatement.setString(3, usuario.getPass());
        preparedStatement.setInt(4,usuario.getTelefono());
        preparedStatement.setInt(5,usuario.getIdPerfil());
        //connection.close(); Esto cerraría la conexión
        return preparedStatement.execute();// Esto devuelve true o false dependiendo de si ha habido problemas con la conexión
    }
    public Boolean realizarLogin(String correo, String pass) throws SQLException {
        connection=new DBConection().getConnection();
        preparedStatement=connection.prepareStatement(String.format("SELECT *FROM %s WHERE %s=? AND %s=?", SchemaDB.TAB_USER, SchemaDB.COL_MAIL, SchemaDB.COL_PASS));
        //El preparedStatement se inicia con el objeto connectios, le podemos poner la query directamente o declararla primero
        preparedStatement.setString(1, correo);
        preparedStatement.setString(2,pass);
        resultSet=preparedStatement.executeQuery();

        return resultSet.next();
    }


}
