/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_clases_anonimas;

/**
 *
 * @author Owner
 */
public class EVA2_19_CLASES_ANONIMAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mensajes mensaje = new Mensajes(){
         @Override
    public void mostrarMensaje(){
        System.out.println("Hola mund0");
    }
        };
    }
    
}

interface Mensajes{
    public void mostrarMensaje();
}