package org.service.soap;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ServiceCrud {
	
	private static Connection connection = null;
	private static String drive = "oracle.jdbc.driver.OracleDriver";
	private static String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	
	@WebMethod
	public static void connectDataBase()throws IOException, SQLException
	{
		try {
			
			Class.forName(drive).newInstance();
			System.out.println("Carg� correctamnete el Driver: ojdbc6.jar");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
		
		
		try {
			
			connection = DriverManager.getConnection(URL, "SYSTEM", "246856");
			System.out.println("CONEXION EXITOSA: Oracle11g");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
	}
	
	@WebMethod
	public static String insertReport(int id, String tipo, String folio, String comentario)throws IOException, SQLException
	{
		try {
			
			connectDataBase();
			String sql = "INSERT INTO REPORT (ID,TIPO,FOLIO,COMENTARIO) VALUES (?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, tipo);
			ps.setString(3, folio);
			ps.setString(4, comentario);
			ps.executeQuery();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
		
		return "INSERTO EL REGISTRO: "+id+", "+tipo+", "+folio+", "+comentario;
	}
	
	@WebMethod
	public static String updateReport(int id, String tipo)throws IOException, SQLException
	{
		try {
			
			connectDataBase();
			String sql = "UPDATE REPORT SET TIPO = ? WHERE ID = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, tipo);
			ps.setInt(2, id);
			ps.executeQuery();
			System.out.println("ACTUALIZO: "+id+", "+tipo);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
		
		return "ACTUALIZO EL REGISTRO: "+id;
	}

	
	@WebMethod
	public static String deleteReport(int id_r)throws IOException, SQLException
	{
		try {
			
			connectDataBase();
			String sql = "DELETE FROM REPORT WHERE ID = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id_r);
			ps.executeQuery();
			System.out.println("ELIMINO: "+id_r);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
		
		return "ELIMIN� EL REGISTRO: "+id_r;
	}
	
	
	@WebMethod
	public static String selectByIdReport(int id)throws IOException, SQLException
	{
		String tipo = null;
		
		try {
			
			connectDataBase();
			String sql = "SELECT * FROM REPORT WHERE ID = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rSet = ps.executeQuery();
			
			if(rSet.next())
			{
				tipo = rSet.getString("tipo");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
		
		return "CONSULTA EL REGISTRO: "+id+", "+tipo;
	}

}
