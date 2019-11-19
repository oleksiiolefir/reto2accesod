package controlador;

import modelo.Conexion;
import modelo.PrincipalModelo;
import vista.ConsultarUsuario;
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
	public controladorVerDepartamentos controladorVerDepartamentos;
	public controladorMenu  controladorMenu;
	public controladorConsultarUsu controladorConsultarUsu;


    public controladorMenuEmple controladorMenuEmple;   

    public controladorMostrarUsu controladorMostrarUsu;

    public controladorMostrarDepartamentos controladorMostrarDepartamentos;

    /**
     * Constructor del PrincipalControlador
     * @param modelo
     * @param vista
     */
    public PrincipalControlador(PrincipalModelo modelo, JframePrincipal vista) {
		this.modelo = modelo;
		this.vista = vista;
		this.conexion = new Conexion(modelo);
		
		inicializarControladores();
    }
    /**
	 * Esta funcion se encarga de inicializar la interfaz
	 */
  
    /**
	 * Esta funcion de encarga de inicializar los botones
	 */
    public void inicializarControladores() {
    	// añadimos un listener para comprobar el cierre de la aplicacion en el Jframe principal

    	// añadimos listeners a los botones del panel bienvenida
    	controladorBienvenida = new controladorBienvenida(vista, this);
    	// añadimos listeners a los botones del panel MenuEmple
    	controladorMenu = new controladorMenu(vista,this);
    	controladorMenuEmple = new controladorMenuEmple(vista, this);
    	// añadimos listeners a los botones del panel CrearUsuario
    	controladorCrearUsuario = new controladorCrearUsuario(vista,this,modelo);
    	// añadimos listeners a los botones del panel ConsultarUsu
    	controladorConsultarUsu = new controladorConsultarUsu(vista,this,modelo);
    	// añadimos listeners a los botones del panel ConsultarUsu
    	controladorMostrarUsu = new controladorMostrarUsu(vista,this);
    	
    	controladorCrearDepartamentos = new controladorCrearDepartamentos(vista,this, modelo);
    	controladorDepartamentos = new controladorDepartamentos(vista,this);
    	controladorVerDepartamentos = new controladorVerDepartamentos(vista,this, modelo);
    	controladorMostrarDepartamentos = new controladorMostrarDepartamentos(vista, null);


    }
}
