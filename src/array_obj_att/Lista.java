package array_obj_att;


/**
 *
 * @author Victor Cardoso
 */
public class Lista {
    private int tamanho = 10;
    private Estudante[] estudantes = new Estudante[this.tamanho];
    private int totalObj = 0;
    
    public void listarElementos(){
        if(this.totalObj != 0){
            System.out.println("\n* LISTANDO ELEMENTOS * ");
            for(int i = 0; i < this.totalObj; i++){
                System.out.println("Estudante da Posicao[" + i + "] = " + this.estudantes[i].nome);
            }
            System.out.println();
        }
    }
   
    public void adiciona(Estudante obj){
        if(!this.estaCheia()){
            this.estudantes[this.totalObj] = obj;
            this.totalObj++;
        }
    }
    
    public void adicionaInicio(Estudante aluno){
        if(!this.estaCheia()){
            for(int i = this.totalObj - 1; i >= 0; i--){
                this.estudantes[i +  1] = this.estudantes[i];
            }
            
            this.estudantes[0] = aluno;
            this.totalObj++;
        }
    }
    
    public void adicionaPosicao(int posicao, Estudante aluno){
        if(!this.estaCheia()){
            if(!this.posicaoValida(posicao)){
                System.out.println("Posicao Invalida para Adicionar!");
            }

            for(int i = this.totalObj - 1; i >= posicao; i--){
                this.estudantes[i +  1] = this.estudantes[i];
            }

            this.estudantes[posicao] = aluno;
            this.totalObj++;
        }
    }
    
    public Estudante pega(int pos){
        if(!this.posicaoOcupada(pos)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        return this.estudantes[pos];
    }
    
    public void remove(int pos){
        if(!this.posicaoOcupada(pos) && !this.posicaoValida(pos)){
            System.out.println("Posicao Invalida para Remover ou Lista Vazia");
        }else{
            for(int i = pos; i < this.totalObj - 1; i++){
            this.estudantes[i] = this.estudantes[i + 1];
            }
            this.totalObj--;
        }
    }
    
    public boolean contem(Estudante aluno){
        for(int i = 0; i < this.totalObj; i++){
            if(aluno.equals(this.estudantes[i])){
                return true;
            }
        }
        return false;
    }
    
    public int tamanho(){
        return this.totalObj;
    }
    
    public boolean posicaoValida(int pos){
        return pos >= 0 && pos < this.totalObj;
    }
    
    public boolean posicaoOcupada(int pos){
        return pos >= 0 && pos <= this.totalObj;
    }
    
    public boolean estaCheia(){
        if(this.tamanho == this.totalObj){
            System.out.println("Lista Cheia!");
            return true;
        }else{
            System.out.println("Lista Nao esta Cheia! Restam: " + (this.tamanho - this.totalObj) + " Posicoes");
            return false;
        }
    }
}