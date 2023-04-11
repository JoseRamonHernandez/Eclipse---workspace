package org.modelo.unoauno;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class GeneraModelo {

	public static void main(String[] args) {
		try {
			AnnotationConfiguration cfg = new AnnotationConfiguration();
			cfg.addAnnotatedClass(Ticket.class);
			cfg.addAnnotatedClass(ProductoPC.class);
			cfg.configure("hibernate.cfg.xml");
			new SchemaExport(cfg).create(true, true);
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
	}
}
