package txtatv;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

// Alunos e Matriculas: 
// Aline Bianca Arantes da Silva - 01617756 ^^
// Emerson Wallace Barcelos de Araújo - 01609132 :)
// Maria Karolina Rodrigues De Andrade - 01631286
// Maria Luiza da Silva Monteiro- 01622438

public class Gravarprod {
    public static void main(String[] args) {
        // Crie um ArrayList para armazenar objetos Regpro
        Regpro reg = new Regpro(0, null, 0, 0, 0);
        ArrayList<Regpro> listaDeProdutos = new ArrayList<>();

        Regpro.setCaminhoArquivo("C:\\temp\\Produto.txt");
        
        try{
            File ArquivoProd = new File(Regpro.getCaminhoArquivo()); 
            Scanner entrada = new Scanner(ArquivoProd); 
            int ind = 1;
 
            while (entrada.hasNextLine()) {
                reg.setLinha(entrada.nextLine());
                reg.setCodigo(Integer.parseInt(reg.getLinha().substring(0, 2)));
                reg.setDescricao(reg.getLinha().substring(3, 35));
                reg.setPreco(Double.parseDouble(reg.getLinha().substring(36, 41)));
                reg.setQtd(Integer.parseInt(reg.getLinha().substring(42, 45)));
                reg.setCategoria(Integer.parseInt(reg.getLinha().substring(46, 47)));
                ind++;
    
                listaDeProdutos.add(new Regpro(reg.getCodigo(), reg.getDescricao(), reg.getPreco(), reg.getQtd(), reg.getCategoria()));
            }
         entrada.close();
        
        // Acesse os objetos na lista
        for (Regpro produto : listaDeProdutos) {
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade: " + produto.getQtd());
            System.out.println("Categoria: "+ produto.getCategoria());
            System.out.println();
        }
         } catch (FileNotFoundException e) {
        System.out.println("Arquivo nâo encontrado caralho.");
        }
    }

}
