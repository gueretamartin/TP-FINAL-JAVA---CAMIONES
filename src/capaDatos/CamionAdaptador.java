package capaDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import capaEntidades.Camion;
import connection.ConexionBD;

public class CamionAdaptador {

	// Alta de Camiones
	
	public static void agregarCamion(Camion camion)
	{
		
			String sql = "INSERT INTO camion(patenteLetra,patenteNumero,marca,modelo,descripcion) values (?,?,?,?,?)";
			PreparedStatement sentencia = null;
			Connection conn = ConexionBD.getInstancia().getConn();
			
			try 
			{
				sentencia = conn.prepareStatement(sql);
				
				sentencia.setString(1, camion.getPatenteLetra());
				sentencia.setInt(2, camion.getPatenteNumero());
				sentencia.setString(3, camion.getMarca());
				sentencia.setString(4, camion.getModelo());
				sentencia.setString(5, camion.getDescripcion());
				
				sentencia.execute(); 

			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					if(sentencia!=null && !sentencia.isClosed())
					{
						sentencia.close();
					}
					ConexionBD.getInstancia().CloseConn();
				}
				catch (SQLException sqle)
				{
					sqle.printStackTrace();
				}			
			}		
	
		
		
		
		
		
		
		
	}
	
}
