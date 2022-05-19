/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_8_multiples_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class EVA3_8_MULTIPLES_CATCH {

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
        }catch(ArithmeticException miVariable){//ACCION REMEDIABLE 1
            //miVariable.printStackTrace();
            System.out.println("Se produjo una divicion entre cero");
        }catch(InputMismatchException e){//ACCION REMEDIABLE 2
            System.out.println("El valor capturado no es un numero valido");
        }
        System.out.println("Fin del programa.");
    }
    
}
