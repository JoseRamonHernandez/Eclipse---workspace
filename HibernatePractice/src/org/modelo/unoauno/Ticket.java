package org.modelo.unoauno;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
public class Ticket {

	private int id;
	private double total;
	private double subtotal;
	private double iva;
	
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
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	
	
	
}
