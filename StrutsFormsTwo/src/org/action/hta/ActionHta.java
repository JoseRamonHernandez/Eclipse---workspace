package org.action.hta;

import org.dao.generic.DaoGeneric;
import org.modelo.hta.Hta;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class ActionHta extends ActionSupport implements ModelDriven<Hta>{
	
	private Hta hta = new Hta();
	private DaoGeneric dao = new DaoGeneric();
	
	
	public String execute()
	{
		return SUCCESS;
	}
	
	public String add()
	{
		dao.addHta(hta);
		return SUCCESS;
	}
	
	
	@Override
	public Hta getModel()
	{
		return hta;
	}
	
	

}
