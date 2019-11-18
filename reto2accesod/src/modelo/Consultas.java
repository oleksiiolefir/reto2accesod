package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import vista.Departamentos;

public class Consultas {

	 private Conexion conexion;
	 private Connection connection;
	 private PrincipalModelo modelo;
	    
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
			    // añadimos los valores a insertar
			    stmt.executeUpdate();
			    // Ejecuta la consulta y guarda los resultados en un objeto ResultSet
			} catch (SQLException e) {
			    e.printStackTrace();
			    EscrituraLog.crearLog( e.toString(), new Object() {} .getClass().getEnclosingMethod().getName(), new Object() {} .getClass().getName());
	        	
			} 
			finally {
			    try {
			    	
			    } 
			    catch (Exception e) {
				e.printStackTrace();
				EscrituraLog.crearLog( e.toString(), new Object() {} .getClass().getEnclosingMethod().getName(), new Object() {} .getClass().getName());
	        	
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
			    EscrituraLog.crearLog( e.toString(), new Object() {} .getClass().getEnclosingMethod().getName(), new Object() {} .getClass().getName()); 	
			} 
			finally {
			    try {
			    	
			    } 
			    catch (Exception e) {
				e.printStackTrace();
				EscrituraLog.crearLog( e.toString(), new Object() {} .getClass().getEnclosingMethod().getName(), new Object() {} .getClass().getName());      	
			    }
			}
			
		  }
		  connection.close();
	 }
	public ArrayList<Departamento> compararDepart(String variable) {
		ArrayList<Departamento> Depard = new ArrayList<Departamento>();
		Departamento Depart;

		int contador = 0;

		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "SELECT * FROM `departamento` WHERE COD_DEPT = '" + variable + "'";

		try {
		    // Abrimos una conexion
		    connection = conexion.conectar();

		    // preparamos la consulta SQL a la base de datos
		    ps = connection.prepareStatement(query);

		    // Ejecuta la consulta y guarda los resultados en un objeto ResultSet
		    rs = ps.executeQuery();	    
		    
		    // crea objetos Linea con los resultados y los añade a un arrayList
		    while (rs.next()) {	
		    	Depart = new Departamento();
		    	Depart.setCod_dept(rs.getInt(1));
		    	Depart.setLugar(rs.getString(3));
		    	Depart.setDnombre(rs.getString(2));
		    
		    	Depard.add(Depart);
		    }
		} catch (SQLException e) {
		    e.printStackTrace();
		} finally {
		    // cerramos la conexion
		    conexion.desconectar();
		}

		return Depard;
	    }
	
	public ArrayList<Departamento>  compararDepartNombre(String variable) {
		ArrayList<Departamento> Depard = new ArrayList<Departamento>();
		Departamento Depart;

		int contador = 0;

		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "SELECT * FROM `departamento` WHERE  DNOMBRE =  "  +  variable   ;
//en el nombre hay que hacer que se lea entre comillas
		try {
		    // Abrimos una conexion
		    connection = conexion.conectar();

		    // preparamos la consulta SQL a la base de datos
		    ps = connection.prepareStatement(query);

		    // Ejecuta la consulta y guarda los resultados en un objeto ResultSet
		    rs = ps.executeQuery();	    
		    
		    // crea objetos Linea con los resultados y los añade a un arrayList
		    while (rs.next()) {	
		    	Depart = new Departamento();
		    	Depart.setCod_dept(rs.getInt(1));
		    	Depart.setLugar(rs.getString(3));
		    	Depart.setDnombre(rs.getString(2));
		    
		    	Depard.add(Depart);
		    }
		} catch (SQLException e) {
		    e.printStackTrace();
		} finally {
		    // cerramos la conexion
		    conexion.desconectar();
		}

		return Depard;
	    }
	public ArrayList<Departamento> compararDepartTodo() {
		ArrayList<Departamento> Depard = new ArrayList<Departamento>();
		Departamento Depart;

		int contador = 0;

		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "SELECT * FROM `Departamento` ";

		try {
		    // Abrimos una conexion
		    connection = conexion.conectar();

		    // preparamos la consulta SQL a la base de datos
		    ps = connection.prepareStatement(query);

		    // Ejecuta la consulta y guarda los resultados en un objeto ResultSet
		    rs = ps.executeQuery();	    
		    
		    // crea objetos Linea con los resultados y los añade a un arrayList
		    while (rs.next()) {	
		    	Depart = new Departamento();
		    	Depart.setCod_dept(rs.getInt(1));
		    	Depart.setLugar(rs.getString(2));
		    	Depart.setDnombre(rs.getString(3));
		    
		    	Depard.add(Depart);
		}} catch (SQLException e) {
		    e.printStackTrace();
		} finally {
		    // cerramos la conexion
		    conexion.desconectar();
		}

		return Depard;
	    }
	
	
<<<<<<< HEAD
	
=======
>>>>>>> 57067dbb3c2c87e684a43749f920f9a969fafa0e
	public ArrayList<Empleado> comparar(String variable) {
		ArrayList<Empleado> emplead = new ArrayList<Empleado>();
    	Empleado emple;

		int contador = 0;

		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "SELECT * FROM `empleado` WHERE ID = '" + variable + "'";

		try {
		    // Abrimos una conexion
		    connection = conexion.conectar();

		    // preparamos la consulta SQL a la base de datos
		    ps = connection.prepareStatement(query);

		    // Ejecuta la consulta y guarda los resultados en un objeto ResultSet
		    rs = ps.executeQuery();	    
		    
		    // crea objetos Linea con los resultados y los añade a un arrayList
		    while (rs.next()) {	
		    	emple = new Empleado();
		    	emple.setId(rs.getInt(1));
		    	emple.setNombre(rs.getString(2));
		    	emple.setApellido(rs.getString(3));
		    	emple.setSueldo(rs.getInt(4));
		    	emple.setBoss(rs.getInt(5));
		    	emple.setCod_dept(rs.getInt(6));
		    	emple.setJefe(rs.getBoolean(7));
		    	emple.setPuesto(rs.getString(8));
		    	emplead.add(emple);
		    }
		} catch (SQLException e) {
		    e.printStackTrace();

		    EscrituraLog.crearLog(new Date(), e.toString(), new Object() {} .getClass().getEnclosingMethod().getName(), new Object() {} .getClass().getName());
        	

		} finally {
		    // cerramos la conexion
		    conexion.desconectar();
		}


		return emplead;
	    }
	
	
	
	public ArrayList<Empleado> compararNombre(String variable) {
		ArrayList<Empleado> emplead = new ArrayList<Empleado>();
    	Empleado emple;


		int contador = 0;

		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "SELECT * FROM `empleado` WHERE  = NOMBRE '" + variable + "'";

		try {
		    // Abrimos una conexion
		    connection = conexion.conectar();

		    // preparamos la consulta SQL a la base de datos
		    ps = connection.prepareStatement(query);

		    // Ejecuta la consulta y guarda los resultados en un objeto ResultSet
		    rs = ps.executeQuery();	    
		    
		    // crea objetos Linea con los resultados y los añade a un arrayList
		    while (rs.next()) {	
		    	emple = new Empleado();
		    	emple.setId(rs.getInt(1));
		    	emple.setNombre(rs.getString(2));
		    	emple.setApellido(rs.getString(3));
		    	emple.setSueldo(rs.getInt(4));
		    	emple.setBoss(rs.getInt(5));
		    	emple.setCod_dept(rs.getInt(6));
		    	emple.setJefe(rs.getBoolean(7));
		    	emple.setPuesto(rs.getString(8));
		    	emplead.add(emple);
		    }
		} catch (SQLException e) {
		    e.printStackTrace();

		    EscrituraLog.crearLog(new Date(), e.toString(), new Object() {} .getClass().getEnclosingMethod().getName(), new Object() {} .getClass().getName());

		} finally {
		    // cerramos la conexion
		    conexion.desconectar();
		}

		return emplead;
	    }
	
	public ArrayList<Empleado> compararTodo() {
		ArrayList<Empleado> emplead = new ArrayList<Empleado>();
    	Empleado emple;

		int contador = 0;

		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "SELECT * FROM `empleado` ";

		try {
		    // Abrimos una conexion
		    connection = conexion.conectar();

		    // preparamos la consulta SQL a la base de datos
		    ps = connection.prepareStatement(query);

		    // Ejecuta la consulta y guarda los resultados en un objeto ResultSet
		    rs = ps.executeQuery();	    
		    
		    // crea objetos Linea con los resultados y los añade a un arrayList
		    while (rs.next()) {	
		    	emple = new Empleado();
		    	emple.setId(rs.getInt(1));
		    	emple.setNombre(rs.getString(2));
		    	emple.setApellido(rs.getString(3));
		    	emple.setSueldo(rs.getInt(4));
		    	emple.setBoss(rs.getInt(5));
		    	emple.setCod_dept(rs.getInt(6));
		    	emple.setJefe(rs.getBoolean(7));
		    	emple.setPuesto(rs.getString(8));
		    	emplead.add(emple);
		    }
		} catch (SQLException e) {
		    e.printStackTrace();
		    EscrituraLog.crearLog(new Date(), e.toString(), new Object() {} .getClass().getEnclosingMethod().getName(), new Object() {} .getClass().getName());
        	
		} finally {
		    // cerramos la conexion
		    conexion.desconectar();
		}

		return emplead;
	    }
}
	 