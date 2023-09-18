package Secao10;

import java.util.Scanner;

public class Mais_velho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		Pessoa[] vect = new Pessoa[sc.nextInt()];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("Idade: ");
			Integer idade = sc.nextInt();
			
			vect[i] = new Pessoa(nome, idade);
		}
		
		Integer age = 0;
		
		String nameAge = null;
		
		for(Pessoa p : vect) {
			if(age < p.getIdade()) {
				age = p.getIdade();
				nameAge = p.getNome();
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nameAge);
		
		sc.close();
	}

}
