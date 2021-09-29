package com.senati.eti;

public class Caso6 {

	public static void main(String[] args) {
		String[][] mDatos= { {"Joe Castillo", "Rosa Perez", "Carlos Flores"},
				           {"Callao", "SMP", "Comas"} };
		
		System.out.println("\nIMPRESION POR FILAS");
		System.out.println("---------------------");
		
		//mDatos.length -----> numero de filas (2)
		//mDatos[0].length ----> numero de columas (3)
		for(int i = 0; i < mDatos.length; i++) {
			for(int j = 0; j< mDatos[0].length; j++)
				System.out.print(String.format("%-20s", mDatos[i][j]));
			
			System.out.println();
		}
		                     
		System.out.println("\nIMPRESION POR columna");
		System.out.println("---------------------");
		
		
		for(int c = 0; c < mDatos[0].length; c++) {
			for(int f = 0; f < mDatos.length; f++)
				System.out.print(String.format("%-20s", mDatos[f][c]));
			
			System.out.println();
		}

	}

}
