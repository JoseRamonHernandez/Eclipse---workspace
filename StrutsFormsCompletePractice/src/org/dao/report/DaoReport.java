package org.dao.report;

import java.util.List;

import org.modelo.report.Report;


public interface DaoReport {

	public void addReport(Report report );
	
	public List<Report> listReport();
	
	public Report getReportById(int id);
	
	public void deleteReport(int id);
	
}
