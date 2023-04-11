package org.ejemplo.pojo;

/*
 * 
 * POJO: PLAIN OLDER JAVA OBJECT, REPOSITORIO DE DATOS.
 * 
 * 
 * PERSISTENCIA: CAPACIDAD DE OBTENER (GET) Y ASIGNAR DATOS (SET)
 * 
 * */

public class Producto {
	
	private int id;
	private String nombre;
	private double precio;
	private String comentario;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	

}
