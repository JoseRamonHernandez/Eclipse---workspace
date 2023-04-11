package org.ejemplo.leer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LeerDatos {
	
	public static void leerBufferedReader()
	{
		try {
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Escribir ID: ");
			String id = reader.readLine();
			
			System.out.println("\nEscribir NOMBRE: ");
			String nombre = reader.readLine();
			
			System.out.println("\nEscribir SALARIO: ");
			String salario = reader.readLine();
			
			System.out.println("\n DATOS ingresados a traves de BufferedReader: \n "+ id +", "+nombre +", "+ salario);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+ e.getMessage());
		}
	}
	
	public static void leerScanner()
	{
		try {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Escribir ID: ");
			int id = scanner.nextInt();
			
			System.out.println("\nEscribir NOMBRE: ");
			String nombre = scanner.next();
			
			System.out.println("\nEscribir SALARIO: ");
			double salario = scanner.nextDouble();
			
			System.out.println("\n DATOS ingresados a traves de Scanner: \n "+ id +", "+nombre +", "+ salario);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+ e.getMessage());
		}
	}
	
	
	
	public static void main(String[] args) {
		// MANDAMOS A LLAMAR AL METODO "leerBufferedReader()"
		// leerBufferedReader();
		
		// MANDAMOS A LLAMAR AL METODO "leerScanner()"
		leerScanner();
		
	}

}
