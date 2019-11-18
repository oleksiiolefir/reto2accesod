package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import modelo.Departamento;
import vista.JframePrincipal;

public class controladorMostrarDepartamentos {
	private JframePrincipal vista;
	private PrincipalControlador controlador;
	int i=0;
	
	public controladorMostrarDepartamentos(JframePrincipal vista, PrincipalControlador controlador) {
		this.vista = vista;
		this.controlador = controlador;
		initListeners();
	}
	
	/**
	 * Se crean los listeners del panel
	 */
	public void initListeners() {
		vista.mostrarDepartamentos.btnAnterior.addActionListener(new BotonListener());
		vista.mostrarDepartamentos.btnSiguiente.addActionListener(new BotonListener());
	}
	
	private class BotonListener implements ActionListener {

		@Override	
		public void actionPerformed(ActionEvent e) {
			
			Object sourceObject = e.getSource();
			ArrayList<Departamento> Departamentos = new ArrayList<Departamento>();
			System.out.println((Departamentos.get(0).getLugar()));
			System.out.println("hola");
				Departamentos = controlador.controladorVerDepartamentos.lista;

			if (sourceObject instanceof JButton) {
			
				String botonPulsado = ((JButton) sourceObject).getActionCommand();
				switch(botonPulsado) {
					case "SIGUIENTE":
					
						if(i<(Departamentos.size()-1) ) {
							System.out.println(i);
							i++;	
							vista.mostrarDepartamentos.lblBCod.setText(Integer.toString(Departamentos.get(i).getCod_dept()));
							vista.mostrarDepartamentos.lblBNombre.setText(Departamentos.get(i).getDnombre());
							vista.mostrarDepartamentos.lblBLugar.setText(Departamentos.get(i).getLugar());
							
							if(i==(Departamentos.size()-1)) {
								vista.mostrarDepartamentos.btnSiguiente.setEnabled(false);	
							}
						}else {
							vista.mostrarDepartamentos.btnSiguiente.setEnabled(false);							
						}
						
					break;	
					case "ANTERIOR":
						if(i!=0) {
							i--;
							if(i==0) {
								vista.mostrarDepartamentos.btnAnterior.setEnabled(false);
							}
							vista.mostrarDepartamentos.lblBCod.setText(Integer.toString(Departamentos.get(i).getCod_dept()));
							vista.mostrarDepartamentos.lblBNombre.setText(Departamentos.get(i).getDnombre());
							vista.mostrarDepartamentos.lblBLugar.setText(Departamentos.get(i).getLugar());
						
							vista.mostrarDepartamentos.btnSiguiente.setEnabled(true);						
						}else {
							vista.mostrarDepartamentos.btnAnterior.setEnabled(false);
						}
					break;	
				}
				
			}
		}
	}
}
