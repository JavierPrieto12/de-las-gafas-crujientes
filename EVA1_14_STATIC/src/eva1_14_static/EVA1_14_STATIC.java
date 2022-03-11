/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_static;

/**
 *
 * @author Owner
 */
public class EVA1_14_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //INSTANCIAR LA CLASE
        
        /*FormulasMatematicas misFor = new FormulasMatematicas();
        double area = misFor.CalcularAreaCirculo(100);
        System.out.println("Área del círculo: " + area);*/
        double area = FormulasMatematicas.CalcularAreaCirculo(100);
        System.out.println("Área del círculo: " + area);
        double areaT = FormulasMatematicas.CalcularAreaTriangulo(100, 50);
        System.out.println("Área del Triangulo: " + areaT);
        FormulasMatematicas miObj = new FormulasMatematicas();
        miObj.imprimirMensaje();
        
    }
    
}

class FormulasMatematicas{
    
    //area circulo:
    public static double CalcularAreaCirculo(double radio){
        double area;
        area = 3.1416 * radio * radio;
        return area;
    }
    //area triangulo
    public static double CalcularAreaTriangulo(double base, double altura){
        double area;
        area = (base * altura) / 2.0;
        return area;
    }
    public void imprimirMensaje(){
        System.out.println("Hola mundo!!");
    }
}
