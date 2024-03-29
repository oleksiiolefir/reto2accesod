package modelo;

public class PrincipalModelo {

	public Conexion conexion;
	public Consultas consultas;
	
	public Departamento departamento;
	public Empleado empleado;
	
	public PrincipalModelo() {
		
		// creamos un objeto BBDD que se encargara de conectarse a la BBDD
		conexion = new Conexion();
				
		// Creamos un objeto Consultas que se encargara de hacer consultas a la BBDD
		consultas = new Consultas(conexion);
		
		//inicializamos nuestros objetos a null
		departamento = null;
		empleado = null;
	}
}
