package Secao10;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	private char sexo;
	
	public Pessoa(String n, int i, double a) {
		this.nome = n;
		this.idade = i;
		this.altura = a;
	}
	
	public Pessoa(String n, int i) {
		this.nome = n;
		this.idade = i;
	}
	
	public Pessoa(double a, char s) {
		this.altura = a;
		this.sexo = s;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public String toString() {
		return "Nome: " + this.nome + " / Altura: " + this.altura + " / Idade: " + this.idade;
	}
}
