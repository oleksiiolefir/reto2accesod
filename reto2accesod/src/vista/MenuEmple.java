package vista;

import javax.swing.JPanel;
import javax.swing.JButton;

public class MenuEmple extends JPanel {
	public JButton btnCrearUsu, btnConsultarUsu, btnAtras;
	
	/**
	 * Create the panel.
	 */
	public MenuEmple() {
		setLayout(null);
		
		btnCrearUsu = new JButton("Crear Nuevo Usuario");
		btnCrearUsu.setBounds(146, 63, 160, 46);
		add(btnCrearUsu);
		
		btnConsultarUsu = new JButton("Consultar Usuarios");
		btnConsultarUsu.setBounds(146, 162, 160, 46);
		add(btnConsultarUsu);
		
		btnAtras = new JButton("Atras");
		btnAtras.setBounds(351, 266, 89, 23);
		add(btnAtras);

	}

}
