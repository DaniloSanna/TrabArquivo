package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		File file = new File(".\\.\\PastaBase\\in.txt");
		Scanner sc = null;
		
		//Pois pode apresentar erro, então bloco Try
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e){
			System.out.println(e + e.getMessage());
		}
		
		//Bloco Finally adicionado pois caso o programa vá para catch o arquivo não será fechado(Close())
		finally {
			
			//Verifica se scanner não é nulo, pois se há erro em instanciar a variável ao tentar fechar algo null apresenta erro de Null Pointer Exception
			if(sc != null) {
				sc.close();
			}
			
		}
	}
}
