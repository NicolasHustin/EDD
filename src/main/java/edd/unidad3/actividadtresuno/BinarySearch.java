
package edd.actividadtresuno;

import java.util.Scanner;

/**
 *
 * @author Nicolás Hustin (nicolashustin@fpuna.edu.py)
 */
public class BinarySearch {
    
    public static void main(String[] args) {
        
        long tiempoUno, tiempoDos, tiempoTotal;
        int tamañoVector, numberSearch;
        
        if (args.length > 0){
            tamañoVector = Integer.parseInt(args[0]);
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el tamaño del vector: ");
            tamañoVector = sc.nextInt();
        }
        
        try {
            NBusquedasBinarias buscador = new NBusquedasBinarias(tamañoVector);
            System.out.println("DEBUG: se procede a rellenar el vector -> method: NBusquedasBinarias.rellenarVector()");
            buscador.rellenarVector();
            System.out.println("DEBUG: se imprime el vector tal y como se relleno -> method: NBusquedasBinarias.imprimir()");
            buscador.impimir();
            System.out.println("DEBUG: se ordena mediante el metodo insertionSort -> method: NBusquedasBinarias.insertionSort()");
            buscador.insertionSort();
            System.out.println("DEBUG: se imprime el vector ordenado -> method: NBusquedasBinarias.imprimir()");
            buscador.impimir();
            tiempoUno = System.nanoTime();
            for (int i = 0; i < tamañoVector; i++) {
                numberSearch = (int) (Math.random() * 500);
                System.out.println("Buscando el elemnto "+numberSearch+"...");
                int pos = buscador.buscarElemento(numberSearch);
                if( pos >= 0 ){
                    System.out.println("Encontrando en posicion: "+pos);
                }
            }
            tiempoDos = System.nanoTime();
            tiempoTotal = tiempoDos - tiempoUno ;
            System.out.println("\nTiempo para N = "+tamañoVector+" es: "+tiempoTotal/1000000);
        } catch (Exception e) {
            System.out.println("Ocurrio un error durante la ejecucion -> " + e.getMessage() );
        }
    }
}
