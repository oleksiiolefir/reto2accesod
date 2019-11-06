package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CrearUsuario extends JPanel {
	public JTextField textCodEmple, textNombre, textApellido, textSueldo, textDept, textCargo, textConCargo, textJefe;
	public JLabel lbCodEmple, lbNombre, lbApellido, lbSueldo, lbDept, lbCargo, lbConCargo, lbJefe;
	public JButton btnAgregar, btnPrueba;
	
	/**
	 * Create the panel.
	 */
	public CrearUsuario() {
		setLayout(null);
		
		lbCodEmple = new JLabel("Codigo de empleado: ");
		lbCodEmple.setBounds(25, 30, 137, 19);
		add(lbCodEmple);
		
		lbNombre = new JLabel("Nombre: ");
		lbNombre.setBounds(25, 60, 137, 19);
		add(lbNombre);
		
		lbApellido = new JLabel("Primer apellido: ");
		lbApellido.setBounds(25, 90, 137, 19);
		add(lbApellido);
		
		lbSueldo = new JLabel("Sueldo: ");
		lbSueldo.setBounds(25, 120, 137, 19);
		add(lbSueldo);
		
		lbDept = new JLabel("Departamento del empleado: ");
		lbDept.setBounds(25, 150, 153, 19);
		add(lbDept);
		
		lbCargo = new JLabel("Cargo del empleado: ");
		lbCargo.setBounds(25, 180, 137, 19);
		add(lbCargo);
		
		lbConCargo = new JLabel("\u00BFTiene a alguien a cargo? (Si/No)");
		lbConCargo.setBounds(25, 210, 164, 19);
		add(lbConCargo);
		
		lbJefe = new JLabel("Jefe asignado: ");
		lbJefe.setBounds(25, 241, 164, 19);
		add(lbJefe);
		
		textCodEmple = new JTextField();
		textCodEmple.setColumns(10);
		textCodEmple.setBounds(260, 29, 120, 19);
		add(textCodEmple);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(260, 59, 120, 19);
		add(textNombre);
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setBounds(260, 89, 120, 19);
		add(textApellido);
		
		textSueldo = new JTextField();
		textSueldo.setColumns(10);
		textSueldo.setBounds(260, 119, 120, 19);
		add(textSueldo);
		
		textDept = new JTextField();
		textDept.setColumns(10);
		textDept.setBounds(260, 149, 120, 19);
		add(textDept);
		
		textCargo = new JTextField();
		textCargo.setColumns(10);
		textCargo.setBounds(260, 179, 120, 19);
		add(textCargo);
		
		textConCargo = new JTextField();
		textConCargo.setColumns(10);
		textConCargo.setBounds(260, 209, 120, 19);
		add(textConCargo);
		
		textJefe = new JTextField();
		textJefe.setColumns(10);
		textJefe.setBounds(260, 240, 120, 19);
		add(textJefe);
		
		btnAgregar = new JButton("GUARDAR");
		btnAgregar.setBounds(351, 270, 89, 23);
		add(btnAgregar);
		
		btnPrueba = new JButton("prueba");
		btnPrueba.setBounds(35, 271, 89, 23);
		add(btnPrueba);

	}
}
