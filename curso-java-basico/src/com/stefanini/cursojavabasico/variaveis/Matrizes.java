package com.stefanini.cursojavabasico.variaveis;

public class Matrizes {

public static void main (String[] args) {
	
	int[][] notas = new int [2][4];
	
	notas [0][0] = 7;
	notas [0][1] = 8;
    notas [0][2] = 9;
    notas [0][3] = 10;
			
	notas [1][0] = 4;
	notas [1][1] = 9;
    notas [1][2] = 2;
    notas [1][3] = 8;    					

    for (int i=0; i<notas.length; i++ ) {
    	//System.out.println(notas[i]+" ");
    
    for(int j=0; j<notas[i].length; j++) { 
    	System.out.println(notas[i][j]+"");
    }
    	}
}

}


