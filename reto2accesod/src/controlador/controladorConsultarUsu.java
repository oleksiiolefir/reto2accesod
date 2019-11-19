package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import modelo.Conexion;
import modelo.Consultas;
import modelo.Empleado;
import modelo.PrincipalModelo;
import vista.JframePrincipal;

public class controladorConsultarUsu{
	private JframePrincipal vista;
	private PrincipalControlador controlador;
	private PrincipalModelo modelo;
	ArrayList<Empleado>lista=new ArrayList<Empleado>();
	
	public controladorConsultarUsu(JframePrincipal vista, PrincipalControlador controlador,PrincipalModelo modelo) {
		this.vista = vista;
		this.controlador = controlador;
		this.modelo = modelo;
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
		
			if (sourceObject instanceof JButton) {
				
				String botonPulsado = ((JButton) sourceObject).getActionCommand();

				switch(botonPulsado) {
				case "BUSCAR EMPLEADO":
					if(vista.consultarUsuario.rdbtnCodEmple.isSelected()) {
	                	lista=modelo.consultas.comparar(vista.consultarUsuario.textCodEmple.getText());
	    				for(int n=0; n<lista.size() ; n++) {	    						
	    					vista.consultarUsuario.rdbtnNombre.setSelected(false);
	    				}
					}
	    			else if(vista.consultarUsuario.rdbtnNombre.isSelected()) {
	    				lista=modelo.consultas.compararNombre(vista.consultarUsuario.textNombre.getText());
	    				for(int n=0; n<lista.size() ; n++) {
	    					if(lista.get(n).getNombre()==vista.consultarUsuario.textNombre.getText()) {
	    						vista.consultarUsuario.rdbtnCodEmple.setSelected(false);
	    					}
	    				}	
	    			}else {
	    				lista=modelo.consultas.compararTodo();
	    			}
					if(lista.size()==1) {
						vista.mostrarUsuarios.btnSiguiente.setEnabled(false);
						vista.mostrarUsuarios.btnIrAlPrimero.setEnabled(false);
						vista.mostrarUsuarios.btnIrAlltimo.setEnabled(false);
			
						vista.mostrarUsuarios.btnAnterior.setEnabled(false);
						
						
					}else {
						
						vista.mostrarUsuarios.btnSiguiente.setEnabled(true);
						vista.mostrarUsuarios.btnIrAlPrimero.setEnabled(false);
						vista.mostrarUsuarios.btnIrAlltimo.setEnabled(true);
			
						vista.mostrarUsuarios.btnAnterior.setEnabled(false);
						
					}
					if(lista.size()==0) {	                		
                		JOptionPane.showMessageDialog(vista, "No existe ningun empleado con esos parametros ", botonPulsado, 1);
                	}else {
						vista.mostrarUsuarios.lblBCod.setText(Integer.toString(lista.get(0).getId()));
						vista.mostrarUsuarios.lblBNombre.setText(lista.get(0).getNombre());
						vista.mostrarUsuarios.lblBApellid.setText(lista.get(0).getApellido());
						vista.mostrarUsuarios.lblBDepat.setText(Integer.toString(lista.get(0).getCod_dept()));
						vista.mostrarUsuarios.lblBCargo.setText(lista.get(0).getPuesto());
						vista.mostrarUsuarios.lblBJefe.setText(Integer.toString(lista.get(0).getBoss()));
						vista.mostrarUsuarios.btnAnterior.setEnabled(false);
						vista.mostrarUsuarios.btnIrAlPrimero.setEnabled(false);
						vista.cardLayout.show(vista.contentPane, "7");
                	}
				break;
				case "ATRAS":
					vista.cardLayout.show(vista.contentPane, "3");
					vista.consultarUsuario.textCodEmple.setText("");
					vista.consultarUsuario.textNombre.setText("");
					vista.consultarUsuario.rdbtnCodEmple.setSelected(false);
					vista.consultarUsuario.rdbtnNombre.setSelected(false);
				break;
				}
			
			}
		}
	}
}


