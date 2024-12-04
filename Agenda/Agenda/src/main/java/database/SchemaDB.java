package database;

public interface SchemaDB {
    //Aquí podemos definir constantes y que nadie puede cambiar-> variable de entorno

    String HOST= "127.0.0.1";
    String PORT= "3306";
    String DB_NAME= "contactos_ue";
    String TAB_USER="usuarios";
    String COL_ID= "id";
    String COL_ID_PER="id_Perfil";
    String COL_NAME= "nombre";
    String COL_SURNAME= "apellido";
    String COL_MAIL= "correo";
    String COL_PH= "telefono";
    String COL_PASS="pass";

}
