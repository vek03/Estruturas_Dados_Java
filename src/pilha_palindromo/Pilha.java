package pilha_palindromo;


/**
 *
 * @author Victor Cardoso
 */
public class Pilha implements Cloneable  {

    private int tamanho;
    private String topo;
    private String[] palavra;
    private int totalObj = 0;
    
    public Pilha(int tam){
        this.tamanho = tam;
        this.palavra = new String[this.tamanho];
    }
    
    public void listarElementos(){
        if(this.getTotalObj() != 0){
            System.out.println("\n* LISTANDO ELEMENTOS * ");
            for(int i = 0; i < this.getTotalObj(); i++){
                System.out.println("Livro da Posicao[" + i + "] = " + this.getPalavra()[i]);
            }
            System.out.println();
        }
    }
    
    public boolean equal(Pilha p){
        for(int i = 0; i < this.totalObj; i++){
            if(this.getPalavra()[i].equals(p.getPalavra()[i])){
                return true;
            }
        }
        
        return false;
    }
    
    public String pop(){
        String r = "";
        if(this.getTotalObj() <= 0){
            System.out.println("Não há elementos para remover");
        }else{
            this.setTotalObj(this.getTotalObj() - 1);
            this.setTopo(this.getPalavra()[this.getTotalObj()]);
            r = this.getPalavra()[this.getTotalObj()];
            this.getPalavra()[this.getTotalObj()] = null;
        }
        
        return r;
    }
   
    public void push(String elemento){
        if(!this.isFull()){
            this.getPalavra()[this.getTotalObj()] = elemento;
            this.setTotalObj(this.getTotalObj() + 1);
        }
    }
    
    public String pega(int pos){
        if(!this.posicaoOcupada(pos)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        return this.getPalavra()[pos];
    }
    
    public boolean contem(String letra){
        for(int i = 0; i < this.getTotalObj(); i++){
            if(letra.equals(this.getPalavra()[i])){
                return true;
            }
        }
        return false;
    }
    
    public int tamanho(){
        return this.getTotalObj();
    }
    
    public boolean posicaoValida(int pos){
        return pos >= 0 && pos < this.getTotalObj();
    }
    
    public boolean posicaoOcupada(int pos){
        return pos >= 0 && pos <= this.getTotalObj();
    }
    
    public boolean isFull(){
        if(this.getTamanho() == this.getTotalObj()){
            System.out.println("Lista Cheia!");
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isEmpty(){
        if(this.getTotalObj() == 0){
            System.out.println("Lista Vazia!");
            return true;
        }else{
            return false;
        }
    }
    
        /**
     * @return the tamanho
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the palavra
     */
    public String[] getPalavra() {
        return palavra;
    }

    /**
     * @param palavra the estudantes to set
     */
    public void setPalavra(String[] palavra) {
        this.palavra = palavra;
    }

    /**
     * @return the totalObj
     */
    public int getTotalObj() {
        return totalObj;
    }

    /**
     * @param totalObj the totalObj to set
     */
    public void setTotalObj(int totalObj) {
        this.totalObj = totalObj;
    }
    
    /**
     * @return the topo
     */
    public String getTopo() {
        return topo;
    }

    /**
     * @param topo the totalObj to set
     */
    public void setTopo(String topo) {
        this.topo = topo;
    }
}