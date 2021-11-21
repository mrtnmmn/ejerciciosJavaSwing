package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexion.Conexion;
import modeloVO.Departamento;

public class DepartamentoDao {

	

	public int nuevoDepartamento(Departamento departamento) {
		
		Conexion conexion = new Conexion();
		
		String consulta = "INSERT INTO Departamentos VALUES (?, ?, ?)";
		int filas = 0;
		try {
			PreparedStatement ps = conexion.getConection().prepareStatement(consulta);
			
			ps.setInt(1, departamento.getCodigo());
			ps.setString(2, departamento.getNombre());
			ps.setString(3, departamento.getLocalidad());
			
			filas = ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return filas;
	}

}
