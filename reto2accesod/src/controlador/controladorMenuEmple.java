package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vista.JframePrincipal;

public class controladorMenuEmple implements ActionListener{
	private JframePrincipal vista;
	private controladorJframe controlador;
	
	public controladorMenuEmple(JframePrincipal vista, controladorJframe controlador) {
		this.vista = vista;
		this.controlador = controlador;
	}
	
	/**
	 * Se crean los listeners del panel
	 */
	public void addListeners() {
		vista.menuEmple.btnAtras.addActionListener(this);
		vista.menuEmple.btnConsultarUsu.addActionListener(this);
		vista.menuEmple.btnCrearUsu.addActionListener(this);
	}
	
	 /**
	 * Acción de los distintos listeners
	 */
	public void actionPerformed(ActionEvent e) {
		Object sourceObject = e.getSource();
		
			
			String botonPulsado = ((JButton) sourceObject).getActionCommand();
		   
			// comprobamos que boton se ha pulsado y ejecutamos sus acciones
			switch (botonPulsado) {
				case "Crear Nuevo Usuario":	//Cuando pulsa el boton continuar pasan las siguientes cosas: 
					vista.crearUsuario.setVisible(true);
					vista.menuEmple.setVisible(false);
					break;
				
				case "Consultar Usuarios":
					vista.menuEmple.setVisible(false);
					break;
				
				case "Atras":
					vista.menu.setVisible(true);
					vista.menuEmple.setVisible(false);
					break;
			}
			

	}
}
