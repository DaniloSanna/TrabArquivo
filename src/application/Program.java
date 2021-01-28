package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		File file = new File(".\\.\\PastaBase\\in.txt");
		Scanner sc = null;
		
		//Pois pode apresentar erro, ent�o bloco Try
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e){
			System.out.println(e + e.getMessage());
		}
		
		//Bloco Finally adicionado pois caso o programa v� para catch o arquivo n�o ser� fechado(Close())
		finally {
			
			//Verifica se scanner n�o � nulo, pois se h� erro em instanciar a vari�vel ao tentar fechar algo null apresenta erro de Null Pointer Exception
			if(sc != null) {
				sc.close();
			}
			
		}
	}
}
