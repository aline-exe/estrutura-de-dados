package meupacote;

// 2MD

// Alunos
// Aline Bianca Arantes da Silva - 01617756
// Emerson Wallace Barcelos de Araújo - 01609132
// Maria karolina Rodrigues de Andrade - 01631286
// Maria Luiza da Silva Monteiro - 01622438

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leituraquiv {
	public static void main(String[] args) {
		// Especifique o caminho para o arquivo de texto
		String caminhoArquivo = "C:\\temp\\produto.txt";

		int codigo = 0;
		String nome;
		String valors;
		double valor;
		int qtd = 0;
		int categoria = 0;
		double total = 0;
		int qtd1 = 0; // essa porra aqui é oq?
		try {
			// Crie um objeto File para representar o arquivo
			File arquivo = new File(caminhoArquivo);
			// Crie um objeto Scanner para ler o conteúdo do arquivo
			Scanner leitor = new Scanner(arquivo);
			// Use um loop para ler e imprimir cada linha do arquivo
			while (leitor.hasNextLine()) {
				String linha = leitor.nextLine();
				codigo = Integer.parseInt(linha.substring(0, 2));
				nome = linha.substring(3, 34);
				valors = linha.substring(36, 41);
				valor = Double.parseDouble(valors);
				valor = valor / 100;
				qtd = Integer.parseInt(linha.substring(43, 45));
				categoria = Integer.parseInt(linha.substring(46, 47));
				System.out.println(codigo + " - " + nome);
				total = total + (valor * qtd);
			}
			System.out.println("O total foi: " + total);
			// Feche o Scanner após a leitura do arquivo
			leitor.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado: " + caminhoArquivo);
		}
	}
}
