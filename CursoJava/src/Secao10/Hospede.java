package Secao10;

public class Hospede {
	private String name;
	private String email;
	
	public Hospede(String _name, String _email) {
		this.name = _name;
		this.email = _email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return name + ", " + email;
	}
}
