package controlador;

import modelo.Conexion;
import modelo.PrincipalModelo;
import vista.JframePrincipal;

public class PrincipalControlador {
	public PrincipalModelo modelo;
    public JframePrincipal vista;
    public Conexion conexion;
    public PrincipalControlador controlador;
    
    private controladorJframe controladorJframe;
    private controladorBienvenida controladorBienvenida;
    public controladorCrearUsuario controladorCrearUsuario;
    

    
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
    	vista.menu.setVisible(true);
    	vista.crearUsuario.setVisible(false);
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
    	
    	this.controladorCrearUsuario = new controladorCrearUsuario(vista, controladorJframe);
    	this.controladorCrearUsuario.addListeners();
    }
}
