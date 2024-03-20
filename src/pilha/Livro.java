package pilha;


/**
 *
 * @author Victor Cardoso
 */
public class Livro {

    private String titulo;
    private int cod;
    
    Livro(String tit, int id){
        this.titulo = tit;
        this.cod = id;
    }
    
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }
}
