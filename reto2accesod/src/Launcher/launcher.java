package Launcher;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Conexion;
import modelo.Consultas;
import modelo.Empleado;
import modelo.lecturaCSV;
import modelo.Departamento;

public class launcher {
	static String archivoCsv = "ArchivoCSV.csv";
	static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	static ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		
		Conexion c = new Conexion();

		c.conectar();

		Consultas consult = new Consultas(c);
		
		//lecturaCSV.funcionesDeLectorCsv(archivoCsv);
		
		departamentos=modelo.lecturaCSV.funcionesDeLectorCsv(archivoCsv);
		/*for(int i=0;i<departamentos.size();i++) {
			System.out.println("la i e s " +i);
			System.out.println("aaa :"+departamentos.get(i).getCod_dept()+departamentos.get(i).getDnombre()+departamentos.get(i).getLugar());
		}*/
		empleados = modelo.lectorTXT.lecturaTXT();	
		
		
		//consult.insertarEmpleados(empleados);
		consult.insertarDepartamentos(departamentos);
		
	}

}
