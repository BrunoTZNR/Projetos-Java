package Secao10;

import java.util.Scanner;

public class Soma_vetores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor (máx. 10): ");
	 	int tamanho = input.nextInt();
	 	
	 	int[] vect1 = new int[tamanho], vect2 = new int[tamanho], vect_soma = new int[tamanho];
	 	
	 	System.out.println("\nVETOR A:");
	 	
	 	for (int i = 0; i < vect1.length; i++) {
	 		System.out.print("Digite o " + (i + 1) + "º número: ");
	 		vect1[i] = input.nextInt();
	 	}
	 	
	 	System.out.println("\nVETOR B:");
	 	
	 	for (int i = 0; i < vect2.length; i++) {
	 		System.out.print("Digite o " + (i + 1) + "º número: ");
	 		vect2[i] = input.nextInt();
	 	}
	 	
	 	for (int i = 0; i < tamanho; i++) {
	 		vect_soma[i] = vect1[i] + vect2[i];
	 	}
	 	
	 	System.out.println("\nVETOR RESULTANTE: ");
	 	
	 	for (int z : vect_soma) {
	 		System.out.print(z + "\n");
	 	}
		
		input.close();
	}

}
