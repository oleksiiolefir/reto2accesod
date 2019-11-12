package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import modelo.Conexion;
import modelo.Consultas;
import modelo.Empleado;
import vista.JframePrincipal;

public class controladorConsultarUsu implements ActionListener{
	private JframePrincipal vista;
	private controladorJframe controlador;
	public static String []encontrado= new String [4];
	
	public controladorConsultarUsu(JframePrincipal vista, controladorJframe controlador) {
		this.vista = vista;
		this.controlador = controlador;
	}
	
	/**
	 * Se crean los listeners del panel
	 */
	public void addListeners() {
		vista.consultarUsuario.btnAtras.addActionListener(this);
		vista.consultarUsuario.btnBuscar.addActionListener(this);
	}	
	
	 /**
	 * Acción de los distintos listeners
	 */
	public void actionPerformed(ActionEvent e) {
		
		Object sourceObject = e.getSource();
		Conexion c = new Conexion();
		Consultas consult = new Consultas(c);
		Object [] lista=new Object[5];
		int contador=0;
		

		ArrayList<Empleado> empleados = new ArrayList<Empleado>();

		if (sourceObject instanceof JButton) {
			
			String botonPulsado = ((JButton) sourceObject).getActionCommand();
			
			switch(botonPulsado) {
			case "BUSCAR EMPLEADO":
				Empleado emple = new Empleado();
				for(int i=0; i<5; i++) {
					switch (i) {
	                case 0:
	                	if(vista.consultarUsuario.rdbtnCodEmple.isSelected()) {
		                	lista=consult.comparar("id");
		    				for(int n=0; n<lista.length ; n++) {
		    					if(lista[n]==vista.consultarUsuario.textCodEmple.getText()) {
		    						encontrado[0]=encontrado[0] + vista.consultarUsuario.textCodEmple.getText();
		    					}
		    					contador++;
		    				}
	                	}
	                break;
	                case 1:
	                	if(vista.consultarUsuario.rdbtnNombre.isSelected()) {
		                	lista=consult.comparar("Nombre");
		    				for(int n=0; n<lista.length ; n++) {
		    					if(lista[n]==vista.consultarUsuario.textNombre.getText()) {
		    						contador++;
		    						encontrado[1]=encontrado[1] + vista.consultarUsuario.textNombre.getText();
		    					}
		    					contador++;
		    				}
	                	}
	                break;
	                case 2:
	                	if(vista.consultarUsuario.rdbtnApellido.isSelected()) {
		                	lista=consult.comparar("Apellido");
		    				for(int n=0; n<lista.length ; n++) {
		    					if(lista[n]==vista.consultarUsuario.textApellido.getText()) {
		    						contador++;
		    						encontrado[2]=encontrado[2] + vista.consultarUsuario.textApellido.getText();
		    					}
		    					contador++;
		    				}
	                	}
	                break;
	                case 3:
	                	if(vista.consultarUsuario.rdbtnDepart.isSelected()) {
		                	lista=consult.comparar("Departamento");
		    				for(int n=0; n<lista.length ; n++) {
		    					if(lista[n]==vista.consultarUsuario.textDept.getText()) {
		    						contador++;
		    						encontrado[3]=encontrado[3] + vista.consultarUsuario.textApellido.getText();
		    					}
		    					contador++;
		    				}
	                	}
	    			break;
	                case 4:
	                	if(vista.consultarUsuario.rdbtnCargo.isSelected()) {
		                	lista=consult.comparar("Cargo");
		    				for(int n=0; n<lista.length ; n++) {
		    					if(lista[n]==vista.consultarUsuario.textCargo.getText()) {
		    						contador++;
		    						encontrado[4]=encontrado[0] + Integer.toString(contador);
		    					}
		    				}
	                	}
	    			break;	    			
	                } 
				}
			case "ATRAS":
	
				break;
			}
		
		}
	}
}
