package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.*;

public class Departamentos extends JPanel   {
	public JButton btnCrearDepart, btnConsultarDept, btnAtras;
	/**
	 * Create the panel.
	 */
	public Departamentos() {
		setLayout(null);
		
		btnCrearDepart = new JButton("Crear Nuevo Departamento");
		btnCrearDepart.setBounds(100, 63, 206, 46);
		add(btnCrearDepart);
		btnCrearDepart.setVisible(true);
		
		btnConsultarDept = new JButton("Consultar Departamentos");
		btnConsultarDept.setBounds(100, 162, 206, 46);
		add(btnConsultarDept);
		btnConsultarDept.setVisible(true);
		
		btnAtras = new JButton("Atras");
		btnAtras.setBounds(351, 266, 89, 23);
		add(btnAtras);
		btnAtras.setVisible(true);
	}
}