package capaDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConexionBD;
import capaEntidades.Ciudad;

public class CiudadAdaptador {

	public static void agregarCiudad(Ciudad ciu) {
	

		String sql = "INSERT INTO ciudad(codPostal,nombre,provincia) values (?,?,?)";
		PreparedStatement sentencia = null;
		Connection conn = ConexionBD.getInstancia().getConn();
		
		try 
		{
			sentencia = conn.prepareStatement(sql);
			
			sentencia.setInt(1, ciu.getCodPostal());
			sentencia.setString(2, ciu.getNombre());
			sentencia.setString(3, ciu.getProvincia());

			
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
