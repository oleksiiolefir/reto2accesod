package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vista.JframePrincipal;


public class controladorMenu{
	public JframePrincipal vista;
	public PrincipalControlador controlador;

	
	public controladorMenu(JframePrincipal vista, PrincipalControlador controlador) {
		this.vista = vista;
		this.controlador = controlador;
	
		 initListeners();
	}

	/**
	 * Se crean los listeners del panel
	 */
	public void initListeners() {
		vista.menu.btnUsuarios.addActionListener(new BotonListener());
		vista.menu.btnDepartamentos.addActionListener(new BotonListener());
	}
	
	 /**
	 * Acción de los distintos listeners
	 */
	private class BotonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String botonPulsado = e.getActionCommand();
			switch (botonPulsado) {
			case "USUARIOS":
				vista.cardLayout.show(vista.contentPane, "3");
				
				break;
			case "DEPARTAMENTOS":
				
				break;
			}
			
		}
	}
}
