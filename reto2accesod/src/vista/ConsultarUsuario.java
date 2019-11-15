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
	public JLabel lblFiltrar;
	public JButton btnAtras, btnBuscar;
	
	/**
	 * Create the panel.
	 */
	public ConsultarUsuario() {
		setLayout(null);
		
		textCodEmple = new JTextField();
		textCodEmple.setColumns(10);
		textCodEmple.setBounds(260, 29, 120, 19);
		add(textCodEmple);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(260, 59, 120, 19);
		add(textNombre);
		
		btnAtras = new JButton("ATRAS");
		btnAtras.setBounds(25, 266, 89, 23);
		add(btnAtras);
		
		btnBuscar = new JButton("BUSCAR EMPLEADO");
		btnBuscar.setBounds(140, 216, 153, 34);
		add(btnBuscar);
		
		lblFiltrar = new JLabel("Filtrar");
		lblFiltrar.setBounds(23, 5, 74, 14);
		add(lblFiltrar);
		
		rdbtnCodEmple = new JRadioButton("Codigo de empleado ");
		rdbtnCodEmple.setBounds(5, 29, 157, 23);
		add(rdbtnCodEmple);
		
		rdbtnNombre = new JRadioButton("Nombre");
		rdbtnNombre.setBounds(5, 59, 157, 23);
		add(rdbtnNombre);

	}
}
