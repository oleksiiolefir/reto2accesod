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
	ArrayList<Empleado>lista=new ArrayList<Empleado>();
	
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

			if (sourceObject instanceof JButton) {
				
				String botonPulsado = ((JButton) sourceObject).getActionCommand();

				switch(botonPulsado) {
				case "BUSCAR EMPLEADO":
					vista.cardLayout.show(vista.contentPane, "7");
					if(vista.consultarUsuario.rdbtnCodEmple.isSelected()) {
						System.out.println("sOY UN ID QUE EXISTE");
	                	lista=consult.comparar(vista.consultarUsuario.textCodEmple.getText());
	    				for(int n=0; n<lista.size() ; n++) {	    						
	    					vista.consultarUsuario.rdbtnNombre.setSelected(false);
	    				}
					}
	    			else if(vista.consultarUsuario.rdbtnNombre.isSelected()) {
	    				lista=consult.compararNombre(vista.consultarUsuario.textNombre.getText());
	    				for(int n=0; n<lista.size() ; n++) {
	    					if(lista.get(n).getNombre()==vista.consultarUsuario.textNombre.getText()) {

	    						vista.consultarUsuario.rdbtnCodEmple.setSelected(false);
	    					}
	    				}	
	    			}else {
	    				lista=consult.compararTodo();
	    			}
					vista.mostrarUsuarios.lblBCod.setText(Integer.toString(lista.get(0).getId()));
					vista.mostrarUsuarios.lblBNombre.setText(lista.get(0).getNombre());
					vista.mostrarUsuarios.lblBApellid.setText(lista.get(0).getApellido());
					vista.mostrarUsuarios.lblBDepat.setText(Integer.toString(lista.get(0).getCod_dept()));
					vista.mostrarUsuarios.lblBCargo.setText(lista.get(0).getPuesto());
					vista.mostrarUsuarios.lblBJefe.setText(Integer.toString(lista.get(0).getBoss()));
					vista.mostrarUsuarios.btnAnterior.setEnabled(false);
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


