package vista;

import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.JButton;

public class bienvenida extends JPanel {	

	private JPanel jpanel;
	public JButton btnBienvenida;

	public bienvenida() {
		setLayout(null);
		
		btnBienvenida = new JButton("BIENVENIDA");
		btnBienvenida.setBounds(163, 134, 111, 23);
		add(btnBienvenida);
	}	
}
	
