/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_clase_computadora;

/**
 *
 * @author Owner
 */
public class EVA1_5_CLASE_COMPUTADORA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        computadora compu1 = new computadora();
        compu1.setaño(2013);
        compu1.setmarca("Lenovo");
        compu1.setprocesador("intel CORE i7");
        compu1.setcolor("Negra");
        compu1.setprecio(12000.00);
        
        
            System.out.println("Año: " + compu1.getAño());
            System.out.println("Marca: " + compu1.getMarca());
            System.out.println("Procesador: " + compu1.getprocesador());
            System.out.println("Color: " + compu1.getColor());
            System.out.println("Precio: " + (compu1.getPrecio() + compu1.getPrecio() * 1.16));
            
                
    }
    
}

class computadora{
    private String marca;
    private String procesador;
    private int año;
    private String color;
    private double precio;
    
    public void setmarca(String valor){
        marca = valor;
    }
    public void setprocesador(String valor){
        procesador = valor;
    }
    public void setaño(int valor){
        año = valor;
    }
    public void setcolor(String valor){
        color = valor;
    }
    public void setprecio(double valor){
        precio = valor;
    }
    public String getMarca(){
        return marca;
    }
    public String getprocesador(){
        return procesador;
    }
    public int getAño(){
        return año;
    }
    public String getColor(){
        return color;
    }
    public double getPrecio(){
        return precio;
    }
    
}