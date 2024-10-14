package almacenamiento;
import java.io.File;
import java.io.IOException;

public class Entrada {
    public static void main(String[] args) {
        File f = new File("C:/Users/Iri/Documents/DAM/SEGUNDO/Acceso a datos/Clase File/src/almacenamiento/documentos/inicio2.txt");
        File f4 = new File("src/almacenamiento/documentos/inicio4.txt");

       /* System.out.println(f.exists());
        System.out.println(f.getName());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.canRead());
        System.out.println(f.getParent());*/
        if(!f4.exists()){
            try {
                f4.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);// No lo crea porque ya está creado
            }
        }
        File f2 = new File("src/almacenamiento/documentos/inicio3.txt");
        if(!f2.exists()){
            try {
                f2.createNewFile();//Eso sí lo creó porque no existía antes de esto
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        //f.list();Esto es un array de String
         String[] listaDocumentos =f.list();
        /*for(String documento:listaDocumentos){
            System.out.println(documento);
        }
        File[] listaFicheros =f.listFiles();
        for(File file: listaFicheros){
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.getAbsolutePath());
        }*/
       /*File dir = new File("C:\\Users\\Iri\\Documents\\DAM\\SEGUNDO\\Acceso a datos\\Clase File\\src\\almacenamiento\\documentos");
        dir.mkdir(); Así se crea una carpeta*/
    }//Cierra el main

}

