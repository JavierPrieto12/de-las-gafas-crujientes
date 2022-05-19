/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_9_clase_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class EVA3_9_CLASE_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //------------------------------
        try{//AQUI VA EL CODIGO QUE PUEDE FALLAR
            System.out.println("Introduce un numero entero1:");
            int entero = input.nextInt();
            System.out.println("Introduce un numero entero2: ");
            int entero2 = input.nextInt();
            System.out.println("Divicion: " + (entero/entero2));
        }catch(Exception e){//ACCION REMEDIABLE 2
            e.printStackTrace();
        }
        System.out.println("Fin del programa.");
    }
    
}
