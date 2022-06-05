/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_13_mejorar_captura_edad;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class EVA3_13_MEJORAR_CAPTURA_EDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception  {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean datoErroneo = true; // el usuario siempre se equivoca
        do{
            try{
                
                System.out.println("Introduce tu edad(numero entero): ");
                int iedad = input.nextInt();
                if(iedad < 0)
                throw new Exception("El valor = " + iedad + " no es una edad válida");
                System.out.println("Tu edad: " + iedad);
                datoErroneo = false;
            }catch(InputMismatchException e){
                System.out.println(input.next() + " no es un numero valido"); //input.next() no permite que se cicle 
            }catch(Exception e){
                System.out.println("Edad no valida");
            }

        }while(datoErroneo);
    }
    
    
}
