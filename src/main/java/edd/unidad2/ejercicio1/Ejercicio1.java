
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        //para probar
        String cadena1 = "nico";
        //String cadena1 = sc.nextLine();
        System.out.println("Ingrese otra cadena");
        //para probar
        String cadena2 = "nicolas";
        //String cadena2 = sc.nextLine();
        
        boolean resultado = esSubCadena(cadena1, cadena2);
        System.out.println("--------------------------------");
        System.out.println("La cadena: '"+cadena1+"' es sub cadena de '"+cadena2+"'");
        System.out.println("Resultado: "+resultado);
        System.out.println("-----------------------------------");
    }
    
    public static boolean esSubCadena(String cadena1, String cadena2){
        
        boolean esSub = false;
        int l1 = cadena1.length();
        int l2 = cadena2.length();
        int contador1 = 0;
        int contador2 = 0;
        
        if(l1 <= l2){
            while((contador2 < l2) && !esSub){
                if(cadena1.charAt(contador1) == cadena2.charAt(contador2)){
                    contador1 ++;
                    contador2 ++;
                    if(contador1 == l1){
                        esSub = true;
                    }
                } else if ( contador1 > 0){
                    contador1 = 0;
                }else {
                    contador2 ++;
                }
            }
        }
        return esSub;
    }
    
    
}
