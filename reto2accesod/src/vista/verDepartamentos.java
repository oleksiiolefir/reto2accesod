package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.JScrollPane;

public class verDepartamentos extends JPanel {
	public JTextField textCodDepart, textNombre;
	public JRadioButton rdbtnCodDepart, rdbtnNombre;
	public JLabel lblFiltrar, lblSeleccionaTexto;
	public JButton btnAtras, btnBuscar;
	
	/**
	 * Create the panel.
	 */
	public verDepartamentos() {
		setLayout(null);
		
		textCodDepart = new JTextField();
		textCodDepart.setColumns(10);
		textCodDepart.setBounds(261, 117, 120, 19);
		add(textCodDepart);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(261, 157, 120, 19);
		add(textNombre);
		
		btnAtras = new JButton("ATRAS");
		btnAtras.setBounds(25, 266, 89, 23);
		add(btnAtras);
		
		btnBuscar = new JButton("BUSCAR DEPARTAMENTO");
		btnBuscar.setBounds(132, 202, 153, 34);
		add(btnBuscar);
		
		lblFiltrar = new JLabel("Filtrar por:");
		lblFiltrar.setBounds(16, 87, 74, 14);
		add(lblFiltrar);
		
		rdbtnCodDepart = new JRadioButton("Codigo de departamento ");
		rdbtnCodDepart.setBounds(6, 116, 157, 23);
		add(rdbtnCodDepart);
		
		rdbtnNombre = new JRadioButton("Nombre");
		rdbtnNombre.setBounds(6, 156, 157, 23);
		add(rdbtnNombre);

		lblSeleccionaTexto = new JLabel("<html><body>Selecciona una de las dos opciones para una busqueda filtrada, en el caso de no escoger ninguna opci\u00F3n se buscar\u00E1n todos los departamentos.</body></html>");
		lblSeleccionaTexto.setBounds(6, 26, 370, 50);
		add(lblSeleccionaTexto);

	}
}

