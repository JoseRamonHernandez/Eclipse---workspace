package org.dao.usercap;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.modelo.usercap.Usercap;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

public class DAOUsercap {

	@SessionTarget
	private Session session;
	
	@TransactionTarget
	private Transaction transaction; // getTransaction(), getTransaction().begin
	
	public void addUsercap(Usercap usercap)
	{
		try {
			
			session.save(usercap);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
			transaction.rollback();
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Usercap> listUsercap()
	{
		List<Usercap> list = null;
		
		try {
			
			list = (List<Usercap>) session.createQuery("from Usercap").list();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Exception: "+e.getMessage());
			transaction.rollback();
		}
		return list;
	}
	
	
	
}
