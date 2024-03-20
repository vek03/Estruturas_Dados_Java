package array_obj_exemplo;


/**
 *
 * @author Victor Cardoso
 */
public class Lista {
    private int tamanho = 10;
    private Estudante[] estudantes = new Estudante[this.tamanho];
    private int totalObj = 0;
    
    public void adiciona(Estudante obj){
        if(this.totalObj == this.estudantes.length){
            this.garantaEspaco();
        }
        this.estudantes[this.totalObj] = obj;
        this.totalObj++;
    }
    
    public void adiciona(int posicao, Estudante aluno){
        this.garantaEspaco();
        if(!this.posicaoValida(posicao)){
            throw new IllegalArgumentException("Posição inválida");
        }
        
        for(int i = this.totalObj - 1; i >= posicao; i--){
            this.estudantes[i +  1] = this.estudantes[i];
        }
        
        this.estudantes[posicao] = aluno;
        this.totalObj++;
    }
    
    public Estudante pega(int pos){
        if(!this.posicaoOcupada(pos)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        return this.estudantes[pos];
    }
    
    public void remove(int pos){
        if(!this.posicaoOcupada(pos)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        
        for(int i = pos; i < this.totalObj - 1; i++){
            this.estudantes[i] = this.estudantes[i + 1];
        }
        this.totalObj--;
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
    
    public void garantaEspaco(){
        if(this.totalObj == this.estudantes.length){
            Estudante[] newAr = new Estudante[this.estudantes.length * 2];
            
            for(int i = 0; i < this.estudantes.length; i++){
                newAr[i] = this.estudantes[i];
            }
            
            this.estudantes = newAr;
        }
    }
}