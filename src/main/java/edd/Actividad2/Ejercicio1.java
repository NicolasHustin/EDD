/*
Se tiene una cadena de texto almacenada en un String, con una lista larga de palabras (varias
repetidas). Escriba un programa Java que permita recorrer esta cadena de texto y generar en pantalla el
listado de las 3 palabras que más veces se repite
*/
package edd.Actividad2;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String texto = sc.nextLine();
        String texto = "obtener un elemento de un arreglo y cambiar un elemento";
        
        CuentaPalabras [] arrayPalabras = new CuentaPalabras[100];
        
        String[] palabras = texto.split(" ");
        int contador = 0 ;
        
        for (int i = 0; i < palabras.length; i++) {
            String palabraLeida = palabras[i];
            int posicionActual= 0;
            
            CuentaPalabras palabraActual = arrayPalabras[posicionActual];
            
            while(palabraActual!= null){
                if(palabraActual.palabra.equalsIgnoreCase(palabraLeida)){
                    palabraActual.nroRepeticiones ++;
                    break;
                }else{
                    posicionActual ++;
                    palabraActual = arrayPalabras[posicionActual];
                }
            }
            
            if(palabraActual == null){
                CuentaPalabras elementoNuevo = new CuentaPalabras();
                elementoNuevo.palabra = palabraLeida;
                elementoNuevo.nroRepeticiones = 1;
                arrayPalabras[posicionActual] = elementoNuevo;
                contador++;
            }
        }
        
        System.out.println("Resultado de las 3 palabras :");
        insertionSort(arrayPalabras, contador);
        for (int i = 0; i < 3; i++) {
            System.out.printf("Palabra: %s, se repite %d veces. \n", arrayPalabras[i].palabra , arrayPalabras[i].nroRepeticiones);
        }
        
        
    }
    
    private static void insertionSort(CuentaPalabras[] array, int cant){
        for (int i = 1; i < cant; i++) {
            CuentaPalabras elemento = array[i];
            int j= i-1;
            while (( j > -1) && (array[j].nroRepeticiones < elemento.nroRepeticiones)){
                array [j+1] = array [j];
                j--;
            }
            array[j+1] = elemento;
        }
    }
    
 
}
