/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_interfaces;

/**
 *
 * @author Owner
 */
public class EVA2_5_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        perso.setNombre("Ruben");
        perso.setEdad(40);
        perso.imprimirdatos();
        
        Vehiculo vehiculo = new Vehiculo("Ford", "Mustang");
        vehiculo.imprimirdatos();
        vehiculo.mostrarMensaje();
        
    }
}
    
class Persona implements MuestraDatos {
    private String nombre;
    private int Edad;

    public Persona() {
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
        
        @Override
        public void imprimirdatos(){
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + Edad);
        }
 
}

class Vehiculo implements MuestraDatos, Mensaje{
    private String Marca;
    private String Modelo;

    public Vehiculo(String Marca, String Modelo) {
        this.Marca = Marca;
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public void imprimirdatos() {
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
    }
    
    @Override
    public void mostrarMensaje(){
    
    }
}

interface MuestraDatos{
    //SOLO ACEPTAN MÉTODOS PUBLICOS
    //SOLO ACEPTA DECLARACIONES DE MÉTODOS --> SOLO ACEPTA MÉTODOS ABSTRACTOS
    public void imprimirdatos();
    
}

interface Mensaje{
    public void mostrarMensaje();
}