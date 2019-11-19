package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import modelo.Departamento;
import vista.JframePrincipal;

public class controladorMostrarDepartamentos {
	public JframePrincipal vista;
	public PrincipalControlador controlador;
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
		vista.mostrarDepartamentos.btnIrAlPrimero.addActionListener(new BotonListener());
		vista.mostrarDepartamentos.btnIrAlltimo.addActionListener(new BotonListener());
		vista.mostrarDepartamentos.btnSalir.addActionListener(new BotonListener());
		vista.mostrarDepartamentos.btnAtras.addActionListener(new BotonListener());
	}
	
	public class BotonListener implements ActionListener {

		@Override	
		public void actionPerformed(ActionEvent e) {
			
			Object sourceObject = e.getSource();
			ArrayList<Departamento> Departamento1 = new ArrayList<Departamento>();
			Departamento1=controladorVerDepartamentos.caña();

			
			
			if (sourceObject instanceof JButton) {
				
				String botonPulsado = ((JButton) sourceObject).getActionCommand();
				switch(botonPulsado) {
					case "SIGUIENTE":
						if(i<(Departamento1.size()-1) ) {
							i++;	
							vista.mostrarDepartamentos.lblBCod.setText(Integer.toString(Departamento1.get(i).getCod_dept()));
							vista.mostrarDepartamentos.lblBNombre.setText(Departamento1.get(i).getDnombre());
							vista.mostrarDepartamentos.lblBLugar.setText(Departamento1.get(i).getLugar());
							
							if(i==(Departamento1.size()-1)) {
								vista.mostrarDepartamentos.btnSiguiente.setEnabled(false);	
								vista.mostrarDepartamentos.btnIrAlPrimero.setEnabled(true);
								vista.mostrarDepartamentos.btnIrAlltimo.setEnabled(false);
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
								vista.mostrarDepartamentos.btnIrAlPrimero.setEnabled(false);
								vista.mostrarDepartamentos.btnIrAlltimo.setEnabled(true);
							}
							vista.mostrarDepartamentos.lblBCod.setText(Integer.toString(Departamento1.get(i).getCod_dept()));
							vista.mostrarDepartamentos.lblBNombre.setText(Departamento1.get(i).getDnombre());
							vista.mostrarDepartamentos.lblBLugar.setText(Departamento1.get(i).getLugar());
							vista.mostrarDepartamentos.btnSiguiente.setEnabled(true);						
						}else {
							vista.mostrarDepartamentos.btnAnterior.setEnabled(false);
						}
					break;
					case "Ir al primer Departamento":
						i=0;
						vista.mostrarDepartamentos.lblBCod.setText(Integer.toString(Departamento1.get(i).getCod_dept()));
						vista.mostrarDepartamentos.lblBNombre.setText(Departamento1.get(i).getDnombre());
						vista.mostrarDepartamentos.lblBLugar.setText(Departamento1.get(i).getLugar());
						vista.mostrarDepartamentos.btnAnterior.setEnabled(false);
						vista.mostrarDepartamentos.btnSiguiente.setEnabled(true);
						vista.mostrarDepartamentos.btnIrAlPrimero.setEnabled(false);
						vista.mostrarDepartamentos.btnIrAlltimo.setEnabled(true);
					break;
					case "Ir al ultimo Departamento":
						i=Departamento1.size()-1;
						vista.mostrarDepartamentos.lblBCod.setText(Integer.toString(Departamento1.get(i).getCod_dept()));
						vista.mostrarDepartamentos.lblBNombre.setText(Departamento1.get(i).getDnombre());
						vista.mostrarDepartamentos.lblBLugar.setText(Departamento1.get(i).getLugar());
						vista.mostrarDepartamentos.btnSiguiente.setEnabled(false);
						vista.mostrarDepartamentos.btnAnterior.setEnabled(true);
						vista.mostrarDepartamentos.btnIrAlPrimero.setEnabled(true);
						vista.mostrarDepartamentos.btnIrAlltimo.setEnabled(false);
					break;
					case "ATRAS":
						vista.verDepartamentos.rdbtnCodDepart.setSelected(false);
						vista.verDepartamentos.rdbtnNombre.setSelected(false);
						
						vista.verDepartamentos.textCodDepart.setText(null);
						vista.verDepartamentos.textNombre.setText(null);
						
						
						vista.mostrarDepartamentos.lblBCod.setText(" ");
						vista.mostrarDepartamentos.lblBNombre.setText(" ");
						vista.mostrarDepartamentos.lblBLugar.setText(" ");
						Departamento1.clear();
						
						vista.cardLayout.show(vista.contentPane, "9");
					break;
					case "SALIR":
						vista.verDepartamentos.rdbtnCodDepart.setSelected(false);
						vista.verDepartamentos.rdbtnNombre.setSelected(false);
						vista.verDepartamentos.textCodDepart.setText(" ");
						vista.verDepartamentos.textNombre.setText(" ");
						vista.cardLayout.show(vista.contentPane, "2");
						Departamento1.clear();
						break;
				}
				
			}
		}
	}
}
