package edd.actividadtresuno;

/**
 *
 * @author Nicolás Hustin (nicolashustin@fpuna.edu.py)
 */
public class NBusquedasBinarias {

    private int vector[];
    private int N;

    public NBusquedasBinarias(int N) throws Exception {
        if (N >= 10 && N <= 10000) {
            this.N = N;
            this.vector = new int[N];
        } else {
            throw new Exception("El valor debe estar entre 10 y 10.000");
        }
    }

    public void rellenarVector() {
        for (int i = 0; i < N; i++) {
            this.vector[i] = (int) (Math.random() * 500);
        }
    }

    public void insertionSort() {
        int Medio = 0;
        for (int i = 1; i < N; i++) {
            int temp = vector[i];
            int Izq = 0;
            int Der = i - 1;
            while (Izq <= Der) {
                Medio = (Izq + Der) / 2;
                if (temp < vector[Medio]) {
                    Der = Medio - 1;
                } else {
                    Izq = Medio + 1;
                }
            }
            for (int j = i - 1; j >= Izq; j--) {
                vector[j + 1] = vector[j];
            }
            vector[Izq] = temp;
        }
    }

    public void impimir() {
        int c = 0;
        for (int i = 0; i < N; i++) {
            System.out.print(vector[i] + ", ");
            c++;
        }
        System.out.println("");
    }

    public int buscarElemento(int numero) {
        return privBusquedaBinaria(numero);
    }
    
    private int privBusquedaBinaria(int numero){
        int inicio, fin, posicion;
        inicio = 0;
        fin = vector.length -1;
        while ( inicio <= fin ) {
            posicion = (inicio + fin) / 2 ;
            if ( vector[posicion] == numero ){
                return posicion;
            } else if ( vector[posicion] < numero ) {
                inicio = posicion + 1;
            } else {
                fin = posicion -1 ;
            }
        }
        return -1 ;
    }
}
