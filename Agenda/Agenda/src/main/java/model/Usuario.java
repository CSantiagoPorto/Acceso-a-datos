package model;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor


public class Usuario  implements Serializable {
    //Aquí tengo mis modelos de usuarios, que podrían ser productos, coches o cosas de ese tipo y declaramos sus variables

    private int id;
    private String nombre;
    private  String correo;
    private  String pass;
    private  int telefono;
    private  int idPerfil;

    public Usuario(String nombre, String correo, String pass, int telefono, int idPerfil) {
        this.nombre = nombre;
        this.correo = correo;
        this.pass = pass;
        this.telefono = telefono;
        this.idPerfil = idPerfil;
    }

    public void mostrarDatos(){
        System.out.println("id= "+id);
        System.out.println("nombre= "+nombre);
        System.out.println("correo = "+correo);
        System.out.println("pass ="+ pass);
        System.out.println("telefono = "+telefono);
        System.out.println("id= "+ id);

    }
}
