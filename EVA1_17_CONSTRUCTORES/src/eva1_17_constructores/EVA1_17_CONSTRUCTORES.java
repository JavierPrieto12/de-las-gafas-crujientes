/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_constructores;

/**
 *
 * @author Owner
 */
public class EVA1_17_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        
        Persona persona2 = new Persona();
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Edad: " + persona2.getEdad());
        
        Persona persona3 = new Persona("RUBEN", 40);
        System.out.println("Nombre: " + persona3.getNombre());
        System.out.println("Edad: " + persona3.getEdad());
        
        Persona persona4 = new Persona(5.0);
        System.out.println("Nombre: " + persona4.getNombre());
        System.out.println("Edad: " + persona4.getEdad());
    }
    
}

class Persona{
    private String nombre;
    private int edad;
    
    //Constructor default 
    //Inicializar valores
    public Persona() {
        System.out.println("CREANDO EL OBJETO");
        nombre = "Juan Perez";
        edad = 100;
    }
    public Persona(String nombre, int edad){
        System.out.println("CREANDO EL OBJETO CON CONSTRUCTOR QUE ACEPTA VALORES");
        this.nombre = "RUBEN";
        this.edad = 40;
    }
    
    public Persona(double valor){
        System.out.println("CREANDO EL OBJETO CON CONSTRUCTOR QUE ACEPTA doubles");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}