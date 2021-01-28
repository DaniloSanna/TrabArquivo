package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TagStream_BufferReader {
	public static void main(String[] args) {

		String path = ".\\.\\PastaBase\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine(); //Solicita a leitura da prox linha
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {

			try {
				// Podem apresentar falha no fechamento, por isso novo Try
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
