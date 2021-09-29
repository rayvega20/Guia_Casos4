package com.senati.eti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int arrNumero[];
	    arrNumero = new int[5];
	    
	    int suma= 0, num_mayor = 0, num_menor = 0;
	    
	    for (int i = 0; i < arrNumero.length; i++) {
	    	// println ara un salto de linea, print saldra en la misma linea
	    	System.out.println("numero " + (i + 1) + ": ");
	    	arrNumero[i] = sc.nextInt();
	    	
	    	suma += arrNumero[i];
	    	
	    	if (i == 0) {
	    		num_menor = arrNumero[0];
	    		num_mayor = arrNumero[0];
	    	}
	    	else {
	    		if (arrNumero[i] < num_menor)
	    		    num_menor = arrNumero[i];
	    		
	    		if (arrNumero[i] > num_mayor)
	    		    num_mayor = arrNumero[i];
	    	}
	    	
	    }
	    
	    System.out.println("--------------------");
		System.out.println("\nRESULTADOS");
		System.out.println("--------------------");
		System.out.println("El numero mayor es....: " + num_mayor);
		System.out.println("El numero menor es....: " + num_menor);
		System.out.println("La sumatoria es.......: " + suma);

	}

}
