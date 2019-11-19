package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import modelo.Conexion;
import modelo.Consultas;
import modelo.Departamento;
import modelo.PrincipalModelo;
import vista.Departamentos;
import vista.JframePrincipal;

public class controladorVerDepartamentos {
	
	private JframePrincipal vista;
	private PrincipalControlador controlador;
	private PrincipalModelo modelo;
	public static ArrayList<Departamento> Departamento=new ArrayList<Departamento>();
	
	public controladorVerDepartamentos(JframePrincipal vista, PrincipalControlador controlador,PrincipalModelo modelo) {
		this.vista = vista;
		this.controlador = controlador;
		this.modelo = modelo;

		initListeners();
	}
	
	/**
	 * Se crean los listeners del panel
	 */
	public void initListeners() {
		vista.verDepartamentos.btnAtras.addActionListener(new BotonListener());
		vista.verDepartamentos.btnBuscar.addActionListener(new BotonListener());
		
	}	
	public static ArrayList<Departamento> ArraylistDepartamentosLista() {
		 ArrayList<Departamento> Departamento1=new ArrayList<Departamento>();
		 Departamento1=Departamento;
		return Departamento1;
		
		
	}	

	public class BotonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Object sourceObject = e.getSource();
			

			if (sourceObject instanceof JButton) {
				
				String botonPulsado = ((JButton) sourceObject).getActionCommand();

				switch(botonPulsado) {
				case "BUSCAR DEPARTAMENTO":
					vista.cardLayout.show(vista.contentPane, "10");
					if(vista.verDepartamentos.rdbtnCodDepart.isSelected()) {
						Departamento=modelo.consultas.compararDepart(vista.verDepartamentos.textCodDepart.getText());
	    				for(int n=0; n<Departamento.size() ; n++) {	    						
	    					vista.verDepartamentos.rdbtnNombre.setSelected(false);
	    				}
					}
	    			else if(vista.verDepartamentos.rdbtnNombre.isSelected()) {
	    				Departamento=modelo.consultas.compararDepartNombre(vista.verDepartamentos.textNombre.getText());
	    				for(int n=0; n<Departamento.size() ; n++) {
	    					if(Departamento.get(n).getDnombre()==vista.verDepartamentos.textNombre.getText()) {

	    						vista.verDepartamentos.rdbtnCodDepart.setSelected(false);
	    					}
	    				}	
	    			}else {
	    				Departamento=modelo.consultas.compararDepartTodo();
	    			}
					vista.mostrarDepartamentos.lblBCod.setText(Integer.toString(Departamento.get(0).getCod_dept()));
					vista.mostrarDepartamentos.lblBNombre.setText(Departamento.get(0).getDnombre());
					vista.mostrarDepartamentos.lblBLugar.setText(Departamento.get(0).getLugar());
					
					vista.mostrarDepartamentos.btnAnterior.setEnabled(false);
					vista.cardLayout.show(vista.contentPane, "10");
				
				break;
				case "ATRAS":
				
					vista.cardLayout.show(vista.contentPane, "8");
				break;
				}
			
			}
		}
	}
}
