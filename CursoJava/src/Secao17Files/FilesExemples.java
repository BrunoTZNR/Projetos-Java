package Secao17Files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FilesExemples {
	
	public static void main(String[] args) {
		File file = new File("C:\\Users\\bruno\\OneDrive\\Documentos\\ECLIPSE\\CursoJava\\src\\Secao17\\in.txt");
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
	}

}
