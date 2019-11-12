package vista;

import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Bienvenida extends JPanel {	

	public JButton btnBienvenida;
	public JLabel lblAaaaa;
	

	public Bienvenida() {
		setLayout(null);
		
		btnBienvenida = new JButton("BIENVENIDA");
		btnBienvenida.setBounds(163, 134, 111, 23);
		btnBienvenida.setActionCommand("bienvenida");
		add(btnBienvenida);
		
		lblAaaaa = new JLabel("AAAAA");
		lblAaaaa.setBounds(163, 214, 46, 14);
		add(lblAaaaa);
	}	
}
	
