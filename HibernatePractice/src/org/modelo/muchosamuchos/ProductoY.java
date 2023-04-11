package org.modelo.muchosamuchos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/*
 * MODELO MUCHOS A MUCHOS
 * 
 * ESTRUCTURA DE TABLAS
 * 
 * 	PRODUCTOY-----------------|-< PROYSUCY >-|------------------SUCURSALY
 * 
 * 	IDPY							IDPY						IDSUC
 * 	NOMBRE							IDSY						NOMBRE
 * 	DESCRPCION													DIRECCION
 * 	MARCA														TEL		
 * 																EMAIL
 */

@Entity
public class ProductoY {

	private int id;
	private String nombre;
	private String descripcion;
	private String marca;
	private List<SucursalY> sucursalesY = new ArrayList<SucursalY>();
	
	@Id
	@Column(nullable = false)
	@GeneratedValue
	
	//Gettes and Setters
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@ManyToMany //MUCHOS A MUCHOS
	@JoinTable(name = "ProYSucY",
			joinColumns = {@JoinColumn (name = "id_py")},
			inverseJoinColumns = {@JoinColumn (name = "id_sy")})
	
	public List<SucursalY> getSucursalesY() {
		return sucursalesY;
	}
	public void setSucursalesY(List<SucursalY> sucursalesY) {
		this.sucursalesY = sucursalesY;
	}
	
	
	
}
