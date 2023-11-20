package txtatv;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import txtatv.Regpro;

public class Leituraquiv {
	public static void main(String[] args) {
		// Especifique o caminho para o arquivo de texto
		

		int codigo = 0;
		String nome;
		String valors;
		double valor;
		int qtd = 0;
		int categoria = 0;
		double total = 0;
		try {
			// Crie um objeto File para representar o arquivo
			File arquivo = new File(Regpro.getCaminhoArquivo());
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
				System.out.println(codigo + " - " + nome + " - " + valor + " - " + qtd + " - " + categoria);
				total = total + (valor * qtd);
			}
			System.out.println("O total foi: " + total);
			// Feche o Scanner após a leitura do arquivo
			leitor.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado: " + Regpro.getCaminhoArquivo());
		}
	}
}
