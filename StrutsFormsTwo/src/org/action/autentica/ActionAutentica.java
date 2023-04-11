package org.action.autentica;

import java.util.ArrayList;
import java.util.List;

import org.dao.generic.DaoGeneric;
import org.modelo.cuenta.Cuenta;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class ActionAutentica extends ActionSupport implements ModelDriven<Cuenta> {
	
	private Cuenta cuenta = new Cuenta();
	private DaoGeneric daoGeneric = new DaoGeneric();
	private List<Cuenta> cuentas = new ArrayList<Cuenta>(); //Get and Set
	
	public String execute()
	{
		return ERROR;
	}
	
	
	
	public String autentica()
	{
		setCuentas(daoGeneric.lsitCuentas());
		for(Cuenta x : cuentas)
		{
			if(x.getLogin().equals(cuenta.getLogin()) && x.getPassword().equals(cuenta.getPassword()))
			{
				return SUCCESS;
			}
		}
		
		return ERROR;
	}
	
	
	@Override
	public Cuenta getModel()
	{
		return cuenta;
	}
	
	
	
	//Getters and Setters de List<Cuenta> cuentas
	public List<Cuenta> getCuentas() {
		return cuentas;
	}
	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
	
	
	

}
