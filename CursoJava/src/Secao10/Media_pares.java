package Secao10;

import java.util.Scanner;

public class Media_pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		Double[] vect = new Double[sc.nextInt()];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		Double soma = 0.0, media = 0.0;
		Integer qtdPar = 0;
		
		for(Double x : vect) {
			if(x % 2 == 0) {
				soma += x;
				
				qtdPar++;
			}
		}
		
		if(soma == 0.0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			media = soma / qtdPar;
			
			System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		}
		
		sc.close();
	}

}
