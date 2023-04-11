package org.dao.hql.report;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.model.report.Report;

public class DAOHQL_Report {
	
	public static void update_Report(String tipo, int id)
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			Query query = 
		session.createQuery("update Report set tipo = :tipo where id = :id");
			query.setParameter("tipo", tipo);
			query.setParameter("id", id);
			query.executeUpdate();
			session.beginTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
	}
	
	public static void delete_Report(int id)
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			Query query = 
		session.createQuery("delete from Report where id = :id");
			query.setParameter("id", id);
			query.executeUpdate();
			session.beginTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
	}
	
	
	public static void getAll_Report()
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			@SuppressWarnings("unchecked")
			List<Report> reportes =
					(List<Report>) session.createQuery("from Report").list();
			
			for(Report x : reportes) {
				System.out.println(x.getId()+", "+x.getTipo()+", "+x.getFolio()+", "+x.getComentario());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
		
		
		
	}
	
	
	public static void resplado_Report()
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			Query query =
		session.createQuery("insert into Report2 (id,tipo,folio,comentario) select id,tipo,folio,comentario from Report");
			query.executeUpdate();
			session.beginTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		//update_Report("Power Point", 1);
		//delete_Report(3);
		//getAll_Report();
		resplado_Report();
	}

}
