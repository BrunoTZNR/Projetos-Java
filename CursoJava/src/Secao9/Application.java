package Secao9;

import java.util.Scanner;

public class Application {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account conta;
		
		try {
			System.out.print("Digite o número da conta: ");
			Integer numConta = input.nextInt();
			
			System.out.print("\nDigite o nome do titular da conta: ");
			String nome = input.next();
			
			System.out.print("\nDeseja iniciar com um valor depositado (s/n)?");
			if(input.next().charAt(0) == 's') {
				System.out.print("\nDigite o valor do deposito: ");
				Double deposito = input.nextDouble();
				
				conta = new Account(numConta, nome, deposito);
			} else {
				conta = new Account(numConta, nome);
			}
			
			System.out.print("\nConta atualizada -> " + conta.toString() + "\n");
			
			System.out.print("\nDigite o valor do deposito: ");
			Double valorDeposito = input.nextDouble();
			
			conta.deposito(valorDeposito);
			
			System.out.print("\nConta atualizada -> " + conta.toString() + "\n");
			
			System.out.print("\nDigite o valor para sacar: ");
			Double valorSaque = input.nextDouble();
			
			conta.saque(valorSaque);
			
			System.out.print("\nConta atualizada -> " + conta.toString() + "\n");
			
		} finally {
			input.close();
		}
	}

}
