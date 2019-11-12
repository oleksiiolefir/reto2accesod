package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Consultas {

	 private Conexion conexion;
	 private Connection connection;
	    
	    
	 public Consultas(Conexion conexion) {
	    this.conexion = conexion;
	    this.connection = null;
	 }
	 //METER POR PARAMETRO EL OBJETO DE DEPARTAMENTOS
	 public void insertarDepartamentos(ArrayList<Departamento> deptlist) throws SQLException {
		 for (int i = 0; i < deptlist.size(); ++i) {
		 PreparedStatement stmt = null;
		 String query;
		  query = "INSERT INTO departamento (COD_DEPT,	LUGAR,	DNOMBRE) values ('"+deptlist.get(i).getCod_dept()+"','"+deptlist.get(i).getLugar()+"','"+deptlist.get(i).getDnombre()+"')";
			try {
			    // abrimos una conexion
			    connection = conexion.conectar();
			    stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);	 
			    // a�adimos los valores a insertar
			    stmt.executeUpdate();
			    // Ejecuta la consulta y guarda los resultados en un objeto ResultSet
			} catch (SQLException e) {
			    e.printStackTrace();
			} 
			finally {
			    try {
			    	
			    } 
			    catch (Exception e) {
				e.printStackTrace();
			    }
			}
			 
		  }
		 connection.close();
	 }

	 
	 
	 //METER POR PARAMETRO EL OBJETO DE Empleado
	
	public void insertarEmpleados(ArrayList<Empleado> emple) throws SQLException {
		  for (int i = 0; i < emple.size(); ++i) {					    
			    
		   
			PreparedStatement stmt = null;
			
			
			String query;
			
			query = "INSERT INTO empleado (ID, NOMBRE, APELLIDOS, SUELDO, BOSS,COD_DEPT,JEFE, PUESTO) VALUES ('"+emple.get(i).getId()+"','"+emple.get(i).getNombre()+"',"
					+ "'"+emple.get(i).getApellido()+"', '"+emple.get(i).getSueldo()+"','"+ emple.get(i).getBoss()+"', '"+ emple.get(i).getCod_dept()+"',"
							+ "'"+ 0+"', '"+ emple.get(i).getPuesto()+"')";
	
		/*	stmt.setInt(1, emple.get(i).getId());
		    stmt.setString(2,emple.get(i).getNombre());
		    stmt.setString(3, emple.get(i).getApellido());
		    stmt.setInt(4, emple.get(i).getSueldo());
		    stmt.setInt(5, emple.get(i).getBoss());
		    stmt.setInt(6, emple.get(i).getCod_dept());
		    stmt.setBoolean(7, emple.get(i).getJefe());
		    stmt.setString(8, emple.get(i).getPuesto());*/
			try {

			    // abrimos una conexion
			    connection = conexion.conectar();
			    stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			    // preparamos la consulta INSERT
			    
			    // a�adimos los valores a insertar
			    stmt.executeUpdate();
			    // Ejecuta la consulta y guarda los resultados en un objeto ResultSet
			   

			} catch (SQLException e) {
			    e.printStackTrace();
			} 
			finally {
			    try {
			    	
			    } 
			    catch (Exception e) {
				e.printStackTrace();
			    }
			}
			
		  }
		  connection.close();
	 }
	
	public Object [] comparar(String variable) {
		Object [] lista=new Object[5];
		int contador = 0;

		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "SELECT " + variable + "FROM `empleado` WHERE ";

		try {
		    // Abrimos una conexion
		    connection = conexion.conectar();

		    // preparamos la consulta SQL a la base de datos
		    ps = connection.prepareStatement(query);

		    // Ejecuta la consulta y guarda los resultados en un objeto ResultSet
		    rs = ps.executeQuery();

		    // crea objetos Linea con los resultados y los a�ade a un arrayList
		    while (rs.next()) {
		    	lista[contador]=rs;
		    	contador++;
		    }
		} catch (SQLException e) {
		    e.printStackTrace();
		} finally {
		    // cerramos la conexion
		    conexion.desconectar();
		}

		return lista;
	    }
}
	 