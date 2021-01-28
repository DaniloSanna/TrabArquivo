package application;

import java.io.File;
import java.util.Scanner;

public class TagDiretorios2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file Name: ");
		String strpath = sc.nextLine();
		
		File path = new File(".\\.\\PastaBase\\" + strpath);
		
		//imprimir somente o nome do arquivo.
		System.out.println("getName: " + path.getName());
		
		//Imprimir o caminho
		System.out.println("getParent: " + path.getParent());
		
		//Imprimir Todo caminho
		System.out.println("getPath: " + path.getPath());
		
		sc.close();
		
	}
}
