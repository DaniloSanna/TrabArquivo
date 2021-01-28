package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TagFileWriter_BufferedWriter {
	public static void main(String[] args) {
		
		
		
		
		//FileWrite - Cria o arquivo, cria um arquivo em branco em cima.
		//FileWrite (path, true) - Acrescenta as informações as informações existentes, adiciona a inf ao final do arquivo.
		
		String[] lines = new String[] {"Good Morning.", "Good Afternoon.", "Good Night."};
		String path = ".\\.\\PastaBase\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
		//try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line: lines) {
				bw.write(line);
				bw.newLine(); //Dar a quebra de linha no arquivo.
			}
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
	}
}
