package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import modal.entitites.Contract;
import modal.services.ContractService;
import modal.services.PaypalService;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			System.out.println("Entre os dados do contrato: ");
			
			System.out.print("Número: ");
			int number = sc.nextInt();
			
			System.out.print("Data (dd/MM/yyyy): ");
			LocalDate date = LocalDate.parse(sc.next(), dtf);
			
			System.out.print("Valor do contrato: ");
			Double totalValue = sc.nextDouble();
			
			Contract contract = new Contract(number, date, totalValue);
			
			System.out.print("Entre com o número de parcelas: ");
			int parcelas = sc.nextInt();
			
			Double valorParcela = totalValue / parcelas;
			
			ContractService service = new ContractService(new PaypalService());
			
			
		} catch(Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		} finally {
			sc.close();
		}
	}
}
