package Secao17Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources_Exemples {

	public static void main(String[] args) {
		String path = "C:\\Users\\bruno\\OneDrive\\Documentos\\ECLIPSE\\CursoJava\\src\\Secao17\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

}
