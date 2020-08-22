
package edd.unidaddos.actividad1;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Nico
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("ingrese el nombre de un archivo");
        }else{
            long sumas[] = new long [args.length];
            for (int i = 0; i<sumas.length; i++) {
                String archivo = args[i];
                sumas[i] = testsum(archivo);
            }
            
            for (int i=0; i < 10; i++) {
                System.out.println("El testum del archivo ("+args[i]+") es: "+sumas[i]);
            }
        }
    }
    
    public static long testsum(String archivo){
        long contador = 0;
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            String line;
            while((line = reader.readLine()) != null){
                for (int i = 0; i < line.length(); i++) {
                    contador = contador + line.charAt(i);
                }
            } 
            reader.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo,  "+e.getMessage());
        }
        
        return contador;
    }
}
