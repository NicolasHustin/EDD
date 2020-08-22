
package edd.unidaddos.actividad1;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Nico
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
         if(args.length == 0){
             System.out.println("ingrese el nombre de un archivo");
         }else{
             for (int i = 0; i < args.length; i++) {
                 String archivo = args[i];
                 cuentaPalabrasRepetidas(archivo);
             }
         }
    }
    
    private static void cuentaPalabrasRepetidas(String archivo){
        try {
            Diccionario d = new Diccionario();
            BufferedReader reader = new BufferedReader ( new FileReader(archivo));
            String linea ;
            while ( (linea = reader.readLine()) != null){
                String[] palabras = linea.split(" ");
                for (int i = 0; i < palabras.length; i++) {
                    String p = palabras [i];
                    if( p != null && p.trim().length() >0){
                        d.aumentarPalabra(p);
                    }
                }
            }
            reader.close();
            d.insertionSort();
            System.out.println("palabras repetidas en el archivo: "+ archivo);
            d.impimir(10);
        } catch (Exception e) {
            System.out.println(" no se pudo leer el archivo especificado.");
        }
    }
    
}
