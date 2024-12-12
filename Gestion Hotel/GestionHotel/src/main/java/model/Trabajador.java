package model;


import jakarta.persistence.*;
import java.io.Serializable;



//Condiciones que debe cumplir esta clase:
// todas las variables de la clase deben ser privadas
// clase implementar Serializable
//Un constructor vacío
@Entity (name ="trabajadores")/* Diciendo esto hibernate coge el objeto trabajador y e intenta agregarlo a una tabla con nombre trabajador */
//como no exite (se llama trabajadores) hay que indicarle el nombre
public class Trabajador implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)//Id suele ser autoincremental y no necesito que lo pida
    private int id; //pk en BD
    @Column //(name = "name")
    private String nombre;
    @Column //(name = "surname")
    private String apellido;
    @Column
    private String correo;
    @Column //(name = "phone")
    private int telefono;

    public Trabajador(String nombre, String apellido, String correo, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Trabajador() {
    }

    public Trabajador(int id, String nombre, String apellido, String correo, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
