package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import modelo.Empleado;
import vista.JframePrincipal;

public class controladorMostrarUsu{
	private JframePrincipal vista;
	private PrincipalControlador controlador;
	
	public controladorMostrarUsu(JframePrincipal vista, PrincipalControlador controlador) {
		this.vista = vista;
		this.controlador = controlador;
		initListeners();
	}
	
	/**
	 * Se crean los listeners del panel
	 */
	public void initListeners() {
		vista.mostrarUsuarios.btnAnterior.addActionListener(new BotonListener());
		vista.mostrarUsuarios.btnSiguiente.addActionListener(new BotonListener());
	}
	
	private class BotonListener implements ActionListener {

		@Override	
		public void actionPerformed(ActionEvent e) {
			
			Object sourceObject = e.getSource();
			ArrayList<Empleado> empleados = new ArrayList<Empleado>();
			int i=0;
			if (sourceObject instanceof JButton) {
				
				String botonPulsado = ((JButton) sourceObject).getActionCommand();
				switch(botonPulsado) {
					case "SIGUIENTE":
						if(i<=empleados.size()) {
							vista.mostrarUsuarios.lblBCod.setText(Integer.toString(empleados.get(i).getId()));
							vista.mostrarUsuarios.lblBNombre.setText(empleados.get(i).getNombre());
							vista.mostrarUsuarios.lblBApellid.setText(empleados.get(i).getApellido());
							vista.mostrarUsuarios.lblBDepat.setText(Integer.toString(empleados.get(i).getCod_dept()));
							vista.mostrarUsuarios.lblBCargo.setText(empleados.get(i).getPuesto());
							vista.mostrarUsuarios.lblBJefe.setText(Integer.toString(empleados.get(i).getBoss()));
							vista.mostrarUsuarios.btnAnterior.setEnabled(true);
							i++;
						}else {
							vista.mostrarUsuarios.btnSiguiente.setEnabled(false);							
						}
						
					break;	
					case "ANTERIOR":
						if(i!=0) {
							vista.mostrarUsuarios.lblBCod.setText(Integer.toString(empleados.get(i).getId()));
							vista.mostrarUsuarios.lblBNombre.setText(empleados.get(i).getNombre());
							vista.mostrarUsuarios.lblBApellid.setText(empleados.get(i).getApellido());
							vista.mostrarUsuarios.lblBDepat.setText(Integer.toString(empleados.get(i).getCod_dept()));
							vista.mostrarUsuarios.lblBCargo.setText(empleados.get(i).getPuesto());
							vista.mostrarUsuarios.lblBJefe.setText(Integer.toString(empleados.get(i).getBoss()));
							vista.mostrarUsuarios.btnSiguiente.setEnabled(true);
							i--;
						}else {
							vista.mostrarUsuarios.btnAnterior.setEnabled(false);
						}
					break;	
				}
				
			}
		}
	}
	
}
