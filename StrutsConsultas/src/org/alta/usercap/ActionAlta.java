package org.alta.usercap;

import org.dao.usercap.DAOUsercap;
import org.modelo.usercap.Usercap;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class ActionAlta extends ActionSupport implements ModelDriven<Usercap> {

	private Usercap usercap = new Usercap();
	private DAOUsercap  dao = new DAOUsercap();
	
	public String execute()
	{
		return SUCCESS;
	}
	
	public String add()
	{
			dao.addUsercap(usercap);
			return SUCCESS;
			
	}
	
	//RECUPERA TODOS LOS DATOS QUE ENVIA LA JSP AL MODELO
	@Override
	public Usercap getModel()
	{
		return usercap;
	}
	
}
