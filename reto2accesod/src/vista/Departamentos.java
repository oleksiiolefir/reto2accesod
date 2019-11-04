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

public class Departamentos extends JPanel  implements ActionListener {

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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}}
