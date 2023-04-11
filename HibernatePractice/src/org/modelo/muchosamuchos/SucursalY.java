package org.modelo.muchosamuchos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
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

public class SucursalY {

	private int id;
	private String nombre;
	private String direccion;
	private int tel;
	private String email;
	private List<ProductoY> productosY = new ArrayList<ProductoY>();
	
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@ManyToMany //MUCHOS A MUCHOS
	@JoinTable(name = "ProYSucY",
			joinColumns = {@JoinColumn (name = "id_sy")},
			inverseJoinColumns = {@JoinColumn (name = "id_py")})
	
	public List<ProductoY> getProductosY() {
		return productosY;
	}
	public void setProductosY(List<ProductoY> productosY) {
		this.productosY = productosY;
	}
	
	
}
