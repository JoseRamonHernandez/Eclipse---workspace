package org.ejemplo.practica1;

import java.util.Scanner;

/*
 * Escriba una función para imprimir lo siguiente:
*	*
*	**
*	***
*	****
* */

public class Ejercicio4 {
	
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa un numero");
		int number = scanner.nextInt();
		
		for(int i=1; i<=number; i++)
		{
			for(int x=0; x<i; x++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
	}

}
