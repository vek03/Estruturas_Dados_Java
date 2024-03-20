package fila_encadeada;

import fila_encadeada.Celula;

/**
 *
 * @author Victor Cardoso
 */
public class Fila_Encadeada {
    private Celula primeiro;
    private Celula ultimo;
    private int tamanho;
    
    Fila_Encadeada(Celula pri, Celula ult){
        this.primeiro = pri;
        this.ultimo = ult;
        this.ultimo.setProxima(null);
        this.tamanho = 2;
    }
    
    Fila_Encadeada(){
        this.tamanho = 0;
    }
    
    public void enfileirar(Pessoa nova){
        if(this.primeiro == null)
        {
            Celula n = new Celula(nova);
            this.primeiro = n;
            this.ultimo = n;
            this.tamanho++;
        }else
        {
            Celula novaCelula = new Celula(nova);
            ultimo.setProxima(novaCelula);
            ultimo = novaCelula;
            this.tamanho++;
        }
    }
    
    public Pessoa desenfileirar(){
        if(this.isEmpty())
        {
            this.primeiro = null;
            this.ultimo = null;
            this.tamanho = 0;
            
            return null;
        }else
        {
            Celula pri = this.primeiro;
            this.primeiro = pri.getProxima();
            this.tamanho--;
            
            return pri.getElemento();
        }
    }
    
    public int tamanho(){
        return this.getTamanho();
    }
    
    public boolean isEmpty(){
        return (this.primeiro == this.ultimo);
    }
    
    public void percorreLista(){
        if(!this.isEmpty())
        {
            Celula atual = this.primeiro;

            int i = 1;

            System.out.println("\n========================");
            System.out.println("IMPRIMINDO FILA");

            while(atual != null){
                System.out.println(i + " Posicao: " + atual.getElemento().getNome());
                atual = atual.getProxima();
                i++;
            }

            System.out.println("========================");
        }else{
            System.out.println("Fila Vazia!");
        }
    }
    
    public Celula getPrimeiro(){
        return this.primeiro;
    }
    
    public void setPrimeiro(Celula celula){
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
