package com.senati.eti;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Caso4 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			Integer[] num = new Integer[5];  
			int x = 0;
			
			for (int i = 0; i <= 4 ; i++ ) {
				System.out.print("Ingrese numero " + (i + 1) + ": ");
				num[i] = sc.nextInt();
				x = x + 1 ;}
			
			int n_par = 0;
			int n_impar = 0;
			int suma = 0;
			float prom = 0;
			
			for (int i = 0; i <= 4 ; i++ ) {
				 if ((num[i] % 2) == 0){
					 n_par = n_par + 1;}
				 if ((num[i] % 2) != 0){
					 n_impar = n_impar + 1;}
				 
				 suma = suma + num[i];
				 prom = suma / x;}
				
			System.out.println("\n----------");
			System.out.println("Resultados");
			System.out.println("----------");
			System.out.println("Numero par......: " +n_par);
			System.out.println("Numero impar......: " + n_impar);
			System.out.println("promedio.........: " + prom);
	}

}
