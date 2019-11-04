package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.JframePrincipal;

public class controladorCrearUsuario implements ActionListener{
	private JframePrincipal vista;
	private controladorJframe controlador;
	
	public controladorCrearUsuario(JframePrincipal vista, controladorJframe controlador) {
		this.vista = vista;
		this.controlador = controlador;
	}
	
	/**
	 * Se crean los listeners del panel
	 */
	public void addListeners() {
		vista.crearUsuario.btnAgregar.addActionListener(this);
	}
	
	public void datosCorrectos() {
		try {
			
		} catch(Exception e) {
			
		}
	}
	
	 /**
	 * Acci�n de los distintos listeners
	 */
	public void actionPerformed(ActionEvent e) {
		vista.menu.setVisible(true);
		vista.bienvenida.setVisible(false);
	}
}