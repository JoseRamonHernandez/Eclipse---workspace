package org.ejemplo.practica1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Escriba una función recursiva para calcular la factorial de un numero n
 * */

public class Ejercicio3 {
	
	int number;
	int a;
	int b;
	int c;

	public int setDatos(int number) {
		this.number = number;
		
		if(number == 0)
		{
			return 1;
		}else {
			return number * setDatos(number - 1);
		}
		
	}
	
	
public static void main(String[] args) {
		
		try {
			
			int result;
			
			Scanner scanner = new Scanner(System.in);
			
			
			System.out.println("Ingresa un numero: ");
			int x = scanner.nextInt();
			
			Ejercicio3 ejercicio3 = new Ejercicio3();
			
			result = ejercicio3.setDatos(x);
			
			
			System.out.println("\n----------------------------------------");
			System.out.println("\nLa recursividad de "+x+" es igual a: "+result);
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
		
	}
	

}
