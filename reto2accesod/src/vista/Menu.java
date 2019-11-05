package vista;

import javax.swing.JPanel;
import javax.swing.JButton;

public class Menu extends JPanel {
	
	
	/**
	 * Create the panel.
	 */
	public Menu() {
		setLayout(null);
		
		JButton btnUsuarios = new JButton("USUARIOS");
		btnUsuarios.setBounds(79, 36, 263, 48);
		add(btnUsuarios);
		
		JButton btnDepartamentos = new JButton("DEPARTAMENTOS");
		btnDepartamentos.setBounds(79, 216, 263, 48);
		add(btnDepartamentos);

	}
}
