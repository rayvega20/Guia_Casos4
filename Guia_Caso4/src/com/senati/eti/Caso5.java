package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    String[] arrCodigo = {"A001", "A002", "A003", "A004", "A005"};
	    String[] arrNombre = {"Carlos Torres", "Maria Flores",
	    		              "Cecilia Bravo", "Felipe Vargas", "Rosa Garcia"};
	    
	    int[] arrNota = {8, 14, 10, 19, 11};
	    
	    System.out.println("\nCONSULTA DE DATOS");
		System.out.println("--------------------");
		System.out.println("Ingrese codigo a buscar: ");
		String codigo = sc.nextLine();
		
		int p = -1;
		
		for(int i = 0; i< arrCodigo.length; i++) {
			if (codigo.equals(arrCodigo[i])) {
				
			p = i;
			break;
				
			}
			
		}
	    if (p == -1) {
	    	System.out.println("\ncodigo no encontrado");
	    }else  {
	    	System.out.println("----------------------");
	    	System.out.println("alumno(a)............: "+arrNombre[p]);
	    	System.out.println("nota.................: "+arrNota[p]);
	    }	if ( arrNota[p] >= 11) {
	    	System.out.println( "aprobado");
	    }   else  {
	    	System.out.println( "desaprobado");
	    }
	}

}
