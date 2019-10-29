package Launcher;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Conexion;
import modelo.Consultas;
import modelo.Empleado;
import modelo.lecturaCSV;
public class launcher {
	static String archivoCsv = "ArchivoCSV.csv";
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		
		Conexion c = new Conexion();

		c.conectar();

		Consultas consult = new Consultas(c);
		
		lecturaCSV.funcionesDeLectorCsv(archivoCsv);
		
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		empleados = modelo.lectorTXT.lecturaTXT();

		for (int i = 0; i < empleados.size(); ++i) {
		    System.out.println(empleados.get(i).getNombre());
		}
		
	
		
		
		consult.insertarEmpleados(empleados);

	}

}
