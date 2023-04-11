package org.action.report;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.dao.report.DaoImplReport;
import org.dao.report.DaoReport;
import org.modelo.report.Report;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class ActionReport extends ActionSupport implements ModelDriven<Report> {

	private  Report report = new Report();//Get and Set
	
	private DaoReport dao = new DaoImplReport();
	
	private List<Report> listReport = new ArrayList<Report>();//Get and Set
	
	
	public String execute()
	{
		return SUCCESS;
	}
	
	
	public String add()
	{
		dao.addReport(report);
		return SUCCESS;
	}
	
	
	public String list()
	{
		setListReport(dao.listReport());
		return SUCCESS;
	}
	
	
	// HttpServletRequest : RECUPERA PARAMETROS DE MEMORIA / STRING
	public String edit()
	{
		HttpServletRequest request = (HttpServletRequest)
				ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		
		report = dao.getReportById(Integer.parseInt(request.getParameter("id")));
		
		return SUCCESS;
	}
	
	
	public String delete()
	{
		HttpServletRequest request = (HttpServletRequest)
				ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		
		dao.deleteReport(Integer.parseInt(request.getParameter("id")));
		
		return SUCCESS;
	}
	
	
	@Override
	public Report getModel()
	{
		return report;
	}
	

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}

	public List<Report> getListReport() {
		return listReport;
	}

	public void setListReport(List<Report> listReport) {
		this.listReport = listReport;
	}
	
	
}
