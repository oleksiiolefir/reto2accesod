package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JframePrincipal extends JFrame {

		
	//atributos
	public ConsultarUsuario consultarUsuario;
	public MostrarUsuarios mostrarUsuarios;
	public JPanel contentPane;
	public Bienvenida bienvenida;
	public CardLayout cardLayout;
	public Menu menu;
	public MenuEmple menuEmple;
	public CrearUsuario crearUsuario;
	public CrearDepartamentos crearDepartamentos;
	public Departamentos Departamentos;
	public verDepartamentos verDepartamentos;
	public MostrarDepartamentos mostrarDepartamentos;

	/**
	 * Create the frame.
	 */
	public JframePrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		cardLayout = new CardLayout(0,0);
		contentPane.setLayout(cardLayout);
		
		bienvenida = new Bienvenida();
		menu = new Menu();
		menuEmple = new MenuEmple();
		crearUsuario = new CrearUsuario();
		consultarUsuario = new ConsultarUsuario();
		mostrarUsuarios = new MostrarUsuarios();
		crearDepartamentos = new CrearDepartamentos();
		Departamentos = new Departamentos();
		verDepartamentos = new verDepartamentos();
		mostrarDepartamentos = new MostrarDepartamentos();
		
		
		contentPane.add(bienvenida, "1");
		contentPane.add(menu, "2");
		contentPane.add(menuEmple, "3");
		contentPane.add(crearUsuario, "4");
		contentPane.add(crearDepartamentos, "5");
		contentPane.add(consultarUsuario, "6");
		contentPane.add(mostrarUsuarios, "7");
		contentPane.add(Departamentos, "8");
		contentPane.add(verDepartamentos, "9");
		contentPane.add(mostrarDepartamentos, "10");
		setVisible(true);

	}

}
