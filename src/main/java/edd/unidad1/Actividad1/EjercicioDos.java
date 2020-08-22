package edd.unidad1.Actividad1;

/**
 *
 * @author Nico
 */
public class EjercicioDos {

    public static double division(double x, double y) {
        return x / y;
    }

    public static void main(String[] args) {
        double a = 3;
        double b = 2;
        double c = division(a, b);
        System.out.println("La division de "+a+" entre "+b+" es: \n"+c);
    }
}
