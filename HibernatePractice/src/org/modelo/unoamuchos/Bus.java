package org.modelo.unoamuchos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/*
 * MODELO UNO A MUCHOS
 * 
 * ESTRUCTURA DE TABLA
 * 
 * 	RUTA________________BUS
 * 	
 * 	ID					ID
 * 	NOMBRE				NUMERO
 * 	TRAYECTO			PLACA
 * 	PARADA				MODELO
 * 						DESCRIPCION
 * 
 * 						ID_RUTA_FK
 */

@Entity
public class Bus {

	private int id;
	private int numero;
	private String placa;
	private String modelo;
	private String descripcion;
	private Ruta id_ruta_fk;
	
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
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@ManyToOne
	@JoinColumn(name = "id_ruta_fk")
	
	public Ruta getId_ruta_fk() {
		return id_ruta_fk;
	}
	public void setId_ruta_fk(Ruta id_ruta_fk) {
		this.id_ruta_fk = id_ruta_fk;
	}
	
	
	
}
