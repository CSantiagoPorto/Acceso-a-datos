import dao.UsuarioDAO;
import model.Usuario;

import java.sql.SQLException;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        UsuarioDAO usuarioDAO =new UsuarioDAO();
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el correo");
        String correo =sc.next();
        System.out.println("Dime la contraseña");
        String pass=sc.next();
        try {
           if( usuarioDAO.realizarLogin(correo, pass)){
               System.out.println("Login correcto");

            }else{
               System.out.println("Credenciales incorrectas");
           }
        } catch (SQLException e) {
            System.out.println("Error en la ejecución");
        }
      /*
        System.out.println("Dime tu nombre");
        String nombre= sc.next();
        System.out.println("Dime tu correo");
        String correo = sc.next();
        System.out.println("Dime tu pass");
        String pass= sc.next();
        System.out.println("Dime tu teléfono");
        int telefono= sc.nextInt();
        System.out.println("Dime tu perfil");
        int idPerfil=sc.nextInt();


        try {
            usuarioDAO.registrarUsuario(new Usuario(nombre, correo,pass,telefono,idPerfil));
        } catch (SQLException e) {
            System.out.println("Error en la ejecución. Mira a ver");
            System.out.println(e.getCause());
        }*/
    }
}
