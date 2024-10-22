import Servicios.PersonaService;
import com.google.gson.Gson;
import models.Persona;

import java.io.*;

public class Principal {
    public static void main(String[] args) {

        PersonaService personaService = new PersonaService();
        personaService.menu();


//        System.out.println("Does it exist?"+file.exists());
//        System.out.println("The file has "+file.length() + " Bytes");
//        System.out.println("Can it be rea? " + file.canRead());
//        System.out.println("Can it be written? " + file.canWrite());
//        System.out.println("It is a directory? " + file.isDirectory());
//        System.out.println("It is a file? " + file.isFile());
//        System.out.println("It is a absolute? " + file.isAbsolute());
//        System.out.println("It is a hidden? " + file.isHidden());
//        System.out.println("Absolute path is " + file.getAbsolutePath());
//        System.out.println("Last modified on  " + new java.util.Date(file.lastModified()));

//        if(file.exists()){
//            try {
//                PrintWriter output = new PrintWriter(file);
//                output.println("Hola mundo");
//                output.close();
//                System.out.println("Se guardo la informacion");
//            }
//            catch (FileNotFoundException e){
//                System.out.println("El archivo no existe");
//            }
//
//        }
//        else {
//            System.out.println("El archivo no existe");
//        }




    }
}
