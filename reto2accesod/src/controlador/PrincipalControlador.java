package controlador;

import modelo.Conexion;
import modelo.PrincipalModelo;
import vista.CrearDepartamentos;
import vista.JframePrincipal;

public class PrincipalControlador {
	public PrincipalModelo modelo;
    public JframePrincipal vista;
    public Conexion conexion;
    public PrincipalControlador controlador;
    
    private controladorJframe controladorJframe;
    private controladorBienvenida controladorBienvenida;
    public controladorCrearUsuario controladorCrearUsuario;

	public controladorCrearDepartamentos controladorCrearDepartamentos;
	public controladorDepartamentos controladorDepartamentos;
	private controladorVerDepartamentos controladorVerDepartamentos;
    

    public controladorMenuEmple controladorMenuEmple;   


    
    /**
     * Constructor del PrincipalControlador
     * @param modelo
     * @param vista
     */
    public PrincipalControlador(PrincipalModelo modelo, JframePrincipal vista) {
		this.modelo = modelo;
		this.vista = vista;
		this.conexion = new Conexion();
		
    }
    /**
	 * Esta funcion se encarga de inicializar la interfaz
	 */
    public void inicializarVista() {
    	vista.setVisible(true);
    	vista.bienvenida.setVisible(false);
    	vista.crearUsuario.setVisible(false);
    	vista.menu.setVisible(false);
    	vista.menuEmple.setVisible(true);
    	
   
    }
    /**
	 * Esta funcion de encarga de inicializar los botones
	 */
    public void inicializarListeners() {
    	// añadimos un listener para comprobar el cierre de la aplicacion en el Jframe principal
    	this.controladorJframe = new controladorJframe(vista);
    	this.controladorJframe.addListeners();
    	
    	// añadimos listeners a los botones del panel bienvenida
    	this.controladorBienvenida = new controladorBienvenida(vista,controlador);
    	this.controladorBienvenida.addListeners();
    	
    	// añadimos listeners a los botones del panel CrearUsuario
    	this.controladorCrearUsuario = new controladorCrearUsuario(vista, controladorJframe);

    	this.controladorBienvenida.addListeners();
    	
    	this.controladorCrearDepartamentos = new controladorCrearDepartamentos();
    	this.controladorBienvenida.addListeners();
    	
    	this.controladorDepartamentos = new controladorDepartamentos();
    	this.controladorBienvenida.addListeners();
    	
    	this.controladorVerDepartamentos = new controladorVerDepartamentos();
    	this.controladorBienvenida.addListeners();
    	

    	this.controladorCrearUsuario.addListeners();

    	// añadimos listeners a los botones del panel MenuEmple
    	this.controladorMenuEmple = new controladorMenuEmple(vista, controladorJframe);
    	this.controladorMenuEmple.addListeners();

    }
}
