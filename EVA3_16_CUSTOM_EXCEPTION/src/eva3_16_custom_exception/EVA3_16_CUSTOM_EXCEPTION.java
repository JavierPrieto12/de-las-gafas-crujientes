/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_16_custom_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class EVA3_16_CUSTOM_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Captura la edad: ");
        int valor = 0;
        try{
            int valor = input.nextInt();
        }catch(InputMismatchException ex){
            throw new Exception("Introdujiste una cadena de texto, no es un número valido");
        }
        return valor;
        
    }
    
}

//EXCEPCION PERSONALIZADA
//HEREDAR DE EXCEPCION
class ExcepcionDeCaptura extends Exception{
    super(message);
}