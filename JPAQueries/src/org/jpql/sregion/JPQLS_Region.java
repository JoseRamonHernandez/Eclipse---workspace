package org.jpql.sregion;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.modelo.sregion.S_Region;

public class JPQLS_Region {
	
	//INSERTAR
	public static void insertarS_Region(int id, String name)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAQueries");
		EntityManager em = emf.createEntityManager();
		
		try {
			
			em.getTransaction().begin();
			
			//MODELO
			S_Region region = new S_Region();
			region.setId(id);
			region.setName(name);
			em.persist(region);
			//PERSIST <INSERT>
			em.getTransaction().commit();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
	}

	
	//ACTUALIZAR
	public static void actualizarS_Region(String name, int id)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAQueries");
		EntityManager em = emf.createEntityManager();
		
		try {
			
			em.getTransaction().begin();
			
			//MODELO
			S_Region region = new S_Region();
			region.setId(id);
			region.setName(name);
			em.merge(region);
			//MERGE <UPDATE>
			em.getTransaction().commit();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
	}
	
	
	
	//ELIMINAR
		public static void eliminarS_Region(int id)
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAQueries");
			EntityManager em = emf.createEntityManager();
			
			try {
				
				em.getTransaction().begin();
				S_Region region = new S_Region();
				region = em.find(S_Region.class, id);
						if(region == null)
						{
							System.out.println("El registro no exixste");
						}else
						{
							em.remove(region);
							//REMOVE <DELETE>
							em.getTransaction().commit();
						}
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception: "+e.getMessage());
			}
		}
		
		
		//CONSULTAR
		public static void consultarS_Region()
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAQueries");
			EntityManager em = emf.createEntityManager();
			
			try {
				
				em.getTransaction().begin();
				Query query = em.createQuery("select a from S_Region a");
				List<S_Region> regiones = query.getResultList();
				for(S_Region x : regiones)
				{
					System.out.println(x.getId()+", "+x.getName());
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception: "+e.getMessage());
			}
		}
	
	
	public static void main(String[] args) {
		//insertarS_Region(3, "GUADALaJARA");
		//actualizarS_Region("GUADALAJARA, JALISCO", 3);
		//eliminarS_Region(20);
		consultarS_Region();
	}

}
