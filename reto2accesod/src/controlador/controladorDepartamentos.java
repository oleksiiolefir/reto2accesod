package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.JframePrincipal;


public class controladorDepartamentos {
	private JframePrincipal vista;
	private PrincipalControlador controlador;
	
public controladorDepartamentos(JframePrincipal vista, PrincipalControlador controlador) {
	this.vista = vista;
	this.controlador = controlador;
	initListeners();
}

/**
 * Se crean los listeners del panel
 */
public void initListeners() {
	vista.Departamentos.btnCrearDepart.addActionListener(new BotonListener());
	vista.Departamentos.btnConsultarDept.addActionListener(new BotonListener());
	vista.Departamentos.btnAtras.addActionListener(new BotonListener());
}

private class BotonListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		String botonPulsado = e.getActionCommand();
		switch (botonPulsado) {
		case "Crear Nuevo Departamento":
			vista.cardLayout.show(vista.contentPane, "5");
			break;
		case "Consultar Departamentos":
			vista.cardLayout.show(vista.contentPane, "9");
			break;

		case "Atras":
			vista.cardLayout.show(vista.contentPane, "8");
			break;
		}
	}
			
}
}