package Launcher;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import controlador.PrincipalControlador;
import modelo.Conexion;
import modelo.Consultas;
import modelo.Departamento;
import modelo.Empleado;
import modelo.PrincipalModelo;
import modelo.lectorTXT;
import modelo.lecturaCSV;
import vista.JframePrincipal;

public class launcher {
	static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	static ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

		JframePrincipal vista = new JframePrincipal();
		PrincipalModelo modelo = new PrincipalModelo();
		PrincipalControlador controlador = new PrincipalControlador(modelo, vista);
		controlador.inicializarVista();
		controlador.inicializarListeners(); 


		Conexion c = new Conexion();

		c.conectar();

		Consultas consult = new Consultas(c);
		
		


		departamentos=lecturaCSV.funcionesDeLectorCsv();

		empleados = lectorTXT.lecturaTXT();	
		
		
		consult.insertarEmpleados(empleados);
		consult.insertarDepartamentos(departamentos);
		

		controlador.inicializarVista();
		controlador.inicializarListeners();

		
		
	}

}
