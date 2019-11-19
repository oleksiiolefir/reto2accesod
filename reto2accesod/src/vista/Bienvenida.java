package vista;

import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Bienvenida extends JPanel {	

	public JButton btnBienvenida;
	

	public Bienvenida() {
		setLayout(null);
		
		btnBienvenida = new JButton("BIENVENIDA");
		btnBienvenida.setBounds(163, 134, 111, 23);
		btnBienvenida.setActionCommand("bienvenida");
		add(btnBienvenida);
		
	
	}	
}
	
