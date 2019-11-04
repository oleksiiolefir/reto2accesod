package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CrearDepartamentos extends JPanel{
	
	private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;

/**
 * Create the panel.
 */
public CrearDepartamentos() {
	setLayout(null);
	
	JLabel label = new JLabel("Codigo de Departamento: ");
	label.setBounds(25, 30, 137, 19);
	add(label);
	
	JLabel label_1 = new JLabel("Lugar: ");
	label_1.setBounds(25, 60, 137, 19);
	add(label_1);
	
	JLabel label_2 = new JLabel("Nombre: ");
	label_2.setBounds(25, 90, 137, 19);
	add(label_2);
	
	textField = new JTextField();
	textField.setColumns(10);
	textField.setBounds(260, 29, 120, 19);
	add(textField);
	
	textField_1 = new JTextField();
	textField_1.setColumns(10);
	textField_1.setBounds(260, 59, 120, 19);
	add(textField_1);
	
	textField_2 = new JTextField();
	textField_2.setColumns(10);
	textField_2.setBounds(260, 89, 120, 19);
	add(textField_2);
	
	JButton btnCrear = new JButton("Crear");
	btnCrear.setBounds(25, 135, 89, 23);
	add(btnCrear);

}
}
