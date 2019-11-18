package vista;


import javax.swing.JPanel;

import javax.swing.JButton;


public class Departamentos extends JPanel   {
	public JButton btnCrearDepart, btnConsultarDept, btnAtras;
	/**
	 * Create the panel.
	 */
	public Departamentos() {
		setLayout(null);
		
		btnCrearDepart = new JButton("Crear Nuevo Departamento");
		btnCrearDepart.setBounds(146, 63, 160, 46);
		add(btnCrearDepart);
		btnCrearDepart.setVisible(true);
		
		btnConsultarDept = new JButton("Consultar Departamentos");
		btnConsultarDept.setBounds(146, 162, 160, 46);
		add(btnConsultarDept);
		btnConsultarDept.setVisible(true);
		
		btnAtras = new JButton("Atras");
		btnAtras.setBounds(351, 266, 89, 23);
		add(btnAtras);
		btnAtras.setVisible(true);
	}
}