package vista;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MostrarDepartamentos extends JPanel{

	public JLabel lbCodDepart, lbNombre, lbLugar, lblBCod, lblBNombre, lblBLugar;
	public JButton btnAnterior, btnSiguiente,btnIrAlPrimero, btnIrAlltimo, btnSalir, btnAtras;

	/**
	 * Create the panel.
	 */
	public MostrarDepartamentos() {
		setLayout(null);
		
		lbCodDepart = new JLabel("Codigo de Departamento: ");
		lbCodDepart.setBounds(25, 30, 161, 19);
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
		btnSiguiente.setBounds(232, 191, 185, 30);
		add(btnSiguiente);
		
		btnAnterior = new JButton("ANTERIOR");
		btnAnterior.setBounds(24, 191, 186, 30);
		add(btnAnterior);
		
		btnIrAlPrimero = new JButton("Ir al primer Departamento");
		btnIrAlPrimero.setBounds(27, 229, 183, 23);
		add(btnIrAlPrimero);
		
		btnIrAlltimo = new JButton("Ir al ultimo Departamento");
		btnIrAlltimo.setBounds(231, 229, 186, 21);
		add(btnIrAlltimo);
		
		btnSalir = new JButton("SALIR");
		btnSalir.setBounds(232, 266, 185, 23);
		add(btnSalir);
		
		btnAtras = new JButton("ATRAS");
		btnAtras.setBounds(22, 266, 188, 23);
		add(btnAtras);
	
	}}