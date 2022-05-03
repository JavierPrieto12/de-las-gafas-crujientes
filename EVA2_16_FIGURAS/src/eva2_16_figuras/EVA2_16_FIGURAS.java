/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_figuras;

/**
 *
 * @author Owner
 */
public class EVA2_16_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo trian = new Triangulo(10, 15);
        Circulo circulo = new Circulo(20);
        Cuadrado rectangulo = new Cuadrado(20, 25);
//System.out.println("Área = " + trian.calcularArea());
//VERIFICAR POLIMORFISMO: IS - A
        imprimirArea(trian);//llamada a funcion
        imprimirArea(circulo);
        imprimirArea(rectangulo);
        
        claseObject(trian);
    }
    
    public static void imprimirArea(Figura f){
        System.out.println("ÁREA = " + f.calcularArea());
        //RESTAURAR EL OBJETO:
        //CONVERTIR UN TIPO DE DATO EN OTRO --> CASTING
        if(f instanceof Triangulo){
            System.out.println(f.getClass());
            Triangulo trian = (Triangulo)f;//convirtiendo una figura en un triangulo
        }
    }
    
    public static void claseObject(Object o){
       System.out.println(o.getClass());
    }
    
}

