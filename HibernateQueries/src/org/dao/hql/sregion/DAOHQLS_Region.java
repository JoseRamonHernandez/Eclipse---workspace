package org.dao.hql.sregion;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.model.sregion.S_Region;

public class DAOHQLS_Region {

	public static void actualizarS_Region(String name, int id)
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			Query query = 
		session.createQuery("update S_Region set name = :name where id = :id");
			query.setParameter("name", name);
			query.setParameter("id", id);
			query.executeUpdate();
			session.beginTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
	}
	
	
	public static void deleteS_Region(int id)
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			Query query = 
		session.createQuery("delete from S_Region where id = :id");
			query.setParameter("id", id);
			query.executeUpdate();
			session.beginTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
	}
	
	
	public static void getAllS_Region()
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			@SuppressWarnings("unchecked")
			List<S_Region> regiones =
					(List<S_Region>) session.createQuery("from S_Region").list();
			
			for(S_Region x : regiones) {
				System.out.println(x.getId()+", "+x.getName());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
	}
	
	
	public static void respaldoS_Region()
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			Query query =
		session.createQuery("insert into S_Region2 (id,name) select id,name from S_Region");
			query.executeUpdate();
			session.beginTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
	}
	
	
	
	public static void main(String[] args) {
		//actualizarS_Region("SINALOA", 13);
		//deleteS_Region(21);
		//getAllS_Region();
		respaldoS_Region();
	}
	
}
