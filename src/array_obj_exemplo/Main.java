package array_obj_exemplo;

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
        
        
        vetor.adiciona(a1);
        vetor.adiciona(a2);
        vetor.adiciona(a3);
        vetor.adiciona(0, a4);

        if(vetor.tamanho() != 4){
            System.out.println("Erro: O tamanho da lista está errado");
        }else{
            System.out.println("1° Teste OK!");
        }
        
        if(!vetor.contem(a1)){
            System.out.println("Erro: Não achou um aluno que existe");
        }else{
            System.out.println("2° Teste OK!");
        }
        
        vetor.remove(0);
        
        if(vetor.tamanho() != 3){
            System.out.println("Erro: O tamanho da lista está errado");
        }else{
            System.out.println("3° Teste OK!");
        }
        
        if(vetor.contem(a4)){
            System.out.println("Erro: Achou um aluno que não existe");
        }else{
            System.out.println("4° Teste OK!");
        }
    }
}