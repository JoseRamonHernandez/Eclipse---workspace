package org.dao.sregion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.model.sregion.S_Region;

public class DAOS_Region {
	
	public static void insertarS_Region()
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			S_Region region = new S_Region();
			region.setName("Sinaloa");
			session.save(region);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Exception: "+e.getMessage());
		}
	}
	
	
	public static void actualizarS_Region()
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			S_Region region = new S_Region();
			region.setId(13);
			region.setName("Sinaloa");
			session.update(region);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Exception: "+e.getMessage());
		}
	}
	
	
	public static void eliminarS_Region()
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			S_Region region = (S_Region) session.get(S_Region.class, 17);
			session.delete(region);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Exception: "+e.getMessage());
		}
	}
	
	
	public static void getIDS_Region()
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			S_Region region = (S_Region) session.get(S_Region.class, 2);
			System.out.println(region.getId()+", "+region.getName());
			session.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Exception: "+e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		//insertarS_Region();
		//actualizarS_Region();
		//eliminarS_Region();
		getIDS_Region();
	}

}
