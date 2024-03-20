package fila_encadeada;


/**
 *
 * @author Victor Cardoso
 */
public class Celula {
    private Celula proxima;
    private Pessoa elemento;
    
    public Celula(Celula proxima, Pessoa elemento){
        this.proxima = proxima;
        this.elemento = elemento;
    }
    
    public Celula(Pessoa elemento){
        this.elemento = elemento;
        this.proxima = null;
    }
    
    public Celula getProxima(){
        return this.proxima;
    }
    
    public void setProxima(Celula proxima){
        this.proxima = proxima;
    }
    
    public Pessoa getElemento(){
        return this.elemento;
    }
    
    public void setElemento(Pessoa elemento){
        this.elemento = elemento;
    }
}
