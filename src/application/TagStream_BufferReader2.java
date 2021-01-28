package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TagStream_BufferReader2 {
	public static void main(String[] args) {

		String path = ".\\.\\PastaBase\\in.txt";

		//Novo Try-whith-Resources - Ao declarar no try, caso erro ele finaliza sozinho.
		try (BufferedReader br = new BufferedReader( new FileReader(path) ) ){
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine(); //Solicita a leitura da prox linha
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}
}
