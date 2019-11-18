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
	int i=0;
	
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
		vista.mostrarUsuarios.btnIrAlPrimero.addActionListener(new BotonListener());
		vista.mostrarUsuarios.btnIrAlltimo.addActionListener(new BotonListener());
		vista.mostrarUsuarios.btnSalir.addActionListener(new BotonListener());
		vista.mostrarUsuarios.btnAtras.addActionListener(new BotonListener());
	}
	
	private class BotonListener implements ActionListener {

		@Override	
		public void actionPerformed(ActionEvent e) {
			
			Object sourceObject = e.getSource();
			ArrayList<Empleado> empleadosM = new ArrayList<Empleado>();
			empleadosM = controlador.controladorConsultarUsu.lista;
			
			if (sourceObject instanceof JButton) {
				
				String botonPulsado = ((JButton) sourceObject).getActionCommand();
				switch(botonPulsado) {
					case "SIGUIENTE":
						if(i<(empleadosM.size()-1) ) {
							i++;	
							vista.mostrarUsuarios.lblBCod.setText(Integer.toString(empleadosM.get(i).getId()));
							vista.mostrarUsuarios.lblBNombre.setText(empleadosM.get(i).getNombre());
							vista.mostrarUsuarios.lblBApellid.setText(empleadosM.get(i).getApellido());
							vista.mostrarUsuarios.lblBDepat.setText(Integer.toString(empleadosM.get(i).getCod_dept()));
							vista.mostrarUsuarios.lblBCargo.setText(empleadosM.get(i).getPuesto());
							vista.mostrarUsuarios.lblBJefe.setText(Integer.toString(empleadosM.get(i).getBoss()));
							vista.mostrarUsuarios.btnAnterior.setEnabled(true);
							if(i==(empleadosM.size()-1)) {
								vista.mostrarUsuarios.btnSiguiente.setEnabled(false);
								vista.mostrarUsuarios.btnIrAlPrimero.setEnabled(true);
								vista.mostrarUsuarios.btnIrAlltimo.setEnabled(false);
							}
						}else {
							vista.mostrarUsuarios.btnSiguiente.setEnabled(false);							
						}
						
					break;	
					case "ANTERIOR":
						if(i!=0) {
							i--;
							if(i==0) {
								vista.mostrarUsuarios.btnAnterior.setEnabled(false);
								vista.mostrarUsuarios.btnIrAlPrimero.setEnabled(false);
								vista.mostrarUsuarios.btnIrAlltimo.setEnabled(true);
							}
							vista.mostrarUsuarios.lblBCod.setText(Integer.toString(empleadosM.get(i).getId()));
							vista.mostrarUsuarios.lblBNombre.setText(empleadosM.get(i).getNombre());
							vista.mostrarUsuarios.lblBApellid.setText(empleadosM.get(i).getApellido());
							vista.mostrarUsuarios.lblBDepat.setText(Integer.toString(empleadosM.get(i).getCod_dept()));
							vista.mostrarUsuarios.lblBCargo.setText(empleadosM.get(i).getPuesto());
							vista.mostrarUsuarios.lblBJefe.setText(Integer.toString(empleadosM.get(i).getBoss()));
							vista.mostrarUsuarios.btnSiguiente.setEnabled(true);						
						}else {
							vista.mostrarUsuarios.btnAnterior.setEnabled(false);
						}
					break;
					case "Ir al primer empleado":
						i=0;
						vista.mostrarUsuarios.lblBCod.setText(Integer.toString(empleadosM.get(i).getId()));
						vista.mostrarUsuarios.lblBNombre.setText(empleadosM.get(i).getNombre());
						vista.mostrarUsuarios.lblBApellid.setText(empleadosM.get(i).getApellido());
						vista.mostrarUsuarios.lblBDepat.setText(Integer.toString(empleadosM.get(i).getCod_dept()));
						vista.mostrarUsuarios.lblBCargo.setText(empleadosM.get(i).getPuesto());
						vista.mostrarUsuarios.lblBJefe.setText(Integer.toString(empleadosM.get(i).getBoss()));
						vista.mostrarUsuarios.btnAnterior.setEnabled(false);
						vista.mostrarUsuarios.btnSiguiente.setEnabled(true);
						vista.mostrarUsuarios.btnIrAlPrimero.setEnabled(false);
						vista.mostrarUsuarios.btnIrAlltimo.setEnabled(true);
					break;
					case "Ir al último empleado":
						i=empleadosM.size()-1;
						vista.mostrarUsuarios.lblBCod.setText(Integer.toString(empleadosM.get(i).getId()));
						vista.mostrarUsuarios.lblBNombre.setText(empleadosM.get(i).getNombre());
						vista.mostrarUsuarios.lblBApellid.setText(empleadosM.get(i).getApellido());
						vista.mostrarUsuarios.lblBDepat.setText(Integer.toString(empleadosM.get(i).getCod_dept()));
						vista.mostrarUsuarios.lblBCargo.setText(empleadosM.get(i).getPuesto());
						vista.mostrarUsuarios.lblBJefe.setText(Integer.toString(empleadosM.get(i).getBoss()));
						vista.mostrarUsuarios.btnSiguiente.setEnabled(false);
						vista.mostrarUsuarios.btnAnterior.setEnabled(true);
						vista.mostrarUsuarios.btnIrAlPrimero.setEnabled(true);
						vista.mostrarUsuarios.btnIrAlltimo.setEnabled(false);
					break;
					case "ATRAS":
						vista.consultarUsuario.rdbtnCodEmple.setSelected(false);
						vista.consultarUsuario.rdbtnNombre.setSelected(false);
						vista.consultarUsuario.textCodEmple.setText(" ");
						vista.consultarUsuario.textNombre.setText(" ");
						vista.cardLayout.show(vista.contentPane, "6");
					break;
					case "SALIR":
						vista.consultarUsuario.rdbtnCodEmple.setSelected(false);
						vista.consultarUsuario.rdbtnNombre.setSelected(false);
						vista.consultarUsuario.textCodEmple.setText(" ");
						vista.consultarUsuario.textNombre.setText(" ");
						vista.cardLayout.show(vista.contentPane, "2");
					break;
				}
				
			}
		}
	}
	
}
