package edd.unidaddos.actividad1;

/**
 *
 * @author Nico
 */
//objeto reutilizado del ejercicio de la semana pasada.
public class CuentaPalabras {

    public String palabra;
    public int nroRepeticiones;

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) throws Exception {
        if(palabra != null && palabra.trim().length() > 0){
            this.palabra=palabra;
            
        }else{
            throw new Exception ("la palabra esta vacia");
        }
    }

    public int getNroRepeticiones() {
        return nroRepeticiones;
    }

    public void setNroRepeticiones(int nroRepeticiones) throws Exception{
        if ( nroRepeticiones >=0 ){
            this.nroRepeticiones = nroRepeticiones;
            
        }else{
            throw new Exception ("La cantidad de repeticiones debe ser mayor o igual a 0");
        }
    }

    public CuentaPalabras(String palabra, int nroRepeticiones) throws Exception {
        setPalabra(palabra);
        setNroRepeticiones(nroRepeticiones);
    }

    void aumentarRepeticiones(){
        try {
            setNroRepeticiones(getNroRepeticiones()+1);
        } catch (Exception e) {
            this.nroRepeticiones=0;
        }
    }

    @Override
    public String toString() {
        return "CuentaPalabras{" + "palabra=" + palabra + ", nroRepeticiones=" + nroRepeticiones + '}';
    }
    
    
}
