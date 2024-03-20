package lista_ligada_celula;

import lista_ligada_celula.*;

/**
 *
 * @author Victor Cardoso
 */
public class Celula {
    private Celula proxima;
    private Estudante elemento;
    
    public Celula(Celula proxima, Estudante elemento){
        this.proxima = proxima;
        this.elemento = elemento;
    }
    
    public Celula(Estudante elemento){
        this.elemento = elemento;
    }
    
    public Celula getProxima(){
        return this.proxima;
    }
    
    public void setProxima(Celula proxima){
        this.proxima = proxima;
    }
    
    public Object getElemento(){
        return this.elemento;
    }
    
    public void setElemento(Estudante elemento){
        this.elemento = elemento;
    }
}
