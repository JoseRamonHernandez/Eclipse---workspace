package org.ejemplo.practica1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Escriba una función que imprima la tabla de un numero n en la pantalla.
 * */

public class Ejercicio2 {
	
	int number;
	int a;

	public List<Number> setDatos(int number) {
		this.number = number;
		
		List<Number> lista = new ArrayList<Number>();
		
		for(int i=1; i<=10; i++)
		{
			a=number*i;
			lista.add(a);
		}
		
		return lista;
	}
	
	
	public static void main(String[] args) {
		
		try {
			
			List<Number> newList = new ArrayList<Number>();
			
			Scanner scanner = new Scanner(System.in);
			
			
			System.out.println("Ingresa un numero: ");
			int x = scanner.nextInt();
			
			Ejercicio2 ejercicio2 = new Ejercicio2();
			
			newList = ejercicio2.setDatos(x);
			
			
			System.out.println("\n----------------------------------------");
			System.out.println("\nLa tabla del "+x+" es:");
			
			for(int i=0; i < newList.size(); i++)
			{
				System.out.println("	"+newList.get(i));
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
		
	}

}
