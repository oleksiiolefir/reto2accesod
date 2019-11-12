package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import modelo.Empleado;
import vista.JframePrincipal;

public class controladorMostrarUsu implements ActionListener{
	private JframePrincipal vista;
	private controladorJframe controlador;
	
	/**
	 * Se crean los listeners del panel
	 */
	public void addListeners() {
		vista.mostrarUsuarios.btnAnterior.addActionListener(this);
		vista.mostrarUsuarios.btnSiguiente.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Object sourceObject = e.getSource();
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		
		for(int i=0; i<empleados.size(); i++) {
			vista.mostrarUsuarios.lblBCod.setText(Integer.toString(empleados.get(i).getId()));
			vista.mostrarUsuarios.lblBNombre.setText(empleados.get(i).getNombre());
			vista.mostrarUsuarios.lblBApellid.setText(empleados.get(i).getApellido());
			vista.mostrarUsuarios.lblBDepat.setText(Integer.toString(empleados.get(i).getCod_dept()));
			vista.mostrarUsuarios.lblBCargo.setText(empleados.get(i).getPuesto());
			vista.mostrarUsuarios.lblBJefe.setText(Integer.toString(empleados.get(i).getBoss()));
		}
	}
	
}
