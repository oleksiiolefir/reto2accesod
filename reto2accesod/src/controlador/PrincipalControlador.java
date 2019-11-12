package controlador;

import modelo.Conexion;
import modelo.PrincipalModelo;
import vista.CrearDepartamentos;
import vista.JframePrincipal;

public class PrincipalControlador {
	public PrincipalModelo modelo;
    public JframePrincipal vista;
    public Conexion conexion;
    
    private controladorJframe controladorJframe;
    private controladorBienvenida controladorBienvenida;
    public controladorCrearUsuario controladorCrearUsuario;

	public controladorCrearDepartamentos controladorCrearDepartamentos;
	public controladorDepartamentos controladorDepartamentos;
	private controladorVerDepartamentos controladorVerDepartamentos;
  public controladorMenu  controladorMenu;

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
		
		inicializarListeners();
    }
    /**
	 * Esta funcion se encarga de inicializar la interfaz
	 */
  
    /**
	 * Esta funcion de encarga de inicializar los botones
	 */
    public void inicializarListeners() {
    	// añadimos un listener para comprobar el cierre de la aplicacion en el Jframe principal

    	// añadimos listeners a los botones del panel bienvenida
    	controladorBienvenida = new controladorBienvenida(vista, this);
    	// añadimos listeners a los botones del panel MenuEmple
    	controladorMenu = new controladorMenu(vista,this);
    	controladorMenuEmple = new controladorMenuEmple(vista, this);
    	// añadimos listeners a los botones del panel CrearUsuario
    	controladorCrearUsuario = new controladorCrearUsuario(vista,this);
    	
    	
    	
    	/*this.controladorCrearDepartamentos = new controladorCrearDepartamentos();
    	this.controladorCrearDepartamentos.addListeners();
    	
    	this.controladorDepartamentos = new controladorDepartamentos();
    	this.controladorBienvenida.addListeners();
    	
    	this.controladorVerDepartamentos = new controladorVerDepartamentos();
    	this.controladorVerDepartamentos.addListeners();
    	*/

    	
    	

    }
}
