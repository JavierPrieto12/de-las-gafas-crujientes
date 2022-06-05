/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_12_usar_throw;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class EVA3_12_USAR_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        try{
            System.out.println("Introduce tu edad(valor entero positivo) ");
            int valor = input.nextInt();
            if(valor < 0)
                throw new Exception("El valor = " + valor + " no es una edad válida")
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("La edad capturada es: " + valor);
    }
    
}
