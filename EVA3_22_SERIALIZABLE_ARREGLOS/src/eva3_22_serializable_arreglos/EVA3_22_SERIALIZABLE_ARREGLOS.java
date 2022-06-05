/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_22_serializable_arreglos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Owner
 */
public class EVA3_22_SERIALIZABLE_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona> miListaPerso = new ArrayList(); //COLLECTIONS. <TIPOS DE DATOS GENERICOS>
        //JAVA --> LISTAS, ARREGLOS, ETC: 0 --> N - 1
        miListaPerso.add(new Persona("Juan", "Perez"));
        miListaPerso.add(new Persona("Pedro", "Perez"));
        miListaPerso.add(new Persona("Ana", "Perez"));
        miListaPerso.add(new Persona("Filomeno", "Perez"));
        miListaPerso.add(new Persona("Antonio", "Perez"));
        miListaPerso.add(new Persona("Lupita", "Perez"));
        miListaPerso.add(new Persona("Nepomuceno", "Perez"));
        escribirObj(miListaPerso);
    }
     //GUARDAR OBJETO
    public void escribirObj(Object obj){
        try {
            FileOutputStream abrirArch = new FileOutputStream("C:/Archivos/apunte4.obj");
            ObjectOutputStream guardarObj = new ObjectOutputStream(abrirArch);
            guardarObj.writeObject(obj);
            guardarObj.flush();
            guardarObj.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    //LEER OBJETOS
     public void leerObj(){
        try {
            FileInputStream abrirArch = new FileInputStream("C:/Archivos/apunte4.obj");
            ObjectInputStream leerObj = new ObjectInputStream(abrirArch);
            ArrayList<Persona> miListaPerso = new (ArrayList<Persona>)leerObj.readObject();//Objeto (Class Object)
        for(int i=0; i < miListaPerso.get(i))
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
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
