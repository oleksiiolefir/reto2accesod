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

	public JPanel contentPane;
	public Bienvenida bienvenida;
	public CardLayout cardLayout;
	public Menu menu;
	public MenuEmple menuEmple;
	public CrearUsuario crearUsuario;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					JframePrincipal frame = new JframePrincipal();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public JframePrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		cardLayout = new CardLayout(0,0);
		contentPane.setLayout(cardLayout);
		
		bienvenida = new Bienvenida();
		menu = new Menu();
		menuEmple = new MenuEmple();
		crearUsuario = new CrearUsuario();
		
		
		contentPane.add(bienvenida, "1");
		contentPane.add(menu, "2");
		contentPane.add(menuEmple, "3");
		contentPane.add(crearUsuario, "4");
		setVisible(true);
		
	}

}
