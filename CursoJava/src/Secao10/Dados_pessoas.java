package Secao10;

import java.util.Scanner;

public class Dados_pessoas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		Pessoa[] vect = new Pessoa[sc.nextInt()];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			Double altura = sc.nextDouble();
			
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			char sexo = sc.next().charAt(0);
			
			vect[i] = new Pessoa(altura, sexo);
		}
		
		Double menorAltura = 10.0, maiorAltura = 0.0, somaAlturaM = 0.0, mediaAlturaM = 0.0;
		Integer numH = 0, numM = 0;
		
		for(Pessoa p : vect) {
			if(Character.compare(p.getSexo(), 'F') == 0) {
				numM++;
				somaAlturaM += p.getAltura();
			} else {
				numH++;
			}
			
			if(menorAltura > p.getAltura()) {
				menorAltura = p.getAltura();
			}
			
			if(maiorAltura < p.getAltura()) {
				maiorAltura = p.getAltura();
			}
		}
		
		mediaAlturaM = somaAlturaM / numM;
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaM);
		System.out.println("Numero de homens = " + numH);
		
		sc.close();
	}

}
