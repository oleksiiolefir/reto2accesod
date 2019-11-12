package vista;

import javax.swing.JPanel;
import javax.swing.JButton;

public class Menu extends JPanel {
	
	public JButton btnUsuarios,btnDepartamentos;
	/**
	 * Create the panel.
	 */
	public Menu() {
		setLayout(null);
		
		btnUsuarios = new JButton("USUARIOS");
		btnUsuarios.setBounds(79, 36, 263, 48);
		btnUsuarios.setActionCommand("USUARIOS");
		add(btnUsuarios);
		
		btnDepartamentos = new JButton("DEPARTAMENTOS");
		btnDepartamentos.setBounds(79, 216, 263, 48);
		btnDepartamentos.setActionCommand("DEPARTAMENTOS");
		add(btnDepartamentos);

	}
}
