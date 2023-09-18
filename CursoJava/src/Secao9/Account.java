package Secao9;

public class Account {
	private Integer numeroConta = null;
	private String nomeTitular = null;
	private Double balanco = 0.0;
	
	public Account() {
		
	}
	
	public Account(Integer number, String name) {
		this.numeroConta = number;
		this.nomeTitular = name;
	}
	
	public Account(Integer number, String name, Double balance) {
		this.numeroConta = number;
		this.nomeTitular = name;
		deposito(balance);
	}
	
	public Integer getNumeroConta() {
		return numeroConta;
	}
	
	public String getNometitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String name) {
		this.nomeTitular = name;
	}
	
	public Double deposito(Double x) {
		return balanco += x;
	}
	
	public Double saque(Double y) {
		return balanco -= y + 5.00;
	}
	
	public String toString() {
		return "Account: " + this.numeroConta + " / Titular: " + this.nomeTitular + " / Balanço: " + this.balanco;
	}
}
