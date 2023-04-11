package org.ejemplo.practica1;

import java.util.Scanner;

/*
 * Escriba una función que pida un numero y diga si es: positivo, negativo o cero.
 */

public class Ejercicio5 {

	
	
	
	public static void main(String[] args) {

		try {
			
			Scanner scanner = new Scanner(System.in);
			
			
			System.out.println("Ingresa un numero: ");
			int number = scanner.nextInt();
			
			if(number == 0)
			{
				System.out.println("El numero es equivalente a cero");
			}else if (number > 0) {
				System.out.println("El numero es positivo");
			}else if (number < 0) {
				System.out.println("El numero es negativo");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
		
		
		
	}
	
}
