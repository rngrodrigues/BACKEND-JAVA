package br.com.stefanini.orientacaoaobjetos;

public class Tesla extends Carro {

	
	boolean dirigeSozinho;

	public Tesla() {
		super();
	}
	
	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("Tesla sobrescrita");
		return velocidadeFinal * tempoFinal;
	}
	
	public boolean isDirigeSozinho() {
		return dirigeSozinho;
	}

	public void setDirigeSozinho(boolean dirigeSozinho) {
		this.dirigeSozinho = dirigeSozinho;
	}
	
	
}
