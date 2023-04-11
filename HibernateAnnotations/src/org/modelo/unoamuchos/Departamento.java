package org.modelo.unoamuchos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/*EJEMPLO UNO A MUCHOS
 * 
 * DEPARTAMENTO -----------------<PERSONAL
 * ID                            ID
 * NOMBRE                        NOMBRE
 * COMENTARIO                    APEPAT
 *                               ID_DEPARTAMENTO_FK
 * */

@Entity
public class Departamento {
	
	private int id;
	private String nombre;
	private String comentario;
	private List<Personal> personal;
	
	@Id
	@Column(nullable = false)
	@GeneratedValue
	
	//Getters and Setter
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
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	// Personal solo tendrá un Registro de Departamento
	// Departamento tendra varios Registros de Personal
	
	@OneToOne(mappedBy = "id_departamento_fk", targetEntity = Personal.class,
			cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	
	
	public List<Personal> getPersonal() {
		return personal;
	}
	public void setPersonal(List<Personal> personal) {
		this.personal = personal;
	}
	
	
	
	
}






