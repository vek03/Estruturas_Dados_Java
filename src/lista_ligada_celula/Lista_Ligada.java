package lista_ligada_celula;

import lista_ligada_celula.*;

/**
 *
 * @author Victor Cardoso
 */
public class Lista_Ligada {
    private Celula primeiro;
    private Celula ultimo;
    private int tamanho = 0;
    
    Lista_Ligada(Celula pri, Celula ult, int tam){
        this.primeiro = pri;
        this.ultimo = ult;
        this.tamanho = tam;
    }
    
    Lista_Ligada(){
        this.tamanho = 0;
    }
    
    public void criaVazia(){
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }
    
    public void adicionaFim(Celula nova){
        nova.setProxima(null);
        
        if(this.primeiro == null)
        {
            this.primeiro = nova;
            this.ultimo = nova;
        }else
        {
            ultimo.setProxima(nova);
            ultimo = nova;
        }
        
        this.tamanho++;
    }
    
    public void removeInicio(Celula nova){
        if(this.primeiro == ultimo)
        {
            this.primeiro = null;
            this.ultimo = null;
        }else
        {
            primeiro = primeiro.getProxima();
        }
        
        this.tamanho--;
    }
    
    public void percorreLista(Celula nova){
        Celula atual = this.primeiro;
        
        while(atual != null){
            atual.toString();
            atual = atual.getProxima();
        }
        
        this.tamanho--;
    }
    
    public Celula getPrimeira(){
        return this.primeiro;
    }
    
    public void setPrimeira(Celula celula){
        this.primeiro = celula;
    }
    
    public Celula getUltimo(){
        return this.ultimo;
    }
    
    public void setUltimo(Celula celula){
        this.ultimo = celula;
    }
    
    public int getTamanho(){
        return this.tamanho;
    }
    
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }
}
