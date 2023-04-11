package org.modelo.unoauno;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Detalle {

	private int id;
	private String descripcion;
	private String comentario;
	private Reporte id_reporte_fk;
	
	
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	//En HIBERNATE los metodos:
	/*
	 * MERGE: UPDATE,
	 * PERSIST: INSERT,
	 * REMOVE: DELETE,
	 * EAGER: CARGA TODAS LAS TABLAS ASOCIADAS
	 * LAZY: CARGA LAS TABLAS DE UNA EN UNA
	 * JOIN: UNION, ASOCIA LAS COLUMNAS DE PRIMARY KEY Y FOREIGN KEY
	 * */
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_reporte_fk")
	
	
	public Reporte getId_reporte_fk() {
		return id_reporte_fk;
	}
	public void setId_reporte_fk(Reporte id_reporte_fk) {
		this.id_reporte_fk = id_reporte_fk;
	}
	
	
	


}






