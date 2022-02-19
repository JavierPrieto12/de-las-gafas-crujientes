/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_clase_persona;

/**
 *
 * @author Owner
 */
public class EVA1_2_CLASE_PERSONA {

    
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Persona estudiante = new Persona();
        estudiante.id = "00112233";
        estudiante.nombre = "Juan Perez Jolote";
        estudiante.edad = 10;
        estudiante.imprimirDatos();
        System.out.println("Año de nacimeinto: " + estudiante.calcularAñoNacimiento());
        
        Persona estudiante2 = new Persona();
        estudiante2.nombre = "Ruben";
        estudiante2.id = "1111";
        estudiante2.edad = 40;
        estudiante2.imprimirDatos();
        System.out.println("Año de nacimeinto: " + estudiante2.calcularAñoNacimiento());
        
        Persona estudiante3 = new Persona();
        estudiante3.nombre = "Pedro";
        estudiante3.edad = 50;
        estudiante3.id = "654654";
        estudiante3.imprimirDatos();
        System.out.println("Año de nacimeinto: " + estudiante3.calcularAñoNacimiento());
        
    }
    
}

class Persona{
    String id;
    String nombre;
    int edad;
    
    void imprimirDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("Su id es: " + id);
        System.out.println("Su edad es: " + edad);
    }
    
    int calcularAñoNacimiento (){
        int añoNac = 2022 - edad;
        return añoNac;
    }
}
