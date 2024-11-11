package br.com.Calculadora.Prog;

public class Calculadora {

	private double valor1, valor2, resultado;

	public Calculadora() {

		valor1 = 0;
		valor1 = 0;
		resultado = 0;

	}

	public void Somar() {

		resultado = valor1 + valor2;

	}

	public void Subtrair() {

		resultado = valor1 - valor2;

	}

	public void Divisao() {

		resultado = valor1 / valor2;

	}

	public void Multiplicar() {

		resultado = valor1 * valor2;

	}

	public void Porcento() {

		resultado = valor1 / 100;

	}

	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

}
