package org.ejemplo.practica1;

import java.util.Scanner;

/*
 * Escriba una funci�n para obtener el �rea de un tri�ngulo,
donde �rea = (Base * Altura) / 2 .
 * */

public class Ejercicio1 {
	
	int area;
	int base;
	int altura;

	public int setDatos(int base, int altura) {
		this.base = base;
		this.altura = altura;
		
		int area = (base * altura)/2;
		
		return area;
	}
	
	public static void main(String[] args) {
		Ejercicio1 ejercicio1 = new Ejercicio1();
		
		try {
			
			Scanner scanner = new Scanner(System.in);
			int result;
			
			System.out.println("Ingresa la base del Triangulo: ");
			int b = scanner.nextInt();
			
			System.out.println("------------------------------");
			
			System.out.println("Ingresa el �rea del Triangulo: ");
			int h = scanner.nextInt();

			result = ejercicio1.setDatos(b, h);
			
			System.out.println("El �rea del triangulo es: "+result);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
		
		
	}

}
