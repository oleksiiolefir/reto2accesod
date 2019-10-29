package Launcher;

import java.io.IOException;
import java.sql.SQLException;

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
		
		String [] datos1 = modelo.lectorTXT.lecturaTXT();

		for (int i = 0; i < datos1.length; ++i) {
		    System.out.println(datos1[i]);
		}
		
	
		
		
		//consult.insertarEmpleados();

	}

}
