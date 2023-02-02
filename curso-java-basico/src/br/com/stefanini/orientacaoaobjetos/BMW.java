package br.com.stefanini.orientacaoaobjetos;

public class BMW extends Carro {

	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		// TODO Auto-generated method stub
		return velocidadeFinal / tempoFinal;
	}

}
