package org.controller.report;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.dao.report.DaoReport;
import org.modelo.report.Report;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class ControllerReport implements Serializable{

	private List<Report> listReport;
	private Report report;
	
	
	//SUPER CLASS
	public ControllerReport() {
		 report = new Report();
	}

	
	//Getters and Setters
	public List<Report> getListReport() {
		DaoReport dao = new DaoReport();
		listReport = dao.ListReport();
		return listReport;
	}

	public void setListReport(List<Report> listReport) {
		this.listReport = listReport;
	}


	public Report getReport() {
		return report;
	}


	public void setReport(Report report) {
		this.report = report;
	}
	
	
	
	//METHODS DE REPORT
		public void limpiarReport()
		{
			report = new Report();
			
		}
		
		
		public String agregarReport()
		{
			DaoReport dao = new DaoReport();
			dao.addReport(report);
			return "/index.xhtml?faces-redirect=true";
		}
		
		
		public String modificarReport()
		{
			DaoReport dao = new DaoReport();
			dao.updateReport(report);
			return "/index.xhtml?faces-redirect=true";
		}
		
		
		public String eliminarReport()
		{
			DaoReport dao = new DaoReport();
			dao.deleteReport(report);
			return "/index.xhtml?faces-redirect=true";
		}
	
	
	
}
