/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_6_try_catch_zero;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class EVA3_6_TRY_CATCH_ZERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero entero1:");
        int entero = input.nextInt();
        System.out.println("Introduce un numero entero2: ");
        int entero2 = input.nextInt();
        //------------------------------
        try{
            System.out.println("Divicion: " + (entero/entero2));
        }catch(ArithmeticException miVariable){
            //miVariable.printStackTrace();
            System.out.println("Se produjo una divicion entre cero");
        }
        System.out.println("Fin del programa.");
        
    }
    
}
