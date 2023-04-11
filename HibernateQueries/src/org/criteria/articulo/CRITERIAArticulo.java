package org.criteria.articulo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.model.articulo.Articulo;

/*
 * CRITERIA ES UN COMPLEMENTO DE HIBERNATE PARA HACER CONSULTAS
 * */


public class CRITERIAArticulo {

	public static void caseCriteriaArticulo()
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			Criteria cr = session.createCriteria(Articulo.class);
			
			//OBTENER TODOS LOS ARTICULOS CON EL PRECIO MAYOR A 10.0
			
			/*cr.add(Restrictions.gt("precio", 10.0));*/
			//EN HIBERNATE CRITERIA gt es MAYOR QUE > 
			
			//OBTENER TODOS LOS ARTICULOS CON EL PRECIO MENOR A 10.0
			
			/*cr.add(Restrictions.lt("precio", 10.0));*/
			//EN HIBERNATE CRITERIA lt es MENOR QUE <
			
			//BUSQUEDA
			//OBTENER TODOS LOS ARTICULOS QUE INICIEN CON B
			/*cr.add(Restrictions.like("nombre", "B%"));*/
			//EN HIBERNATE CRITERIA like es para buscar todos los que tengan una B en este caso
			
			//BUSQUEDA POR RANGO
			//OBTENER LOS NOMBRES DE LOS ARTICULOS CON EL PRECIO ENTRE 10 Y 30
			/*cr.add(Restrictions.between("precio", 10.0, 30.0));*/
			
			//ORDENAR ASCENDENTE Y DESCENDENTE
			/*
			cr.addOrder(Order.asc("precio"));
			cr.addOrder(Order.desc("precio"));
			*/
			
			@SuppressWarnings("unchecked")
			List<Articulo> articulos = (List<Articulo>) cr.list();
			for (Articulo x : articulos)
			{
				System.out.println(x.getId()+", "+x.getNombre()+", "+x.getPrecio());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
	}
	
	
	
	public static void caseCriteriaUniqueResultArticulo()
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			Criteria cr = session.createCriteria(Articulo.class);
			
			//CONTAR EL NUMERO DE FILAS
			//cr.setProjection(Projections.rowCount());
			
			//OBTENER EL VALOR MINIMO DEL PRECIO EN LOS REGISTROS
			//cr.setProjection(Projections.min("precio"));
			
			//OBTENER EL VALOR MAXIMO DEL PRECIO EN LOS REGISTROS
			//cr.setProjection(Projections.max("precio"));
			
			//OBTENER EL VALOR MEDIO DEL PRECIO EN LOS REGISTROS
			//cr.setProjection(Projections.avg("precio"));
			
			//OBTENER EL VALOR DE LA SUMA TOTAL DEL PRECIO EN LOS REGISTROS
			cr.setProjection(Projections.sum("precio"));
			
			Object resultCriteria = cr.uniqueResult();
			System.out.println("UNIQUE RESULT CRITERIA: "+ resultCriteria);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		//caseCriteriaArticulo();
		caseCriteriaUniqueResultArticulo();
	}
	
}
