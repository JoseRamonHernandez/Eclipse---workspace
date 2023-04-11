package org.service.soap;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

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
			System.out.println("Cargó correctamnete el Driver: ojdbc6.jar");
			
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
	public static String insertS_Region(int id, String name)throws IOException, SQLException
	{
		try {
			
			connectDataBase();
			String sql = "INSERT INTO S_REGION (ID,NAME) VALUES (?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.executeQuery();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
		
		return "INSERTO EL REGISTRO: "+id+", "+name;
	}
	
	@WebMethod
	public static String updateS_Region(int id, String name)throws IOException, SQLException
	{
		try {
			
			connectDataBase();
			String sql = "UPDATE S_REGION SET NAME = ? WHERE ID = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, id);
			ps.executeQuery();
			System.out.println("ACTUALIZO: "+id+", "+name);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
		
		return "ACTUALIZO EL REGISTRO: "+id;
	}

	
	@WebMethod
	public static String deleteS_Region(int id_r)throws IOException, SQLException
	{
		try {
			
			connectDataBase();
			String sql = "DELETE FROM S_REGION WHERE ID = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id_r);
			ps.executeQuery();
			System.out.println("ELIMINO: "+id_r);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
		
		return "ELIMINÓ EL REGISTRO: "+id_r;
	}
	
	
	@WebMethod
	public static String selectByIdS_Region(int id)throws IOException, SQLException
	{
		String name = null;
		
		try {
			
			connectDataBase();
			String sql = "SELECT * FROM S_REGION WHERE ID = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rSet = ps.executeQuery();
			
			if(rSet.next())
			{
				name = rSet.getString("name");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
		
		return "CONSULTA EL REGISTRO: "+id+", "+name;
	}
}
