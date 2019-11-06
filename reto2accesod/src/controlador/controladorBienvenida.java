package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vista.JframePrincipal;

public class controladorBienvenida implements ActionListener{
	private JframePrincipal vista;
	public PrincipalControlador controlador;

	
	public controladorBienvenida(JframePrincipal vista, PrincipalControlador controlador) {
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
    		// guardamos el nombre del boton pulsado
		String botonPulsado = ((JButton) e.getSource()).getActionCommand();
			vista.menuEmple.setVisible(true);
			vista.bienvenida.setVisible(false);	
	}
}