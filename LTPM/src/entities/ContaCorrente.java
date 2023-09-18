package entities;

public class ContaCorrente {
	private Double saldo;
	private Double chequeEspecial;
	
	public ContaCorrente(Double saldo, Double chequeEspecial) {
		this.saldo = saldo;
		this.chequeEspecial = chequeEspecial;
	}
	
	public ContaCorrente() {
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(Double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	public Double sacar(Double valor) throws Exception {
		if(valor <= 0) {
			throw new Exception("O valor não pode ser 0 ou menor!");
		} else if(valor > saldo + chequeEspecial) {
			throw new Exception("O valor não pode exceder o limite da conta!");
		}
		
		return saldo -= valor;
	}
	
	public Double depositar(Double valor) throws Exception {
		if(valor <= 0) {
			throw new Exception("O valor não pode ser 0 ou menor!");
		}
		
		return saldo += valor;
	}
}
