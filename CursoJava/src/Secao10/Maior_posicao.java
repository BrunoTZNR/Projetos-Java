package Secao10;

import java.util.Scanner;

public class Maior_posicao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor (máx. 10): ");
	 	int tamanho = input.nextInt();
	 	
	 	int[] vect = new int[tamanho];
	 	
	 	for (int i = 0; i < vect.length; i++) {
	 		System.out.print("Digite o " + (i + 1) + "º número: ");
	 		vect[i] = input.nextInt();
	 	}

	 	double maior = 0.0;
	 	int pos = 0;
	 	
	 	for (int i = 0; i < vect.length; i++) {
	 		if(vect[i] > maior) {
	 			maior = vect[i];
	 			pos = i;
	 		}
	 	}
	 	
	 	System.out.println("\nMAIOR VALOR = " + maior);
	 	
	 	System.out.println("POSICAO DO MAIOR VALOR = " + pos);
		
		input.close();
	}

}
