package fila_encadeada;


/**
 *
 * @author Victor Cardoso
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    
    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
