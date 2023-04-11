package org.dao.report;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.model.report.Report;

public class DAO_Report {

	public static void insert_Report()
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			Report report = new Report();
			report.setTipo("WORD");
			report.setFolio("548");
			report.setComentario("Comentario");
			session.save(report);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Exception: "+e.getMessage());
		}
	}
	
	
	public static void update_Report()
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			Report report = new Report();
			report.setId(2);
			report.setTipo("WORD");
			report.setFolio("254");
			report.setComentario("Commit");
			session.update(report);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Exception: "+e.getMessage());
		}
	}
	
	
	
	public static void delete_Report()
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			Report report = (Report) session.get(Report.class, 2);
			session.delete(report);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Exception: "+e.getMessage());
		}
	}
	
	
	
	public static void getID_Report()
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			Report report = (Report) session.get(Report.class, 1);
			System.out.println(report.getId()+", "+report.getTipo()+", "+report.getFolio()+", "+report.getComentario());
			session.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Exception: "+e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		//insert_Report();
		//update_Report();
		//delete_Report();
		//getID_Report();
	}
	
}
