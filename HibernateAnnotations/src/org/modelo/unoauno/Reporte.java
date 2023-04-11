package org.modelo.unoauno;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
* 
* REPORTE ____________ DETALLE
* 
* ID                  ID
* NOMBRE              DESCRIPCION
* TIPO                COMENTARIO
*                     ID_REPORTE_FK
*                     
*                     
* */

@Entity
public class Reporte {
	
	
	private int id;
	private String nombre;
	private String tipo;
	
	@Id
	@Column(nullable = false)
	@GeneratedValue
	
	//Getters and Setters
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}

