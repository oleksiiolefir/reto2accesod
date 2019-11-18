package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MostrarUsuarios extends JPanel{

	public JLabel lbCodEmple, lbNombre, lbApellido, lbDept, lbCargo, lbJefe, lblBCod, lblBNombre, lblBApellid, lblBDepat, lblBCargo, lblBJefe;
	public JButton btnAnterior, btnSiguiente;

	/**
	 * Create the panel.
	 */
	public MostrarUsuarios() {
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
		
		lbDept = new JLabel("Departamento del empleado: ");
		lbDept.setBounds(25, 120, 153, 19);
		add(lbDept);
		
		lbCargo = new JLabel("Cargo del empleado: ");
		lbCargo.setBounds(25, 150, 137, 19);
		add(lbCargo);
		
		lbJefe = new JLabel("Jefe asignado: ");
		lbJefe.setBounds(25, 180, 164, 19);
		add(lbJefe);
		
		lblBCod = new JLabel("");
		lblBCod.setBounds(216, 30, 137, 19);
		add(lblBCod);
		
		lblBNombre = new JLabel("");
		lblBNombre.setBounds(216, 60, 137, 19);
		add(lblBNombre);
		
		lblBApellid = new JLabel("");
		lblBApellid.setBounds(216, 90, 137, 19);
		add(lblBApellid);
		
		lblBDepat = new JLabel("");
		lblBDepat.setBounds(216, 120, 153, 19);
		add(lblBDepat);
		
		lblBCargo = new JLabel("");
		lblBCargo.setBounds(216, 150, 137, 19);
		add(lblBCargo);
		
		lblBJefe = new JLabel("");
		lblBJefe.setBounds(216, 180, 164, 19);
		add(lblBJefe);
		
		btnSiguiente = new JButton("SIGUIENTE");
		btnSiguiente.setBounds(318, 242, 89, 23);
		add(btnSiguiente);
		
		btnAnterior = new JButton("ANTERIOR");
		btnAnterior.setBounds(22, 242, 89, 23);
		add(btnAnterior);
	
	}
}