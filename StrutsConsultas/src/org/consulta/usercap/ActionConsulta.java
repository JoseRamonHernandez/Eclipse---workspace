package org.consulta.usercap;

import java.util.ArrayList;
import java.util.List;
import org.dao.usercap.DAOUsercap;
import org.modelo.usercap.Usercap;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ActionConsulta extends ActionSupport implements ModelDriven<Usercap> {
	
	private Usercap usercap = new Usercap();
	private DAOUsercap dao = new DAOUsercap();
	private List<Usercap> usercaps = new ArrayList<Usercap>();
	
	
	public String execute()
	{
		return SUCCESS;
	}
	
	public String select()
	{
		setUsercaps(dao.listUsercap());
		return SUCCESS;
	}
	
	@Override
	public Usercap getModel()
	{
		return usercap;
	}

	//GETTERS and SETTERS OF USERCAP
	public List<Usercap> getUsercaps() {
		return usercaps;
	}
	public void setUsercaps(List<Usercap> usercaps) {
		this.usercaps = usercaps;
	}
	
	
	

}
