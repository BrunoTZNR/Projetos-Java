package Secao10;

import java.util.ArrayList;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor (máx. 5): ");
	 	int tamanho = input.nextInt();
	 	
	 	Pessoa[] vect = new Pessoa[tamanho];
	 	
	 	for (int i = 0; i < vect.length; i++) {
	 		System.out.print("Digite os dados da " + (i + 1) + "ª pessoa: \n");
	 		
	 		System.out.print("Nome: ");
	 		String nome = input.next();
	 		
	 		System.out.print("Idade: ");
	 		int idade = input.nextInt();
	 		
	 		System.out.print("Altura: ");
	 		double altura = input.nextDouble();
	 		
	 		vect[i] = new Pessoa(nome, idade, altura);
	 	}
	 	
	 	double soma = 0.0;
	 	
	 	for (Pessoa p : vect) {
	 		soma += p.getAltura();
	 	}
	 	
	 	System.out.printf("\nAltura média: %.2f%n", (soma / vect.length));
	 	
	 	ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	 	
	 	for (Pessoa p : vect) {
	 		if(p.getIdade() < 16) {
	 			pessoas.add(p);
	 		}
	 	}
	 	
	 	double perc = (double)pessoas.size() / (double)vect.length * 100;
	 	
	 	System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", perc);
	 	
	 	for (Pessoa p : pessoas) {
	 		System.out.println(p.getNome());
	 	}
		
		input.close();
	}

}
