
package edd.unidad1.Actividad1;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class EjercicioTres {
    
    public static void main(String[] args) {
        
        int numero = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 7: ");
        numero = sc.nextInt();
        while (numero>7 || numero<1){
            System.out.println("Error: debe ingresar un numero del 1 al 7");
            numero = sc.nextInt();
        }
        switch(numero){
            case 1:
                System.out.println("El numero 1 corresponde al dia Domingo");
                break;
            case 2:
                System.out.println("El numero 2 corresponde al dia LUNES");
                break;
            case 3:
                System.out.println("El numero 3 corresponde al dia MARTES");
                break;
            case 4:
                System.out.println("El numero 4 corresponde al dia MIERCOLES");
                break;
            case 5:
                System.out.println("El numero 5 corresponde al dia JUEVES");
                break;
            case 6:
                System.out.println("El numero 6 corresponde al dia VIERNES");
                break;
            case 7:
                System.out.println("El numero 7 corresponde al dia SABADO");
                break;
        }
        
    }
    
    
}
