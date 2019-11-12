package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vista.JframePrincipal;

public class controladorBienvenida {
	public JframePrincipal vista;
	public PrincipalControlador controlador;

	public controladorBienvenida(JframePrincipal vista, PrincipalControlador controlador) {
		this.vista = vista;
		this.controlador = controlador;		
		
		initListeners();
	}	
	
	 /**
	 * Acción de los distintos listeners
	 */
	
	public void initListeners() {
		vista.bienvenida.btnBienvenida.addActionListener(new BotonListener());
		
	}
	
	private class BotonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String botonPulsado = e.getActionCommand();
			switch (botonPulsado) {
			case "bienvenida":
				vista.cardLayout.show(vista.contentPane, "2");
			}
			
		}
	}
}