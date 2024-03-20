package pilha_palindromo;


/**
 *
 * @author Victor Cardoso
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palavra = "ARARA";
        int tamanho = palavra.length();
        Pilha original = new Pilha(tamanho);
        Pilha aux = new Pilha(tamanho);
        Pilha ps = new Pilha(tamanho);
        
        for(int i = 0; i < palavra.length(); i++){
            original.push(palavra.charAt(i) + "");
        }
        
        for(int i = 0; i < palavra.length(); i++){
            aux.push(palavra.charAt(i) + "");
        }
        
        if(original.equal(aux)){
            System.out.println("Teste OK! A Pilha Auxiliar é igual a original");
        }else{
            System.out.println("erro: A Pilha Aauxiliar é diferente da original");
        }
        
        int loops = aux.getTotalObj();
        
        for(int i = 0; i < loops; i++){
            ps.push(aux.pop());
        }
        
        System.out.println();
        if(aux.isEmpty()){
            System.out.println("Teste OK! A Pilha Auxiliar foi esvaziada");
        }else{
            System.out.println("erro: A Pilha Auxiliar NAO foi esvaziada!");
        }
        
        ps.listarElementos();
        
        if(ps.equal(original)){
            System.out.println("Teste OK! A Pilha final é igual a original");
        }else{
            System.out.println("erro: A Pilha final é diferente da original");
        }
    }
}