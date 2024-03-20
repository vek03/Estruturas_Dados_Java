package array_obj_att;

/**
 *
 * @author Victor Cardoso
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista vetor = new Lista();
        
        Estudante a1 = new Estudante("Victor", 22301);
        Estudante a2 = new Estudante("Julio", 22302);
        Estudante a3 = new Estudante("Eliel", 22303);
        Estudante a4 = new Estudante("Roma", 22304);
        
        vetor.remove(3);
        
        
        vetor.adiciona(a1);
        vetor.adicionaInicio(a2);
        vetor.adiciona(a3);
        vetor.adicionaPosicao(0, a4);
        vetor.listarElementos();

        if(vetor.tamanho() != 4){
            System.out.println("Teste 1 Erro: O tamanho da lista esta errado");
        }else{
            System.out.println("Teste 1 OK! Tamanho correto");
        }
        
        if(!vetor.contem(a1)){
            System.out.println("Teste 2 Erro: Nao achou um aluno que deveria existir");
        }else{
            System.out.println("Teste 2 OK! Alunos adicionados");
        }
        
        vetor.remove(0);
        
        if(vetor.tamanho() != 3){
            System.out.println("Teste 3 Erro: O tamanho da lista está errado");
        }else{
            System.out.println("Teste 3 OK! Tamanho correto");
        }
        
        if(vetor.contem(a4)){
            System.out.println("Teste 4 Erro: Achou um aluno que não deveria existir mais");
        }else{
            System.out.println("Teste 4 OK! Roma Excluido");
        }
        
        if(vetor.estaCheia()){
            System.out.println("Teste 5 Erro: Lista nao deveria estar cheia!");
        }else{
            System.out.println("Teste 5 OK! Lista nao esta cheia");
        }
        
        Estudante a5 = new Estudante("Gabriel", 22305);
        Estudante a6 = new Estudante("Henrique", 22306);
        Estudante a7 = new Estudante("Joao", 22307);
        Estudante a8 = new Estudante("Danilo", 22308);
        Estudante a9 = new Estudante("Guilherme", 22309);
        Estudante a10 = new Estudante("Erick", 22310);
        Estudante a11 = new Estudante("Edward", 22311);
        
        vetor.adiciona(a5);
        vetor.adiciona(a6);
        vetor.adiciona(a7);
        vetor.adiciona(a8);
        vetor.adiciona(a9);
        vetor.adiciona(a10);
        vetor.adiciona(a11);
        
        vetor.listarElementos();
        
        if(!vetor.estaCheia()){
            System.out.println("Teste 6 Erro: Lista deveria estar cheia!");
        }else{
            System.out.println("Teste 6 OK! Lista Cheia");
        }
    }
}