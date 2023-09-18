package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			System.out.println("Entre os dados do contrato:");
			
			System.out.print("Numero: ");
			Integer number = sc.nextInt();
			
			System.out.print("Data (dd/MM/yyyy): ");
			LocalDate date = LocalDate.parse(sc.next(), dtf);
			
			System.out.print("Valor de contrato: ");
			Double totalValue = sc.nextDouble();
			
			Contract contract = new Contract(number, date, totalValue);
			
			System.out.print("Entre com os numeros de parcelas: ");
			int n = sc.nextInt();
			
			ContractService contractService = new ContractService(new PaypalService());
			
			contractService.processContract(contract, n);
			
			System.out.println("Parcelas: ");
			for(Installment installment : contract.getInstallments()) {
				System.out.println(installment);
			}
		} catch(Exception e) {
			System.out.println("ERROR -> " + e.getMessage());
		} finally {
			sc.close();
		}
		
	}

}
