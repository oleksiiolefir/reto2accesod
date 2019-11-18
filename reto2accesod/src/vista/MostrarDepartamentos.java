package vista;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MostrarDepartamentos extends JPanel{

	public JLabel lbCodDepart, lbNombre, lbLugar, lblBCod, lblBNombre, lblBLugar;
	public JButton btnAnterior, btnSiguiente;

	/**
	 * Create the panel.
	 */
	public MostrarDepartamentos() {
		setLayout(null);
		
		lbCodDepart = new JLabel("Codigo de Departamento: ");
		lbCodDepart.setBounds(25, 30, 137, 19);
		add(lbCodDepart);
		
		lbNombre = new JLabel("Nombre: ");
		lbNombre.setBounds(25, 60, 137, 19);
		add(lbNombre);
		
		lbLugar = new JLabel("Lugar: ");
		lbLugar.setBounds(25, 90, 137, 19);
		add(lbLugar);
		
		lblBCod = new JLabel("");
		lblBCod.setBounds(216, 30, 137, 19);
		add(lblBCod);
		
		lblBNombre = new JLabel("");
		lblBNombre.setBounds(216, 60, 137, 19);
		add(lblBNombre);
		
		lblBLugar = new JLabel("");
		lblBLugar.setBounds(216, 90, 137, 19);
		add(lblBLugar);
		
		btnSiguiente = new JButton("SIGUIENTE");
		btnSiguiente.setBounds(318, 242, 89, 23);
		add(btnSiguiente);
		
		btnAnterior = new JButton("ANTERIOR");
		btnAnterior.setBounds(22, 242, 89, 23);
		add(btnAnterior);
	
	}}