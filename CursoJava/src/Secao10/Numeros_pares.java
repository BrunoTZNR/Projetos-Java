package Secao10;

import java.util.Scanner;

public class Numeros_pares {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor (máx. 10): ");
	 	int tamanho = input.nextInt();
	 	
	 	int[] vect = new int[tamanho];
	 	
	 	for (int i = 0; i < vect.length; i++) {
	 		System.out.print("Digite o " + (i + 1) + "º número: ");
	 		vect[i] = input.nextInt();
	 	}
	 	
	 	System.out.println("\nNÚMEROS PARES:");
	 	
	 	int qtd_pares = 0;
	 	
	 	for (int x : vect) {
	 		if (x % 2 == 0) {
	 			System.out.print(x + "  ");
	 			qtd_pares++;
	 		}
	 	}
	 	
	 	System.out.print("\n\nQUANTIDADE DE PARES = " + qtd_pares);
		
		input.close();
	}

}
