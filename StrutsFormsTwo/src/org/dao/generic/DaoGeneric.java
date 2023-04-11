package org.dao.generic;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.modelo.ciudad.Ciudad;
import org.modelo.cuenta.Cuenta;
import org.modelo.hta.Hta;

public class DaoGeneric {

	//FUNCION PARA ENLISTAR TODOS LOS DATOS QUE SE ENCUENTREN ALMACENADOS EN LA TABLA 'CIUDAD'
	@SuppressWarnings("unchecked")
	public List<Ciudad> listCiudades()
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		List<Ciudad> ciudades = null;
		
		try {
			
			session.beginTransaction();
			ciudades = (List<Ciudad>) session.createQuery("from Ciudad").list();
			session.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
		
		return ciudades;
	}
	
	
	//FUNCION PARA ENLISTAR TODOS LOS DATOS QUE SE ENCUENTREN ALMACENADOS EN LA TABLA 'CUENTA'
		@SuppressWarnings("unchecked")
		public List<Cuenta> lsitCuentas()
		{
			AnnotationConfiguration cfg = new AnnotationConfiguration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.getCurrentSession();
			
			List<Cuenta> cuentas = null;
			
			try {
				
				session.beginTransaction();
				cuentas = (List<Cuenta>) session.createQuery("from Cuenta").list();
				session.getTransaction().commit();
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception: "+e.getMessage());
			}
			
			return cuentas;
		}
		
		//FUNCION PARA REGISTRAR DATOS EN LA TABLA 'HTA'
		public void addHta(Hta hta)
		{
			AnnotationConfiguration cfg = new AnnotationConfiguration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.getCurrentSession();
			
			
			try {
				
			session.beginTransaction();
			session.save(hta);
			session.getTransaction().commit();
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception: "+e.getMessage());
			}
			
		}
	
}
