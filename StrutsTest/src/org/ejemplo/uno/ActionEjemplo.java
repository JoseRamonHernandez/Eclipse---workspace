package org.ejemplo.uno;

import com.opensymphony.xwork2.ActionSupport;

/*
 * STRUTS VERSION: 2
 * 
 * 	METHODS: execute(), getDefault(), getModel()
 * 
 * 	CLASS: ActionSupport PERMITE RETORNAR UN NONE, SUCCESS, ERROR
 * 
 * 	INTERFACES: ModelDriven; PERMITE INTEGRAR LAS ENTIDADES
 * 
 * 	EJEMPLO: COMO EJECUTAR UN ACTION EN ESTRATUS
 * */


@SuppressWarnings("serial")
public class ActionEjemplo extends ActionSupport{
	
	public String execute() {
		System.out.println("Ejecutó ACTION EN STRATUS.");
		return SUCCESS;
	}
	
	

}
