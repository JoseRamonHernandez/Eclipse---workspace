package org.dao.report;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.modelo.report.Report;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

public class DaoImplReport implements DaoReport {
	
	@SessionTarget
	private Session session;
	
	@TransactionTarget
	private Transaction transaction;
	

	@Override
	public void addReport(Report report) {
		// TODO Auto-generated method stub
		
		try {
			
			session.saveOrUpdate(report);
			
		} catch (Exception e) {
			
			System.out.println("Exception: "+e.getMessage());
		}

	}
	
	

	@SuppressWarnings("unchecked")
	@Override
	public List<Report> listReport() {
		// TODO Auto-generated method stub
		List<Report> list = null;
		
		try {
			
			list = (List<Report>) session.createQuery("from Report").list();
			
		} catch (Exception e) {
			
			System.out.println("Exception: "+e.getMessage());
		}
		
		return list;
	}
	
	

	@Override
	public Report getReportById(int id) {
		// TODO Auto-generated method stub
		Report report = null;
		
		try {
			
			report = (Report) session.get(Report.class, id);
			
		} catch (Exception e) {
			
			System.out.println("Exception: "+e.getMessage());
		}
		
		return report;
	}

	
	
	@Override
	public void deleteReport(int id) {
		// TODO Auto-generated method stub
		Report report = null;
		
		try {
			
			report = (Report) session.get(Report.class, id);
			session.delete(report);
		} catch (Exception e) {
			
			System.out.println("Exception: "+e.getMessage());
		}
	}

}
