
package edd.unidad1.Actividad2;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class Ejercicio2 {
    
    private final static double PUNTAJE_LAB = 0.20;
    private final static double PUNTAJE_TPF = 0.30;
    private final static double PUNTAJE_PARCIAL = 0.50;
    
    private final static double PP= 0.40;
    private final static double PF= 0.60;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el puntaje parcial 1:");
        int parcial1 = sc.nextInt();
        
        System.out.println("Ingrese el puntaje parcial 2:");
        int parcial2 = sc.nextInt();
        
        System.out.println("Ingrese el puntaje laboratorio:");
        int laboratorios = sc.nextInt();
        
        System.out.println("Ingrese el puntaje tp final:");
        int tpFinal = sc.nextInt();
        
        System.out.println("Ingrese el puntaje final:");
        int pFinal = sc.nextInt();
        
        long promedioParcial = Math.round((parcial1 + parcial2)/2.0);
        long promedioPonderado = Math.round((PUNTAJE_LAB * laboratorios) + Math.round(PUNTAJE_TPF * tpFinal) + Math.round(PUNTAJE_PARCIAL * promedioParcial));
        
        int calificacion = 1;
        
        long puntajeFinalCalc = Math.round(promedioPonderado * PP) + Math.round(pFinal * PF);
        if(puntajeFinalCalc >= 91){
            calificacion = 5;
        }else if (puntajeFinalCalc >=81){
            calificacion = 4;
        }else if (puntajeFinalCalc >=71){
            calificacion = 3;
        }else if (puntajeFinalCalc >=60){
            calificacion = 2;
        }else{
            calificacion = 1;
        }
        limpiarPantalla();
        System.out.println("SISTEMA DE CALCULOS");
        System.out.println("puntaje laboratorios: \t\t\t"+laboratorios);
        System.out.println("puntaje trabajo final: \t\t\t"+tpFinal);
        System.out.println("puntaje primer parcial: \t\t"+parcial1);
        System.out.println("puntaje segundo parcial: \t\t"+parcial2);
        System.out.println("puntaje examen final: \t\t\t"+pFinal);
        System.out.println("puntaje FINAL CALCULADO: \t\t"+puntajeFinalCalc);
        System.out.println("CALIFICACION FINAL: \t\t\t"+calificacion);
        limpiarPantalla();
    }
    
    private static void limpiarPantalla(){
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
    }
}
