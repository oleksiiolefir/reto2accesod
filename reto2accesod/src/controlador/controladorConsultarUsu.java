package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import modelo.Conexion;
import modelo.Consultas;
import modelo.Empleado;
import vista.JframePrincipal;

public class controladorConsultarUsu{
	private JframePrincipal vista;
	private PrincipalControlador controlador;
	
	public controladorConsultarUsu(JframePrincipal vista, PrincipalControlador controlador) {
		this.vista = vista;
		this.controlador = controlador;
		
		initListeners();
	}
	
	/**
	 * Se crean los listeners del panel
	 */
	public void initListeners() {
		vista.consultarUsuario.btnAtras.addActionListener(new BotonListener());
		vista.consultarUsuario.btnBuscar.addActionListener(new BotonListener());
	}	
	
	
	private class BotonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Object sourceObject = e.getSource();
			Conexion c = new Conexion();
			Consultas consult = new Consultas(c);
			Object[] lista=new Object[5];
			Object [] encontrado=new Object[5];
	
			ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	
			if (sourceObject instanceof JButton) {
				
				String botonPulsado = ((JButton) sourceObject).getActionCommand();

				switch(botonPulsado) {
				case "BUSCAR EMPLEADO":
					vista.cardLayout.show(vista.contentPane, "7");
					Empleado emple = new Empleado();
					if(vista.consultarUsuario.rdbtnCodEmple.isSelected()) {
	                	lista=consult.comparar("ID");
	    				for(int n=0; n<lista.length ; n++) {
	    					if(lista[n]==vista.consultarUsuario.textCodEmple.getText()) {
	    						encontrado[n]=lista[n];
	    						vista.consultarUsuario.rdbtnNombre.setSelected(false);
	    					}
	    				}
					}
	    			else if(vista.consultarUsuario.rdbtnNombre.isSelected()) {
	    				lista=consult.comparar("NOMBRE");
	    				for(int n=0; n<lista.length ; n++) {
	    					if(lista[n]==vista.consultarUsuario.textNombre.getText()) {
	    						encontrado[n]=lista[n];    						
	    						vista.consultarUsuario.rdbtnCodEmple.setSelected(false);
	    					}
	    				}	
	    			}else {
	    				lista=consult.comparar("*");
	    				for(int n=0; n<lista.length ; n++) {  					
	    						encontrado[n]=lista[n];    					   						
	    				}
	    			}
					for(int i=0; i<encontrado.length ; i++) {
						//empleados.add(lista[i]);
					}
					vista.mostrarUsuarios.lblBCod.setText(Integer.toString(empleados.get(0).getId()));
					vista.mostrarUsuarios.lbNombre.setText(empleados.get(0).getNombre());
					vista.mostrarUsuarios.lbApellido.setText(empleados.get(0).getApellido());
					vista.mostrarUsuarios.lbDept.setText(Integer.toString(empleados.get(0).getSueldo()));
					vista.mostrarUsuarios.lbCargo.setText(Integer.toString(empleados.get(0).getCod_dept()));
					vista.mostrarUsuarios.lbJefe.setText(Integer.toString(empleados.get(0).getCod_dept()));
					
					vista.cardLayout.show(vista.contentPane, "7");
				break;
				case "ATRAS":
					vista.cardLayout.show(vista.contentPane, "3");
				break;
				}
			
			}
		}
	}
}


