package br.com.stefanini.orientacaoaobjetos;

public class BMW extends Carro {
	
	public BMW() {
		super();
	}

	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("BMW sobrescrita");
		return velocidadeFinal / tempoFinal;
	}

}
