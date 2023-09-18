package Secao10;

import java.util.Scanner;

public class Soma_vetor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor (máx. 4): ");
	 	int tamanho = input.nextInt();
	 	
	 	double[] vect = new double[tamanho];
	 	
	 	for (int i = 0; i < vect.length; i++) {
	 		System.out.print("Digite o " + (i + 1) + "º número: ");
	 		vect[i] = input.nextDouble();
	 	}
	 	
	 	System.out.print("\nVALORES = ");
	 	
	 	for (double y : vect) {
	 		System.out.print(y + "  ");
	 	}
	 	
	 	double soma = 0.0;
	 	
	 	for (double x : vect) {
	 		soma += x;
	 	}
	 	
	 	System.out.println("\nSOMA = " + soma);
	 	
	 	double media = soma / vect.length;
	 	
	 	System.out.println("MÉDIA = " + media);
	 	
		input.close();
	}

}
