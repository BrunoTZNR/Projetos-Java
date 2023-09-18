package Secao10;

import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		Aluno[] vect = new Aluno[sc.nextInt()];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
			
			sc.nextLine();
			
			String nome = sc.nextLine();
			Double n1 = sc.nextDouble();
			Double n2 = sc.nextDouble();
			
			vect[i] = new Aluno(nome, n1, n2);
		}
		
		System.out.println("Alunos aprovados:");
		
		for(Aluno a : vect) {
			if(a.mediaNota() >= 6.0) {
				System.out.println(a.getNome());
			}
		}
		
		sc.close();
	}

}
