package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import vista.CrearDepartamentos;
import vista.verDepartamentos;

import javax.swing.JButton;
import java.awt.event.*;
public class controladorDepartamentos implements ActionListener{
	

	

	

	@Override
	public void actionPerformed(ActionEvent e) {
Object sourceObject = e.getSource();
		
		if (sourceObject instanceof JButton) {
			
			String botonPulsado = ((JButton) sourceObject).getActionCommand();
		   
			// comprobamos que boton se ha pulsado y ejecutamos sus acciones
			switch (botonPulsado) {
				case "Crear Departamentos":	
					 
				
					CrearDepartamentos CrearDepartamentos=new CrearDepartamentos(); 
					CrearDepartamentos.setVisible(true); 

					
					break;
				
			
				case "Ver Departementos":
					verDepartamentos verDepartamentos=new verDepartamentos(); 
					verDepartamentos.setVisible(true); 

					break;
					
				
			}
			

			} 
	}

}