package pilha;


/**
 *
 * @author Victor Cardoso
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha vetor = new Pilha(10);
        
        Livro l1 = new Livro("Literatura", 22301);
        Livro l2 = new Livro("Matematica", 22302);
        Livro l3 = new Livro("Historia", 22303);
        Livro l4 = new Livro("Ciencias", 22304);
        
        vetor.pop();
        
        vetor.push(l1);
        vetor.push(l2);
        vetor.push(l3);
        vetor.push(l4);
        vetor.listarElementos();

        if(vetor.tamanho() != 4){
            System.out.println("Teste 1 Erro: O tamanho da lista esta errado");
        }else{
            System.out.println("Teste 1 OK! Tamanho correto");
        }
        
        if(!vetor.contem(l1)){
            System.out.println("Teste 2 Erro: Nao achou um elemento que deveria existir");
        }else{
            System.out.println("Teste 2 OK! Elementos adicionados");
        }
        
        vetor.pop();
        
        if(vetor.tamanho() != 3){
            System.out.println("Teste 3 Erro: O tamanho da lista está errado");
        }else{
            System.out.println("Teste 3 OK! Tamanho correto");
        }
        
        if(vetor.contem(l4)){
            System.out.println("Teste 4 Erro: Achou um elemento que não deveria existir mais");
        }else{
            System.out.println("Teste 4 OK! Elemento Excluido");
        }
        
        if(vetor.isFull()){
            System.out.println("Teste 5 Erro: Lista nao deveria estar cheia!");
        }else{
            System.out.println("Teste 5 OK! Lista nao esta cheia");
        }
        
        Livro l5 = new Livro("Quantica", 22305);
        Livro l6 = new Livro("Engenharia", 22306);
        Livro l7 = new Livro("Eletrica", 22307);
        Livro l8 = new Livro("Geografia", 22308);
        Livro l9 = new Livro("Fisica", 22309);
        Livro l10 = new Livro("Quimica", 22310);
        Livro l11 = new Livro("Filosofia", 22311);
        
        vetor.push(l5);
        vetor.push(l6);
        vetor.push(l7);
        vetor.push(l8);
        vetor.push(l9);
        vetor.push(l10);
        vetor.push(l11);
        
        vetor.listarElementos();
        
        if(!vetor.isFull()){
            System.out.println("Teste 6 Erro: Lista deveria estar cheia!");
        }else{
            System.out.println("Teste 6 OK! Lista Cheia");
        }
    }
}