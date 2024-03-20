package pilha;


/**
 *
 * @author Victor Cardoso
 */
public class Pilha {

    private int tamanho;
    private Livro topo;
    private Livro[] livros;
    private int totalObj = 0;
    
    public Pilha(int tam){
        this.tamanho = tam;
        this.livros = new Livro[this.tamanho];
    }
    
    public void listarElementos(){
        if(this.getTotalObj() != 0){
            System.out.println("\n* LISTANDO ELEMENTOS * ");
            for(int i = 0; i < this.getTotalObj(); i++){
                System.out.println("Livro da Posicao[" + i + "] = " + this.getLivros()[i].getTitulo());
            }
            System.out.println();
        }
    }
   
    public void push(Livro obj){
        if(!this.isFull()){
            this.getLivros()[this.getTotalObj()] = obj;
            this.setTotalObj(this.getTotalObj() + 1);
        }
    }
    
    public Livro pega(int pos){
        if(!this.posicaoOcupada(pos)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        return this.getLivros()[pos];
    }
    
    public Livro pop(){
        if(this.getTotalObj() <= 0){
            System.out.println("Não há elementos para remover");
            return null;
        }else{
            this.setTotalObj(this.getTotalObj() - 1);
            System.out.println(this.getTotalObj());
            this.getLivros()[this.getTotalObj()] = null;
            return this.getLivros()[this.getTotalObj()];
        }
    }
    
    public boolean contem(Livro livro){
        for(int i = 0; i < this.getTotalObj(); i++){
            if(livro.equals(this.getLivros()[i])){
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
            System.out.println("Lista Nao esta Cheia! Restam: " + (this.getTamanho() - this.getTotalObj()) + " Posicoes");
            return false;
        }
    }
    
    public boolean isEmpty(){
        if(this.getTotalObj() == 0){
            System.out.println("Lista Vazia!");
            return true;
        }else{
            System.out.println("Lista Nao esta Cheia! Restam: " + (this.getTamanho() - this.getTotalObj()) + " Posicoes");
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
     * @return the estudantes
     */
    public Livro[] getLivros() {
        return livros;
    }

    /**
     * @param estudantes the estudantes to set
     */
    public void setLivros(Livro[] estudantes) {
        this.livros = estudantes;
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
     * @return the totalObj
     */
    public Livro getTopo() {
        return topo;
    }

    /**
     * @param topo the totalObj to set
     */
    public void setTopo(Livro topo) {
        this.topo = topo;
    }
}