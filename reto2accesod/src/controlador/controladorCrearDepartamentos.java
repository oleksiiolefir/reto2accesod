package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.text.View;

import modelo.Conexion;
import modelo.Consultas;
import modelo.Departamento;
import modelo.Empleado;
import modelo.PrincipalModelo;
import vista.JframePrincipal;

public class controladorCrearDepartamentos    {
	public JframePrincipal vista;
	public PrincipalControlador controlador;
	private PrincipalModelo modelo;

	public controladorCrearDepartamentos(JframePrincipal vista, PrincipalControlador controlador,PrincipalModelo modelo) {
		this.vista = vista;
		this.controlador = controlador;		
		this.modelo = modelo;

		initListeners();
	}	
	
	 /**
	 * Acción de los distintos listeners
	 */
	
	public void initListeners() {
		vista.crearDepartamentos.btnPrueba.addActionListener(new BotonListener());				
		vista.crearDepartamentos.btnCrear.addActionListener(new BotonListener());				
	}
	
	private class BotonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Object sourceObject = e.getSource();
			Conexion c = new Conexion(modelo);
			Consultas consult = new Consultas(c);
			Object [] lista=new Object[3];
			int contador=0;
			ArrayList<Departamento> Departamento = new ArrayList<Departamento>();
			Departamento depart = new Departamento();
			
			if (sourceObject instanceof JButton) {
				
				String botonPulsado =((JButton) sourceObject).getActionCommand();
				switch (botonPulsado) {
				case "Crear":
					
					lista=consult.comparar1("'ID'");
					for(int i=0; i<lista.length ; i++) {
						if(lista[i]==vista.crearDepartamentos.textField.getText()) {
							contador++;
						}
					}
					if(contador==0) {
							depart.setCod_dept(Integer.parseInt(vista.crearDepartamentos.textField.getText()));
							depart.setLugar(vista.crearDepartamentos.textField_1.getText());
							depart.setDnombre(vista.crearDepartamentos.textField_2.getText());
							

							Departamento.add(0, depart);
							
							
							try {
								consult.insertarDepartamentos(Departamento);
							} catch (SQLException e1) {
								JOptionPane.showMessageDialog(null,"Error al guardar el Departamento","Error",JOptionPane.INFORMATION_MESSAGE);
								e1.printStackTrace();
							}
											
					}				
					
					break;
					
				case "atras":
					vista.cardLayout.show(vista.contentPane, "8");
					break;
					
					
				}
				
			}}
		}




	
}
	
