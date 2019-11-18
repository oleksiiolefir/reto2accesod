package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MostrarUsuarios extends JPanel{

	public JLabel lbCodEmple, lbNombre, lbApellido, lbDept, lbCargo, lbJefe, lblBCod, lblBNombre, lblBApellid, lblBDepat, lblBCargo, lblBJefe;
	public JButton btnAnterior, btnSiguiente, btnIrAlPrimero, btnIrAlltimo, btnSalir, btnAtras;

	/**
	 * Create the panel.
	 */
	public MostrarUsuarios() {
		setLayout(null);
		
		lbCodEmple = new JLabel("Codigo de empleado: ");
		lbCodEmple.setBounds(25, 11, 137, 19);
		add(lbCodEmple);
		
		lbNombre = new JLabel("Nombre: ");
		lbNombre.setBounds(25, 41, 137, 19);
		add(lbNombre);
		
		lbApellido = new JLabel("Primer apellido: ");
		lbApellido.setBounds(25, 71, 137, 19);
		add(lbApellido);
		
		lbDept = new JLabel("Departamento del empleado: ");
		lbDept.setBounds(25, 101, 153, 19);
		add(lbDept);
		
		lbCargo = new JLabel("Cargo del empleado: ");
		lbCargo.setBounds(25, 131, 137, 19);
		add(lbCargo);
		
		lbJefe = new JLabel("Jefe asignado: ");
		lbJefe.setBounds(25, 161, 164, 19);
		add(lbJefe);
		
		lblBCod = new JLabel("");
		lblBCod.setBounds(216, 11, 137, 19);
		add(lblBCod);
		
		lblBNombre = new JLabel("");
		lblBNombre.setBounds(216, 41, 137, 19);
		add(lblBNombre);
		
		lblBApellid = new JLabel("");
		lblBApellid.setBounds(216, 71, 137, 19);
		add(lblBApellid);
		
		lblBDepat = new JLabel("");
		lblBDepat.setBounds(216, 101, 153, 19);
		add(lblBDepat);
		
		lblBCargo = new JLabel("");
		lblBCargo.setBounds(216, 131, 137, 19);
		add(lblBCargo);
		
		lblBJefe = new JLabel("");
		lblBJefe.setBounds(216, 161, 164, 19);
		add(lblBJefe);
		
		btnSiguiente = new JButton("SIGUIENTE");
		btnSiguiente.setBounds(245, 191, 164, 30);
		add(btnSiguiente);
		
		btnAnterior = new JButton("ANTERIOR");
		btnAnterior.setBounds(24, 191, 156, 30);
		add(btnAnterior);
		
		btnIrAlPrimero = new JButton("Ir al primer empleado");
		btnIrAlPrimero.setBounds(27, 229, 154, 23);
		add(btnIrAlPrimero);
		
		btnIrAlltimo = new JButton("Ir al \u00FAltimo empleado");
		btnIrAlltimo.setBounds(245, 229, 163, 21);
		add(btnIrAlltimo);
		
		btnSalir = new JButton("SALIR");
		btnSalir.setBounds(245, 266, 164, 23);
		add(btnSalir);
		
		btnAtras = new JButton("ATRAS");
		btnAtras.setBounds(22, 266, 156, 23);
		add(btnAtras);
	
	}
}
