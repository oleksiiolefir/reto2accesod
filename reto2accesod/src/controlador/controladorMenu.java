package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;


import modelo.Conexion;
import modelo.Consultas;
import modelo.Empleado;
import modelo.GenerarTXT;
import modelo.PrincipalModelo;
import vista.JframePrincipal;


public class controladorMenu{
	public JframePrincipal vista;
	public PrincipalControlador controlador;
	public PrincipalModelo modelo;

	
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
		vista.menu.btnGenerarTXT.addActionListener(new BotonListener());
	}
	
	 /**
	 * Acción de los distintos listeners
	 */
	private class BotonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object sourceObject = e.getSource();
			Conexion c = new Conexion(modelo);
			Consultas consult = new Consultas(c);
			
			if (sourceObject instanceof JButton) {
				String botonPulsado = e.getActionCommand();
				switch (botonPulsado) {
				case "USUARIOS":
					vista.cardLayout.show(vista.contentPane, "3");				
				break;
				case "DEPARTAMENTOS":
					vista.cardLayout.show(vista.contentPane, "5");
				break;			
				case "GENERAR TXT":
					ArrayList<Empleado> ListaBBDD =new ArrayList<Empleado>();
					ListaBBDD=consult.compararTodo();
					GenerarTXT.GenerarTXT(ListaBBDD);
				break;
				}
			}
			
		}
	}
}
