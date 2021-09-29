package com.senati.eti;

import java.util.Scanner;

class Caso7 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         
		 //definir una matrix de numero 3x4
		 int[][] mNumeros = new int [3][4];
		 
		 int num_mayor = 0;
		 int num_menor = 99999;
		 
		 System.out.println("\nLectura por Numeroa");
		 System.out.println("---------------------");
		 
		 for(int f = 0; f < mNumeros.length; f++) {
			System.out.println("\nFila"+(f + 1) + ": ");
	       System.out.println("--------------------");
	       
	       for(int c = 0; c < mNumeros[0].length; c++) {
					System.out.print("Nuemro " +(c + 1) + ": ");
				    mNumeros [f][c]= sc.nextInt();
				    
				if (f == 0 && c == 0) {
					num_mayor = mNumeros[0][0];
				}else {
					if (mNumeros[f][c] > num_mayor) num_mayor = mNumeros[f][c];
					
				}
				if (f == 0 && c == 0) {
					num_menor = mNumeros[0][0];
				}else {
					if (mNumeros[f][c] < num_mayor) num_menor = mNumeros[f][c];
							
				}
						
					}
				
		 System.out.println("\nresultados");
		 System.out.println("---------------");
		 System.out.println("El numero mayor es........: " + num_mayor);
		 System.out.println("El numero mayor es........: " + num_menor);

	}
   }

}
