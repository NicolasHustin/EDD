
package edd.unidad1.Actividad1;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class EjercicioCinco {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer año = 0;
        System.out.println("Ingrese un año para saber si es bisiesto:");
        año = sc.nextInt();
        if( (año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0)){
            System.out.println("El año es bisiesto !!"); 
        }else{
            System.out.println("El año NO es bisiesto");
        }
    }
}
