
package edd.unidaddos.actividad1;

/**
 *
 * @author Nico
 */
public class Diccionario {
    private CuentaPalabras[] listaP ;
     private int CONT;
    private int contadorElementos;
    
    
    public Diccionario(){
        CONT = 1000;
        contadorElementos = 0;
        listaP = new edd.unidaddos.actividad1.CuentaPalabras[CONT];
    }
    
    public int getCantidadElementos(){
        return contadorElementos;
    }
    
    public void aumentarPalabra(String palabra) throws Exception{
        if(palabra != null && palabra.trim().length() > 0){
            String key = palabra.trim();
            int posItem = elemento(key);
            if(posItem == -1){
                if(contadorElementos < CONT){
                    listaP[contadorElementos] = new CuentaPalabras(key, 1);
                    contadorElementos ++ ;
                }else{
                    throw new Exception("ya no se pueden insertar mas palabras");
                }
            }else{
                listaP[posItem].aumentarRepeticiones();
            }
        }else{
            throw new Exception("la palabara a insertar no puede ser vacia");
        }
    }
    
    private int elemento(String key){
        int pos= -1;
        for (int i = 0; i < contadorElementos; i++) {
            if(listaP[i].getPalabra().compareTo(key) == 0){
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public void insertionSort(){
        int aux = contadorElementos;
        for (int i = 0; i < aux; i++) {
            CuentaPalabras c = listaP[i];
            int j = i-1;
            while( (j>-1) && (listaP[j].getNroRepeticiones() > c.getNroRepeticiones())){
                listaP[j+1]=listaP[j];
                j--;
            }
            listaP[j+1] = c ;
        }
    }
    
    public void impimir(int contadorDeFilas){
        int c = 0;
        for (int i = contadorElementos-1; i >= 0 && c <= contadorDeFilas; i--) {
            System.out.println(listaP[i]);
            c++;
        }
    }
}
