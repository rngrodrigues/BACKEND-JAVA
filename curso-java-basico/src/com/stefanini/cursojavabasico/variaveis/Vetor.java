package com.stefanini.cursojavabasico.variaveis;

public class Vetor {

	public static void main (String[] args) {
		int[] notas = new int[10];

		notas[0] = 1;
		notas[2] = 5;
		notas[6] = 9;
		notas[4] = 2;
		notas[1] = 4;
		notas[9] = 7;
		notas[7] = 8;

		String[] carros = new String[] {"BMW I320", "Mercedes c180", "BMW M3", "Mercedes AMG", "Tesla Model S"};

		System.out.println(carros.length);

		for (String carro : carros) {
			System.out.println(carro);
		}

	}
}
