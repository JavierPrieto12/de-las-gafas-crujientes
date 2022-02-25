/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_clase_auto;

/**
 *
 * @author Owner
 */
public class EVA1_4_CLASE_AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miAuto = new Automovil();
        miAuto.setmarca("Ford");
        miAuto.setmodelo("Mustang");
        miAuto.settipo("Sedan");
        miAuto.setaño(2022);
        miAuto.setcolor("Rojo");
        miAuto.setprecio(1127000.00);
        System.out.println("Marca: " + miAuto.getMarca());//concatenacion
        System.out.println("Modelo: " + miAuto.getmodelo());
        System.out.println("Año: " + miAuto.getaño());
    }
    
}

class Automovil{//TIPOS DE DATOS ABSTRACTOS
    //ATRIBUTOS - PRIVADOS
    private String marca;
    private String modelo;
    private String tipo;
    private int año;
    private String color;
    private double precio;
    //COMPORTAMIENTO
    //METODOS SET/GET
    
    public void setmarca(String valor){
        marca = valor;
    }
    public String getMarca(){
        return marca;
    }
    public void setmodelo(String valor){
        modelo = valor;
    }
    public String getmodelo(){
        return modelo;
    }
    public void settipo(String valor){
        tipo = valor;
    }
    public String gettipo(){
        return tipo;
    }
    public void setaño(int valor){
        año = valor;
    }
    public int getaño(){
        return año;
    }
    public void setcolor(String valor){
        color = valor;
    }
    public String getcolor(){
        return color;
    }
    public void setprecio(double valor){
        precio = valor;
    }
    public double getprecio(){
        return precio;
    }
    public void imprimirdatos(){
        System.out.println("Datos del vehiculo:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Año: " + año);
        System.out.println("Precio: " + precio);
    }
}