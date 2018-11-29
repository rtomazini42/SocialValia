package rede_socialista;

public class Trabalhador {
	private double Valor;
	private static double MaisValia;
	private static double Salario;
	private double Horas;

	public void Trabalhar(float Horas){
		
		System.out.println("trabalhando");
		Valor = Valor * Horas;
		System.out.println("Gerou:" + Valor);
		Trabalhador.Salario = Salario + (Valor * MaisValia);
		System.out.println("Ganhou "+ Salario);
	}
	
	
	public Trabalhador() {
		Trabalhador.MaisValia = 0.30;
	}



	public double getValor() {
		return Valor;
	}

	public void setValor(double valor) {
		Valor = valor;
	}

	public double getMaisValia() {
		return MaisValia;
	}

	public void setMaisValia(double maisValia) {
		MaisValia = maisValia;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}






	public double getHoras() {
		return Horas;
	}






	public void setHoras(double horas) {
		Horas = horas;
	}
	
}
