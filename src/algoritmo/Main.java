package algoritmo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Victor Cardoso
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("SOLUCAO DE PROBLEMAS UTILIZANDO ALGORITMOS");
        
        System.out.println("\nSELECIONE O ARQUIVO DE ENTRADA: ");
        
        JFileChooser fileChooser = new JFileChooser();
        
        // Define o filtro para exibir apenas arquivos .txt
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de texto", "txt");
        fileChooser.setFileFilter(filter);
        
        // Exibe o seletor de arquivo para o usuário selecionar um arquivo
        int result = fileChooser.showOpenDialog(null);
        
        // Verifica se o usuário selecionou um arquivo
        if (result == JFileChooser.APPROVE_OPTION) {
            System.out.println("\nARQUIVO SELECIONADO! ");
            File selectedFile = fileChooser.getSelectedFile();
            int classificados = contarClassificados(selectedFile);

            System.out.println("\nNÚMERO DE CLASSIFICADOS: " + classificados);
        } else {
            System.out.println("Nenhum arquivo selecionado.");
        }
    }
    
    public static int contarClassificados(File arquivo) {
        try {
            System.out.println("\nLENDO ARQUIVO... ");
            
            Lista notas;
            int N;
            int K;
            
            try 
            (
                FileReader fileReader = new FileReader(arquivo);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
            ) 
            {
                String linha;
                notas = new Lista(10);
                N = parseInt(bufferedReader.readLine()); //número de competidores
                K = parseInt(bufferedReader.readLine()); //número de minimo de aprovados
                while ((linha = bufferedReader.readLine()) != null) {
                    notas.adicionar(parseInt(linha));
                }              
            }
            
            return contar(N, K, notas);

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            return 0;
        }
    }
    
    public static int contar(int N, int K, Lista notas){
        System.out.println("\nCALCULANDO APROVADOS... ");
        
        notas.ordenar();
        
        notas.percorrerLista();

        int classificados = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (notas.pega(i) >= notas.pega(N - K) && notas.pega(i) > 0) {
                classificados++;
            } else {
                break;
            }
        }
            
        return classificados;
    }
}
