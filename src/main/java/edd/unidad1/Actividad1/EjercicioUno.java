
package edd.unidad1.Actividad1;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class EjercicioUno {
    
    public static void main(String[] args) {
        int numeroUno;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero de 1 digito: ");
        
        numeroUno = teclado.nextInt();
        
        System.out.println("La tabla de "+numeroUno+"es: ");
        
        for (int i = 0; i < 10; i++) {
            System.out.println( numeroUno*(i+1) );
        }
        
        
    }
}
