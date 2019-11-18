package modelo;

public class PrincipalModelo {

	public Conexion conexion;
	public Consultas consultas;
	
	public Departamento departamento;
	public Empleado empleado;
	public EscrituraLog escrituraLog;
	public comprobador comprobador;
	
	
	public PrincipalModelo() {
		PrincipalModelo modelo = new PrincipalModelo();
		// creamos un objeto BBDD que se encargara de conectarse a la BBDD
		conexion = new Conexion(modelo);
			
		// Creamos un objeto Consultas que se encargara de hacer consultas a la BBDD
		consultas = new Consultas(conexion);
		
		//inicializamos nuestros objetos a null
		departamento = null;
		empleado = null;
	}
}
