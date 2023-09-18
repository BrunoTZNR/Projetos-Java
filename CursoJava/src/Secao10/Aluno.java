package Secao10;

public class Aluno {
	private String nome;
	private Double n1;
	private Double n2;
	
	public Aluno(String n, Double i, Double a) {
		this.nome = n;
		this.n1 = i;
		this.n2 = a;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getN1() {
		return n1;
	}

	public void setN1(Double idade) {
		this.n1 = idade;
	}

	public Double getN2() {
		return n2;
	}

	public void setN2(Double altura) {
		this.n2 = altura;
	}
	
	public Double mediaNota() {
		return (this.n1 + this.n2) / 2;
	}
}
