package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import vista.JframePrincipal;
import modelo.Conexion;
import modelo.Consultas;
import modelo.Empleado;

public class controladorCrearUsuario implements ActionListener{
	private JframePrincipal vista;
	private controladorJframe controlador;
	
	public controladorCrearUsuario(JframePrincipal vista, controladorJframe controlador) {
		this.vista = vista;
		this.controlador = controlador;
	}
	
	/**
	 * Se crean los listeners del panel
	 */
	public void addListeners() {
		vista.crearUsuario.btnAgregar.addActionListener(this);
		vista.crearUsuario.btnPrueba.addActionListener(this);				
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
			case "GUARDAR":
				lista=consult.comparar("id");
				for(int i=0; i<lista.length ; i++) {
					if(lista[i]==vista.crearUsuario.textCodEmple.getText()) {
						contador++;
					}
				}
				if(contador==0) {
					if(modelo.comprobador.datosCorrectosCodEmple(vista.crearUsuario)==true &&
							modelo.comprobador.datosCorrectosSueldo(vista.crearUsuario)==true &&
							modelo.comprobador.datosCorrectosDepart(vista.crearUsuario)==true) {
						try {
							consult.insertarEmpleados(empleados);
						} catch (SQLException e1) {
							JOptionPane.showMessageDialog(null,"Error al guardar el empleado","Error",JOptionPane.INFORMATION_MESSAGE);
							e1.printStackTrace();
						}
						vista.menu.setVisible(true);
						vista.bienvenida.setVisible(false);
					}					
				}else {
					JOptionPane.showMessageDialog(null,"Ya existe un usuario con ese ID","Error",JOptionPane.INFORMATION_MESSAGE);
				}				
				
				break;
			case "prueba":
				
				break;
			}
		}
	}
	
	
}
