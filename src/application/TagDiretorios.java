package application;

import java.io.File;
import java.util.Scanner;

public class TagDiretorios {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strpath = sc.nextLine();
		
		File path = new File(".\\.\\PastaBase\\" + strpath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("Folders: ");
		
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		System.out.println("-------------------------------");
		File[] arquivos = path.listFiles(File::isFile);
		for (File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		System.out.println("-------------------------------");
		//Cria o diretório, nesse caso subdir -> true criou, false não criou
		boolean sucess = new File(".\\.\\PastaBase\\" + strpath + "\\subdir").mkdir();
		System.out.println("Diretório criado com sucesso: " + sucess);
		
		sc.close();
		
	}
}
