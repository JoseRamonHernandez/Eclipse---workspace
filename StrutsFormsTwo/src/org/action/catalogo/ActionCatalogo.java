package org.action.catalogo;

import java.util.ArrayList;
import java.util.List;

import org.dao.generic.DaoGeneric;
import org.modelo.ciudad.Ciudad;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


@SuppressWarnings("serial")
public class ActionCatalogo extends ActionSupport implements ModelDriven<Ciudad> {
	
	private Ciudad ciudad = new Ciudad();
	private DaoGeneric dao = new DaoGeneric();
	private List<Ciudad> ciudades = new ArrayList<Ciudad>(); //Get and Set
	private List<String> nombresCiudades = new ArrayList<String>(); //Get and Set
	
	
	public String execute()
	{
		return SUCCESS;
	}
	
	
	
	public String selectCiudad()
	{
		setCiudades(dao.listCiudades());
		System.err.println("message to selectCiudad()");
		for(Ciudad x : ciudades)
		{
			nombresCiudades.add(x.getNombre());
			System.out.println(x.getNombre());
		}
		return SUCCESS;
	}
	
	
	
	@Override
	public Ciudad getModel()
	{
		return ciudad;
	}
	
	
	
	//Getters and Setters de List-ciudades && List-nombresCiudades
	public List<Ciudad> getCiudades() {
		return ciudades;
	}
	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}
	public List<String> getNombresCiudades() {
		return nombresCiudades;
	}
	public void setNombresCiudades(List<String> nombresCiudades) {
		this.nombresCiudades = nombresCiudades;
	}
	
	

}
