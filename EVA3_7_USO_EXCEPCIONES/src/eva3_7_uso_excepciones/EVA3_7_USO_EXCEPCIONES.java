/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_7_uso_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class EVA3_7_USO_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean datoErroneo = true; // el usuario siempre se equivoca
        do{
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Introduce tu edad(numero entero): ");
                int iedad = input.nextInt();
                System.out.println("Tu edad: " + iedad);
                datoErroneo = false;
            }catch(InputMismatchException e){
                System.out.println("El dato introducido no es un numero valido"); //input.next() no permite que se cicle 

            }
        }while(datoErroneo);
        
    }
}
    

