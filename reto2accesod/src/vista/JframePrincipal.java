package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class JframePrincipal extends JFrame {

	private JPanel contentPane;
	
	private static final long serialVersionUID = 1L;
	
	//atributos
	public JFrame frame;
	public bienvenida bienvenida;
	public CrearUsuario crearUsuario;
	public Menu menu;
	public MenuEmple menuEmple;
	
	//constructor
	public JframePrincipal() {
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1024, 720);
		setLocationRelativeTo(null);
		setResizable(false);
		
		inicializarPaneles();
		anadirPaneles();
	}

	private void inicializarPaneles() {
		bienvenida = new bienvenida();
		menu = new Menu();
		crearUsuario = new CrearUsuario();
		menuEmple = new MenuEmple();	 
	}
	
	private void anadirPaneles() {
		getContentPane().add(bienvenida);
		getContentPane().add(menu);
		getContentPane().add(crearUsuario);
		getContentPane().add(menuEmple);		
	}
}
