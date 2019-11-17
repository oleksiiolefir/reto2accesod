package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class ConsultarUsuario extends JPanel {
	public JTextField textCodEmple, textNombre;
	public JRadioButton rdbtnCodEmple, rdbtnNombre;
	public JLabel lblFiltrar, lblSeleccionaTexto;
	public JButton btnAtras, btnBuscar;
	
	/**
	 * Create the panel.
	 */
	public ConsultarUsuario() {
		setLayout(null);
		
		textCodEmple = new JTextField();
		textCodEmple.setColumns(10);
		textCodEmple.setBounds(261, 117, 120, 19);
		add(textCodEmple);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(261, 157, 120, 19);
		add(textNombre);
		
		btnAtras = new JButton("ATRAS");
		btnAtras.setBounds(25, 266, 89, 23);
		add(btnAtras);
		
		btnBuscar = new JButton("BUSCAR EMPLEADO");
		btnBuscar.setBounds(132, 202, 153, 34);
		add(btnBuscar);
		
		lblFiltrar = new JLabel("Filtrar por:");
		lblFiltrar.setBounds(16, 87, 74, 14);
		add(lblFiltrar);
		
		rdbtnCodEmple = new JRadioButton("Codigo de empleado ");
		rdbtnCodEmple.setBounds(6, 116, 157, 23);
		add(rdbtnCodEmple);
		
		rdbtnNombre = new JRadioButton("Nombre");
		rdbtnNombre.setBounds(6, 156, 157, 23);
		add(rdbtnNombre);
		
		lblSeleccionaTexto = new JLabel("<html><body>Selecciona una de las dos opciones para una busqueda filtrada, en el caso de no escoger ninguna opci\u00F3n se buscar\u00E1n todos los empleados.</body></html>");
		lblSeleccionaTexto.setBounds(6, 26, 370, 50);
		add(lblSeleccionaTexto);

	}
}
