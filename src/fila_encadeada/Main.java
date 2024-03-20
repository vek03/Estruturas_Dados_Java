package fila_encadeada;

import fila_encadeada.*;

/**
 *
 * @author Victor Cardoso
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila_Encadeada fila = new Fila_Encadeada();
        
        if(fila.isEmpty()){
            System.out.println("Teste 1 OK: Fila esta vazia!");
        }else{
            System.out.println("Erro 1: Fila nao esta vazia!");
        }
        
        fila.percorreLista();
        System.out.println("Tamanho da Fila: " + fila.tamanho());
        
        Pessoa p1 = new Pessoa("Victor", 18);
        Pessoa p2 = new Pessoa("Roma", 18);
        Pessoa p3 = new Pessoa("Juan", 17);
        Pessoa p4 = new Pessoa("Eliel", 17);
        Pessoa p5 = new Pessoa("Gabriel", 16);
        
        fila.desenfileirar();
        
        fila.enfileirar(p1);
        fila.enfileirar(p2);
        fila.enfileirar(p3);
        fila.enfileirar(p4);
        
        fila.percorreLista();
        
        System.out.println("\nPessoa Retirada: " + fila.desenfileirar().getNome());
        
        fila.percorreLista();
        
        fila.enfileirar(p5);
        
        System.out.println("\nPessoa Adicionada: " + p5.getNome());
        
        fila.percorreLista();
        
        System.out.println("\nPrimeiro da Fila: " + fila.getPrimeiro().getElemento().getNome());
        
        System.out.println("Segundo da Fila: " + fila.getPrimeiro().getProxima().getElemento().getNome());
        
        System.out.println("Ultimo da Fila: " + fila.getUltimo().getElemento().getNome());

        System.out.println("Tamanho da Fila: " + fila.tamanho());
    }
}