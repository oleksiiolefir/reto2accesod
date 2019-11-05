package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.JframePrincipal;

public class controladorBienvenida implements ActionListener{
	private JframePrincipal vista;
	private PrincipalControlador controlador;
	
	public controladorBienvenida(JframePrincipal vista, PrincipalControlador controlador) {
		this.vista = vista;
		this.controlador = controlador;
	}

	/**
	 * Se crean los listeners del panel
	 */
	public void addListeners() {
		vista.bienvenida.btnBienvenida.addActionListener(null);
	}
	
	 /**
	 * Acci�n de los distintos listeners
	 */
	public void actionPerformed(ActionEvent e) {
		vista.menu.setVisible(true);
		vista.bienvenida.setVisible(false);
	}
}