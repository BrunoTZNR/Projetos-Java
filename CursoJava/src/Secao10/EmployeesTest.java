package Secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeesTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		Integer qtdEmp = sc.nextInt();
		
		for(int i = 0; i < qtdEmp; i++) {
			System.out.println("\nEmployee #" + (i + 1));
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while(hasId(employees, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			employees.add(new Employee(id, name, salary));
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		Employee emp = employees.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			Double increase = sc.nextDouble();
			
			emp.increaseSalary(increase);
		}
		
		System.out.println("\nList of employees:");
		
		for(Employee e : employees) {
			System.out.println(e);
		}
		sc.close();
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
		
		return emp != null;
	}
}
