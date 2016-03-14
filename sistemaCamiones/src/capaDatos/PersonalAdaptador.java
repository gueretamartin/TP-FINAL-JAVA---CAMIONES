package capaDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConexionBD;
import capaEntidades.Personal;

public class PersonalAdaptador {

	public static void agregarPersonal(Personal pe) {
		
		String sql = "INSERT INTO personal(dni,nombre,apellido) values (?,?,?)";
		PreparedStatement sentencia = null;
		Connection conn = ConexionBD.getInstancia().getConn();
		
		try 
		{
			sentencia = conn.prepareStatement(sql);
			
			sentencia.setInt(1, pe.getDni());
			sentencia.setString(2, pe.getNombre());
			sentencia.setString(3, pe.getApellido());
			
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
