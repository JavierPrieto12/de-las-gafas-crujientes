/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_herencia_e_interfaces;

/**
 *
 * @author Owner
 */
public class Persona {
    private String nombre;
    private int Edad;

    public Persona() {
        this.nombre = "";
        this.Edad = 0;
    }

    public Persona(String nombre, int Edad) {
        this.nombre = nombre;
        this.Edad = Edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
}
