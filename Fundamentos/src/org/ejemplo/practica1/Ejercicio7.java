package org.ejemplo.practica1;

import java.util.Scanner;

/*
 * 
 * Desarrolle el algoritmo o código java para invertir un número entero n, e imprimirlo
por pantalla, Ejemplo: 1234 ---> 4321
*
*
 */

public class Ejercicio7 {
	
	
	public static void main(String[] args) {
try {
	

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa un numero");
		int number = scanner.nextInt();
		
		String cadena = String.valueOf(number);
		
		String numeroInvertido = "";
		
		for(int i=cadena.length()-1; i>=0; i-- )
		{
			numeroInvertido += cadena.charAt(i);
		}
		
		System.out.println(numeroInvertido);
			
		
}catch(Exception e)
{
	System.out.println("Exception: "+e.getMessage());
}
	}

}
