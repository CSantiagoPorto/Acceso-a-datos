package Resources;

import java.io.File;
import java.io.IOException;

public class GestionFicheros {
    public void trabajoFicherosBase(){
 //
        File file= new File("src/Resources/ejemplo.txt");

        if(!file.exists()) {
            try {
                file.createNewFile();// Pasa el fichero de lógico a físico

            } catch (IOException e) {
                System.out.println("Error en la creación del fichero");
            }
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.isFile());
            System.out.println(file.isHidden());
        }
        File carpeta =new File("src/Resources/ficheros");
        if (!carpeta.exists()){
            //No es obligatoria una excepción porque no usa memoria hasta que guardas algo dentro
            //Mientras no lo uses existe de forma lógica
            carpeta.mkdir();
        }
        carpeta.list();//Me dice el nombre de todos los ficheros Array de nombres
        carpeta.listFiles();//Devuelve todos los ficheros que están dentro Array ficheros
        for (String item: carpeta.list()){//Hacemos un foreach que nos recorre todo el fichero
            System.out.println(item);
        }
        for (File item:carpeta.listFiles()){
            System.out.println(item.getName());//Como es un File lo podemos tratar con sus métodos
        }
        File AccesoaDatos = new File("C:/Users/Iri/Documents/DAM/SEGUNDO/Acceso a datos");

        for (File item:AccesoaDatos.listFiles()){
            if(!AccesoaDatos.isHidden()) {
                System.out.println(item.getName());
                if(item.isDirectory()){//Quiero que si es una carpeta me saque todos los archivos interiores
                    System.out.println(item.getName());
                    for (File item2:item.listFiles()){
                        System.out.println("\t"+item2.getName());

                    }//Sacar nombre de todas las carpetas y ficheros de una ruta de forma recursiva
    //Si soy carpeta, me meto en la carpeta y necesito que vuelva a comprobar si existen carpetas
                }else{
                    System.out.println(item.getName());
                }
            }
        }

    }
}
