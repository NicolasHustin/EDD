
package edd.Actividad1;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class EjercicioCuatro {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        if ( edad == 37){
            System.out.println("Felicidades... cumples la condicion de tener 37 años!");
        }else{
            System.out.println("No tienes 37 años...");
        }
    }
}
