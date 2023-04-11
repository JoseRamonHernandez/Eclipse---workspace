package org.ejemplo.lista;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * LIST: SON TIPOS DE COLLECTIONS, PERMITA GUARDAR, REDIMENCIONAR Y TENER SUS PROPIOS METODOS
 * 
 * */
public class ListaDatos {

	public static void listaMombres()
	{
		try {
			
			List<String> lista = new ArrayList<String>();
			
			// AGREGAMOS DATOS A LA LISTA
			lista.add("JUAN"); 		// 0
			lista.add("CARMEN"); 	// 1
			lista.add("LAURA"); 	// 2
			lista.add("ERICK"); 	// 3
			lista.add("CARLOS");	// 4
			lista.add("CARLA"); 	// 5
			lista.add("CAROLINA"); 	// 6
			
			// REASIGNAR VALOR AL CAMPO 5
			lista.set(5, "Carla");
			
			// ELIMINAR EL CAMPO 6
			lista.remove(6);
			
			// OBTENER DATO DEL CAMPO 3
			System.out.println("Dato de la lista POSICION 3: [ "+ lista.get(3)+ " ]");
			
			System.out.println("\n");
			
			System.out.println("Lista: \n[ ");
			// OBTENER TODA LA LISTA
			for(int i=0; i < lista.size(); i++)
			{
			System.out.println("	"+lista.get(i));
			}
			System.out.println("]");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception "+ e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		listaMombres();
	}
	
}
