/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_19_buffers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Owner
 */
public class EVA3_19_BUFFERS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DEFINIR RUTA
        Path ruta = Paths.get("C:/Archivos/apunte.txt");
        //ABRIMOS EL ARCHIVO
        InputStream abrirArch;
        //LEEMOS EL ARCHIVO
        InputStreamReader leerArch;
        //CONVERTIMOS BYTES A CARACTERES
        BufferedReader leerTexto;
        
        try {
            abrirArch = Files.newInputStream(ruta);
            leerArch = new InputStreamReader (abrirArch);
            leerTexto = new BufferedReader(leerArch);
            String linea = leerTexto.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = leerTexto.readLine();
            }
            leerTexto.close();//cerrar el stream
        } catch (IOException ex) {
            Logger.getLogger(EVA3_19_BUFFERS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
