package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Departamentos extends JPanel {

	/**
	 * Create the panel.
	 */
	public Departamentos() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Crear Departamentos");
		btnNewButton.setBounds(111, 30, 192, 48);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ver Departementos");
		btnNewButton_1.setBounds(111, 159, 192, 48);
		add(btnNewButton_1);

	}
	public class Boton extends JFrame implements ActionListener {
		JButton boton;
		JLabel texto;
		public Boton() {
		setLayout(null);
		boton=new JButton("SALIR");
		boton.setBounds(100,150,100,30);
		boton.addActionListener((ActionListener) this);
		add(boton);
		texto=new JLabel("Presione el botón para salir.");
		texto.setBounds(50,50,220,40);
		add(texto);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
}}
