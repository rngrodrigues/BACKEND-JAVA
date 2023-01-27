package br.com.stefanini.operadores;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		/**
		 * AND
		 * V and F => f
		 * V and V => v
		 * F and V => F
		 * F and F => F
		 * 
		 * OR 
		 * V or F => V
		 * V or V => V
		 * F or V => V
		 * F or F => f
		 * 
		 * XOR
		 * V xor F => V
		 * V xor V => F
		 * F xor V => V
		 * F xor F => F
		 * 
		 * Negação Lógica
		 * !V => F
		 * !F => V
		 */
		
		boolean v =true;
		boolean f = false;
		
		// and &&
		// or ||
		// xor !=
		// Negação Lógica !
		
		System.out.println(v && v);
	}

}
