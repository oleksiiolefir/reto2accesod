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
<<<<<<< HEAD
		String botonPulsado = e.getActionCommand();
		switch (botonPulsado) {
		case "Crear Nuevo Departamento":
			vista.cardLayout.show(vista.contentPane, "5");
			break;
		case "Consultar Departamentos":
			vista.cardLayout.show(vista.contentPane, "9");
			break;
=======
		Object sourceObject = e.getSource();
>>>>>>> 57067dbb3c2c87e684a43749f920f9a969fafa0e
		
		case "Atras":
			vista.cardLayout.show(vista.contentPane, "8");
			break;
		}
	}
			
}
}