package org.ejemplo.practica1;

import java.util.Scanner;

/*
 * Crear una función que solicite: nombre, apellido paterno, apellido materno, fecha de
nacimiento e imprima en pantalla CAD.
Nombre: JUAN
Apellido paterno: GARCIA
Apellido materno: GONZALEZ
Fecha de nacimiento: 18/01/84

CAD = GAGJ840118

 */

public class Ejercicio6 {
	
	
	
	public static void main(String[] args) {
		
		try
		{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa tu Primer nombre: ");
		String name = scanner.next();
		
		System.out.println("Ingresa tu Apellido Paterno: ");
		String lastName1 = scanner.next();
		
		System.out.println("Ingresa tu Apellido Materno: ");
		String lastName2 = scanner.next();
		
		System.out.println("Ingresa tu dia de nacimiento a dos digitos");
		String day = scanner.next();
		
		System.out.println("Ingresa tu mes de nacimiento a dos digitos");
		String month = scanner.next();
		
		System.out.println("Ingresa los ultimos dos digitos de tu año de nacimiento");
		String year = scanner.next();
		
		char firstLetterApellidoP = lastName1.charAt(0);
		char secondLetteApellidoP = lastName1.charAt(1);
		
		char firstLetterApellidoM = lastName2.charAt(0);
		
		char firstLetterName = name.charAt(0);
		
		System.out.println("CAD: "+firstLetterApellidoP+secondLetteApellidoP+firstLetterApellidoM+firstLetterName+year+month+day);
	}catch(Exception e)
		{
		System.out.println("Exception: "+e.getMessage());
		}
	}

}
