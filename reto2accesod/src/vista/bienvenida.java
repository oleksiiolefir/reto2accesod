package vista;

import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class bienvenida extends JPanel {	

	public JPanel jpanel;
	public JButton btnBienvenida;
	public JLabel lblAaaaa;
	

	public bienvenida() {
		setLayout(null);
		
		btnBienvenida = new JButton("BIENVENIDA");
		btnBienvenida.setBounds(163, 134, 111, 23);
		add(btnBienvenida);
		
		lblAaaaa = new JLabel("AAAAA");
		lblAaaaa.setBounds(163, 214, 46, 14);
		add(lblAaaaa);
	}	
}
	
