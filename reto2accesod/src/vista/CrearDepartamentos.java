package vista;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Conexion;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;




import javax.swing.JButton;

public class CrearDepartamentos extends JPanel{
	
public JTextField textField,textField_1 ,textField_2;

public JButton btnCrear,btnPrueba;

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
	
	 textField_1 = new JTextField("1");
	textField_1.setColumns(10);
	textField_1.setBounds(260, 59, 120, 19);
	add(textField_1);
	
		textField_2 = new JTextField();
	textField_2.setColumns(10);
	textField_2.setBounds(260, 89, 120, 19);
	add(textField_2);
	
	 btnCrear = new JButton("Crear");
	btnCrear.setBounds(25, 135, 89, 23);
	add(btnCrear);
	btnPrueba = new JButton("atras");
	btnPrueba.setBounds(35, 271, 89, 23);
	add(btnPrueba);
			
}

}
		



  
    

      