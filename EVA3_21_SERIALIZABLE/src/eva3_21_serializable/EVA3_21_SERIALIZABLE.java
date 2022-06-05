/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_21_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Owner
 */
public class EVA3_21_SERIALIZABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //binarios y de texto
        //ESPICIFICAR QUE OBJETOS (CLASES) SON SERIALIZABLES
        //DEBEMOS HACER QUE LA CLASE IMPLEMENTE LA INTERFAZ SERIALIZABLE
        Persona persona = new Persona("Pedro", "Páramo");
        escribirObj(persona);
        leerObj();
    }
    
    //GUARDAR OBJETO
    public void escribirObj(Object obj) throws IOException{
        try {
            FileOutputStream abrirArch = new FileOutputStream("C:/Archivos/apunte3.obj");
            ObjectOutputStream guardarObj = new ObjectOutputStream(abrirArch);
            guardarObj.writeObject(obj);
            guardarObj.flush();
            guardarObj.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //LEER OBJETOS
     public void leerObj(){
        try {
            FileInputStream abrirArch = new FileInputStream("C:/Archivos/apunte3.obj");
            ObjectInputStream leerObj = new ObjectInputStream(abrirArch);
            Persona persona = (Persona)leerObj.readObject();//Objeto (Class Object)
            System.out.println("Nombre: " + persona.getNombre() + " " + persona.getApellido());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

class Persona implements Serializable{
    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
