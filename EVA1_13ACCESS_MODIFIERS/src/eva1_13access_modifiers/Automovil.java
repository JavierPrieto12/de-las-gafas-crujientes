/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13access_modifiers;

/**
 *
 * @author Owner
 */
public class Automovil {
    private String marca;
    private String modelo;
    private int año;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
}

class Carreta{//MODIFICADOR DE ACCESO --> DEFAULT
    private String marca;
}
