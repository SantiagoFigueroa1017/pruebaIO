package Servicios;

import models.Persona;

import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    private Persona persona;
    private Scanner sc;
    private PersonaIOService personaIOService;

    public PersonaService(){
        sc = new Scanner(System.in);
        personaIOService = new PersonaIOService();
    }

    public void menu(){
        int opcion = 0;
        do {
            System.out.println("MENU OPCIONES JSON");
            System.out.println("1 -> CREAR EMPLEADO ");
            System.out.println("2 -> VISUALIZAR EMPLEADO ");
            System.out.println("Ingrese una opción del menú");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    crearPersona();
                    break;
                case 2:
                    visualizarPersona();
                    break;
                default:
                    opcion = 0;
            }

        }while (opcion != 0);
    }

    private void visualizarPersona() {
        persona = personaIOService.leerJson();
        System.out.println("Persona leida desde un archivo Json");
        System.out.println(persona);
    }

    private void crearPersona() {
        System.out.println("Ingrese el nombre");
        String nombre = sc.next();
        System.out.println("Ingrese el telefono");
        String telefono = sc.next();
        System.out.println("Ingrese el correo");
        String correo = sc.next();
        String fechaActual = new Date().toString();

        persona = new Persona(nombre, telefono, correo, fechaActual);
        personaIOService.escribirJson(persona);
        System.out.println("Se guardó la persona " + persona + " en un archivo Json");

    }


}