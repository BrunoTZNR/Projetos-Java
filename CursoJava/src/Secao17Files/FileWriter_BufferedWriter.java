package Secao17Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_BufferedWriter {

	public static void main(String[] args) {
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "c:\\windows\\temp\\out.txt";
		
		//(path, true) -> acrescenta linhas, (path) -> sobrescreve oque há escrito no arquivo
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
