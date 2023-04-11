package org.controller.persona;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.dao.persona.DaoPersona;
import org.modelo.persona.Persona;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class ControllerPersona implements Serializable {

	private List<Persona> listPersona;
	private Persona persona;
	
	
	//SUPER CLASS
	public ControllerPersona() {
		persona = new Persona();
		// TODO Auto-generated constructor stub
	}


	//GETTERS AND SETTERS 
	public List<Persona> getListPersona() {
		
		DaoPersona dao = new DaoPersona();
		listPersona = dao.ListPersona();
		return listPersona;
		
	}


	public void setListPersona(List<Persona> listPersona) {
		this.listPersona = listPersona;
	}


	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	//METHODS DE PERSONA
	public void limpiarPersona()
	{
		persona = new Persona();
		
	}
	
	
	public String agregarPersona()
	{
		DaoPersona dao = new DaoPersona();
		dao.addPersona(persona);
		return "/index.xhtml?faces-redirect=true";
	}
	
	
	public String modificarPersona()
	{
		DaoPersona dao = new DaoPersona();
		dao.updatePersona(persona);
		return "/index.xhtml?faces-redirect=true";
	}
	
	
	public String eliminarPersona()
	{
		DaoPersona dao = new DaoPersona();
		dao.deletePersona(persona);
		return "/index.xhtml?faces-redirect=true";
	}
	
}











