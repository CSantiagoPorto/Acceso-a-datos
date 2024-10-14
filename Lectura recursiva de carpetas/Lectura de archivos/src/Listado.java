import java.io.File;
import java.io.IOException;

public class Listado {
    public static void main(String[] args){
        File directorio = new File("src/Resources");
        directorio.mkdir();//Ejemplo creación carpeta
        File archivoTxt = new File("src/Resources/inicio.txt");
        try {//Ejemplo creación archivo .txt
            archivoTxt.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File ruta= new File("C:\\Users\\Iri\\Documents");
        //creo el objeto con la ruta para pasárselo al método
        //Este objeto creado con la ruta se la pasará al método listadoFicheros cuando lo llame en la siguiente línea
        listadoFicheros(ruta);

    }
public static void listadoFicheros(File rutaFichero) {
        //Creamos el método pasándole el archivo rutaFichero que contiene la ruta
    //Ahora sólo necesito que liste si es una carpeta. Por lo tanto necesito la condición
     if(rutaFichero.isDirectory()){
         for(File item: rutaFichero.listFiles()){
             //Como rutaFichero es un objeto File puedo usar sus métodos y listFiles lista las carpetas
             System.out.println(item.getName());//imprimimos nombre
             if(rutaFichero.isDirectory()){
                 //Usamos el isDirectory como antes para comprobar si hay una capreta dentro de otra
                 listadoFicheros(item);
                 //Esto debería permitir llamar a la propia función para cada item que cumpla la condición
             }
         }

     }

}

}
