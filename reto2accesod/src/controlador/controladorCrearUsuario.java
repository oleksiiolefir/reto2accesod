package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import vista.JframePrincipal;

public class controladorCrearUsuario implements ActionListener{
	private JframePrincipal vista;
	private PrincipalControlador controlador;
	
	public controladorCrearUsuario(JframePrincipal vista, PrincipalControlador controlador) {
		this.vista = vista;
		this.controlador = controlador;
	}
	
	/**
	 * Se crean los listeners del panel
	 */
	public void addListeners() {
		vista.crearUsuario.btnAgregar.addActionListener(this);

	}
	 /**
	 * Acción de los distintos listeners
	 */
	public void actionPerformed(ActionEvent e) {
		
		Object sourceObject = e.getSource();
		
		if (sourceObject instanceof JButton) {
			
			String botonPulsado = ((JButton) sourceObject).getActionCommand();
			
			switch(botonPulsado) {
			case "GUARDAR":
				vista.menu.setVisible(true);
				vista.bienvenida.setVisible(false);
				break;
			case "prueba":
				
				break;
			}
		}
	}
}
