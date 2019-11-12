package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.JframePrincipal;

public class controladorMenuEmple {
	private JframePrincipal vista;
	private PrincipalControlador controlador;
	
	public controladorMenuEmple(JframePrincipal vista, PrincipalControlador controlador) {
		this.vista = vista;
		this.controlador = controlador;
		initListeners();
	}
	
	/**
	 * Se crean los listeners del panel
	 */
	public void initListeners() {
		vista.menuEmple.btnCrearUsu.addActionListener(new BotonListener());
		vista.menuEmple.btnConsultarUsu.addActionListener(new BotonListener());
		vista.menuEmple.btnAtras.addActionListener(new BotonListener());
	}
	
	private class BotonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String botonPulsado = e.getActionCommand();
			switch (botonPulsado) {
			case "Crear Nuevo Usuario":
				vista.cardLayout.show(vista.contentPane, "4");
				break;
			case "Consultar Usuarios":
				
				break;
			
			case "Atras":
				vista.cardLayout.show(vista.contentPane, "2");
				break;
			}
		}
				
	}
}