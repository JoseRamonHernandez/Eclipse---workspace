package org.modelo.unoauno;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/*
 * RELACION UNO A UNO
 * 
 * ESTRUCTURA DE TABLAS
 * 
 * 	TICKET________________PRODUCTOPC
 * 	
 * 	ID						ID
 * 	TOTAL					NOMBRE
 * 	SUBTOTAL				CANTIDAD
 * 	IVA
 *  						ID_TICKET_FK
 */

@Entity
public class ProductoPC {
	
	private int id;
	private String nombre;
	private int cantidad;
	private Ticket id_ticket_fk;
	
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
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_ticket_fk")
	
	public Ticket getId_ticket_fk() {
		return id_ticket_fk;
	}
	public void setId_ticket_fk(Ticket id_ticket_fk) {
		this.id_ticket_fk = id_ticket_fk;
	}
	
	
	

}
