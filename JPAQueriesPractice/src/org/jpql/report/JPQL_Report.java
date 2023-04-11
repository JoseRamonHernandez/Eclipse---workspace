package org.jpql.report;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.modelo.report.Report;

public class JPQL_Report {
	
	//INSERTAR
		public static void insert_Report(int id, String tipo, String folio, String comentario)
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAQueriesPractice");
			EntityManager em = emf.createEntityManager();
			
			try {
				
				em.getTransaction().begin();
				
				//MODELO
				Report report = new Report();
				report.setId(id);
				report.setTipo(tipo);
				report.setFolio(folio);
				report.setComentario(comentario);
				em.persist(report);
				//PERSIST <INSERT>
				em.getTransaction().commit();
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception: "+e.getMessage());
			}
		}
		
		
		//ACTUALIZAR
		public static void update_Report(String tipo, String folio, String comentario, int id)
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAQueriesPractice");
			EntityManager em = emf.createEntityManager();
			
			try {
				
				em.getTransaction().begin();
				
				//MODELO
				Report report = new Report();
				report.setId(id);
				report.setTipo(tipo);
				report.setFolio(folio);
				report.setComentario(comentario);
				em.merge(report);
				//MERGE <UPDATE>
				em.getTransaction().commit();
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception: "+e.getMessage());
			}
		}
		
		
		//ACTUALIZAR
		public static void delete_Report(int id)
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAQueriesPractice");
			EntityManager em = emf.createEntityManager();
					
			try {
						
				em.getTransaction().begin();
						
				//MODELO
				Report report = new Report();
				report = em.find(Report.class, id);
				if(report == null)
				{
					System.out.println("El registro no exixste");
				}else
				{
					em.remove(report);
					//REMOVE <DELETE>
					em.getTransaction().commit();
				}
						
						
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Exception: "+e.getMessage());
				}
		}
		
		
		//CONSULTAR
		public static void showAll_Report()
			{
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAQueriesPractice");
				EntityManager em = emf.createEntityManager();
					
				try {
						
					em.getTransaction().begin();
					Query query = em.createQuery("select a from Report a");
					List<Report> reportes = query.getResultList();
					for(Report x : reportes)
					{
						System.out.println(x.getId()+", "+x.getTipo()+", "+x.getFolio()+", "+x.getComentario());
					}
						
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Exception: "+e.getMessage());
				}
			}

		
		
		public static void main(String[] args) {
			//insert_Report(3, "EXCEL", ".exe21", "File Excel");
			//update_Report("WORD", ".doc458", "File WORD", 4);
			//delete_Report(4);
			showAll_Report();
		}

}
