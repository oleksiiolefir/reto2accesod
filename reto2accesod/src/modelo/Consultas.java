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
	 public void insertarDepartamentos() {

			PreparedStatement stmt = null;
			ResultSet result = null;
			int codReserva = 0;
			String query;
			int cod_dept = 10;
			String lugar = "Erreka";
			String Dnombre = "Infor";
			query = "INSERT INTO departamento (Cod_Dept, Lugar, Dnombre) VALUES (?, ?, ?)";

			try {

			    // abrimos una conexion
			    connection = conexion.conectar();

			    // preparamos la consulta INSERT
			    stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			    //Cod dept, lugar,dnombre
			 // ID,Nomrbe,apellidos,sueldo,boss(id empleado),cod_dept,jefe(si/no),puesto
			    // añadimos los valores a insertar
	//stmt.setInt(1, departamento.getCod_dept());
	//stmt.setInt(2, departamento.getLugar());	
	//stmt.setInt(3, departamento.getDnombre());
			    
			    stmt.setInt(1, cod_dept);
			    stmt.setString(2, lugar);
			    stmt.setString(3, Dnombre);
			

			    // Ejecuta la consulta y guarda los resultados en un objeto ResultSet
			    stmt.executeUpdate();

			} catch (SQLException e) {
			    e.printStackTrace();
			} finally {
			    try {
				connection.close();
			    } catch (Exception e) {
				e.printStackTrace();
			    }
			}
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
			    
			    // añadimos los valores a insertar
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
}
	 
