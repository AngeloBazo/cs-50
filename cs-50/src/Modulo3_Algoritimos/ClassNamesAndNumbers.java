package Modulo3_Algoritimos;

public class ClassNamesAndNumbers {

	public String name;
	public String telefone;
	public String email;
	public double altura;
	private int senha;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public ClassNamesAndNumbers() {
	}

	public ClassNamesAndNumbers(String name, String telefone, String email, double altura, int senha) {
		this.name = name;
		this.telefone = telefone;
		this.email = email;
		this.altura = altura;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Name: " + name + " \nTelefone: " + telefone + " \nE-mail: " + email + " \nAltura: " + altura;
	}

}
