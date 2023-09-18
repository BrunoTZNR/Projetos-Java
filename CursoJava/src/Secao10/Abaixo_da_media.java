package Secao10;

import java.util.Scanner;

public class Abaixo_da_media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		Double[] vect = new Double[sc.nextInt()];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		Double soma = 0.0, media = 0.0;
		
		for(Double x : vect) {
			soma += x;
		}
		
		media = soma / vect.length;
		
		System.out.printf("\nMEDIA DO VETOR = %.3f%n", media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		
		for(Double x : vect) {
			if(x < media) {
				System.out.println(x);
			}
		}
		
		sc.close();
	}

}
