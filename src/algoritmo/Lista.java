package algoritmo;


/**
 *
 * @author Victor Cardoso
 */
public class Lista {
    private int[] notas_competidores;
    private int totalCompetidores = 0;
    
    public Lista(int tamanho){
        this.notas_competidores = new int[tamanho];
    }
    
    public void ordenar(){
        for(int i = 0; i < this.totalCompetidores; i++){
            for(int i2 = 0; i2 < this.totalCompetidores; i2++){
                if(this.notas_competidores[i] < this.notas_competidores[i2]){
                    int atual = this.notas_competidores[i];
                    int proximo = this.notas_competidores[i2];
                    this.notas_competidores[i2] = atual;
                    this.notas_competidores[i] = proximo;
                }
            }
        }
    }
    
    public void adicionar(int competidor){
        if(this.totalCompetidores == this.notas_competidores.length){
            this.garantaEspaco();
        }
        this.notas_competidores[this.totalCompetidores] = competidor;
        this.totalCompetidores++;
    }
    
    public int pega(int pos){
        if(!this.posicaoOcupada(pos)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        return this.notas_competidores[pos];
    }
    
    public void percorrerLista(){
        if(!this.isEmpty()){
            System.out.println("\n====================");
            System.out.println("PERCORRENDO LISTA");
            
            for(int i = 0; i < this.totalCompetidores; i++){
                System.out.println("Posicao " + i + ": " + this.pega(i));
            }
            
            System.out.println("====================");
        }else{
            System.out.println("Lista Vazia!");
        }
    }
    
    public boolean posicaoValida(int pos){
        return pos >= 0 && pos < this.totalCompetidores;
    }
    
    public boolean posicaoOcupada(int pos){
        return pos >= 0 && pos <= this.totalCompetidores;
    }
    
    public void garantaEspaco(){
        if(this.isFull()){
            int[] newAr = new int[this.notas_competidores.length * 2];
            
            for(int i = 0; i < this.notas_competidores.length; i++){
                newAr[i] = this.notas_competidores[i];
            }
            
            this.notas_competidores = newAr;
        }
    }
    
    public boolean isEmpty(){
        return this.totalCompetidores == 0;
    }
    
    public boolean isFull(){
        return this.totalCompetidores == this.notas_competidores.length;
    }
}