package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import entities.ExcercicioProduto;

public class Excercicio_Diretorio_LerArq {

	public static void main(String[] args) {

		String caminho = ".\\.\\PastaBase\\produtos.txt";
		String caminho2 = ".\\.\\PastaBase\\out";

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

			ArrayList<ExcercicioProduto> listaprodutos = new ArrayList<>();
			

			String[] item;
			String line = br.readLine();
			while (line != null) {
				item = line.split(",");
				System.out.println("Descrição: " + item[0] + " - Valor: "
						+ Double.parseDouble(item[1]) + " - Quantidade: " + Integer.parseInt(item[2]));

				listaprodutos.add(new ExcercicioProduto(item[0], Double.parseDouble(item[1]), Integer.parseInt(item[2])));
				line = br.readLine();
			}
			System.out.println("-----------------");
			for (ExcercicioProduto p : listaprodutos) {
				System.out.println( p.getNome() + " - " + p.getPrecoTotal() );
			}
			
			System.out.println("-----------------");
			System.out.println("Criando arquivo para impressão");
			//Cria o diretório, nesse caso subdir -> true criou, false não criou
			boolean sucess = new File(caminho2).mkdir();
			System.out.println("Criando summary.csv no diretório");
			escreverArquivo(caminho2, listaprodutos);
			
		} catch (IOException e) {
			System.out.println("---------------------------------");
			System.out.println("Sistem Finalizado");
			System.out.println("Error: " + e.getMessage());
		}

	}

	private static void escreverArquivo(String caminho, ArrayList<ExcercicioProduto> produtos) {
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(".\\.\\PastaBase\\out\\summary.csv"))){
			for(ExcercicioProduto p : produtos) {
				bw.write(p.toString());
				bw.newLine();
			}
		}catch (IOException e) {
			System.out.println("---------------------------------");
			System.out.println("Sistem Finalizado");
			System.out.println("Error: " + e.getMessage());
		}
	}
}
