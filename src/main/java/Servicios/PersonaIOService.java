package Servicios;

import com.google.gson.Gson;
import models.Persona;

import java.io.*;

public class PersonaIOService {

    private Persona persona;
    private FileReader fileReader;
    private BufferedReader bufferedReader;
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private String path = "src/main/resources/datos/empleados.json";

    public void escribirJson(Persona persona){
        try {
            fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);
            String personaJson = new Gson().toJson(persona);
//            deserealizar
            bufferedWriter.write(personaJson);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }
    }

    public Persona leerJson(){
        String linea, fichero = "";
        try{
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            while ((linea = bufferedReader.readLine()) != null){
                fichero += linea;
            }
            persona = new Gson().fromJson(fichero, Persona.class);
        }catch (FileNotFoundException e){
            System.out.println("No existe el archivo");
        }catch (IOException e){
            System.out.println("Error al leer el archivo");
        }
        return persona;
    }
}
