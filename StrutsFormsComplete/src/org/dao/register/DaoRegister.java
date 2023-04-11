package org.dao.register;

import java.util.List;

import org.modelo.register.Register;

//LAS INTERFACES NO SE PROGRAMAN, SOLO SE DECLARAN LOS METODOS A IMPLEMENTAR
public interface DaoRegister {
	
	public void addRegister(Register register);
	
	public List<Register> listRegister();
	
	public Register getRegisterById(int id);
	
	public void deleteRegister(int id);
	

}
