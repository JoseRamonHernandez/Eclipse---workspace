package org.modelo.uno;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*EJEMPLO DE CREACION DE UNA TABLA: BITACORA
 * 
 * ID          NUMBER
 * NOMBRE      VARCHAR2
 * FECHA       DATE
 * VERSION     FLOAT
 * 
 * DECLARAR LAS VARIABLES
 * GENERAR SUS GET Y SET
 * AGREGAR LAS ANOTACIONES; @Entity, @Id, @Colum, @GeneratedValue
 * 
 * */
@Entity//ENTIDAD
public class Bitacora {
	
	private int id;
	private String nombre;
	private Date fecha;
	private double version;
	
	@Id//PRIMARY KEY
	@Column(nullable = false)//NOT NULL
	@GeneratedValue//CREATE SEQUENCE INCREMENT
	
	//GETTERS AND SETTERS
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
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
}
