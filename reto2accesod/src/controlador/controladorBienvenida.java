package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vista.JframePrincipal;

public class controladorBienvenida implements ActionListener{
	private JframePrincipal vista;
	private controladorJframe controlador;
	
	public controladorBienvenida(JframePrincipal vista, controladorJframe controlador) {
		this.vista = vista;
		this.controlador = controlador;
	}
	
	/**
	 * Se crean los listeners del panel
	 */
	public void addListeners() {
		vista.bienvenida.btnBienvenida.addActionListener(this);
	}
	
	 /**
	 * Acción de los distintos listeners
	 */
	public void actionPerformed(ActionEvent e) {
		Object sourceObject = e.getSource();
		
		
		String botonPulsado = ((JButton) sourceObject).getActionCommand();
	   
		// comprobamos que boton se ha pulsado y ejecutamos sus acciones
		switch (botonPulsado) {
			case "BIENVENIDA":	//Cuando pulsa el boton BIENVENIDA pasan las siguientes cosas: 
				vista.menu.setVisible(true);
				vista.bienvenida.setVisible(false);
				break;
		}
		
	}
}