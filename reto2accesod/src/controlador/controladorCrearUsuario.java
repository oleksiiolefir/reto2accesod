package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import vista.JframePrincipal;
import modelo.Conexion;
import modelo.Consultas;
import modelo.Empleado;
import modelo.PrincipalModelo;

public class controladorCrearUsuario{
	private JframePrincipal vista;
	private PrincipalControlador controlador;
	private PrincipalModelo modelo;
	
	public controladorCrearUsuario(JframePrincipal vista, PrincipalControlador controlador, PrincipalModelo modelo) {
		this.vista = vista;
		this.controlador = controlador;
		this.modelo = modelo;
		initListeners();
	}
	
	/**
	 * Se crean los listeners del panel
	 */
	public void initListeners() {
		vista.crearUsuario.btnAgregar.addActionListener(new BotonListener());
		vista.crearUsuario.btnPrueba.addActionListener(new BotonListener());				
	}	

	private class BotonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Object sourceObject = e.getSource();
			Conexion c = new Conexion(modelo);
			Consultas consult = new Consultas(c);
			ArrayList<Empleado>lista=new ArrayList<Empleado>();
			int contador=0;
			ArrayList<Empleado> empleados = new ArrayList<Empleado>();
			Empleado emple = new Empleado();
			
			if (sourceObject instanceof JButton) {
				
				String botonPulsado = ((JButton) sourceObject).getActionCommand();
				
				switch(botonPulsado) {
				case "GUARDAR":
					lista=consult.comparar("2");
					for(int i=0; i<lista.size() ; i++) {
						if(Integer.toString(lista.get(i).getId())==vista.crearUsuario.textCodEmple.getText()) {
							contador++;
						}
					}
					if(contador==0) {
						if(modelo.comprobador.datosCorrectosCodEmple(vista.crearUsuario)==true &&
								modelo.comprobador.datosCorrectosSueldo(vista.crearUsuario)==true &&
								modelo.comprobador.datosCorrectosDepart(vista.crearUsuario)==true) {
							emple.setId(Integer.parseInt(vista.crearUsuario.textCodEmple.getText()));
							emple.setNombre(vista.crearUsuario.textNombre.getText());
							emple.setApellido(vista.crearUsuario.textApellido.getText());
							emple.setSueldo(Integer.parseInt(vista.crearUsuario.textSueldo.getText()));
							emple.setCod_dept(Integer.parseInt(vista.crearUsuario.textDept.getText()));
							emple.setPuesto(vista.crearUsuario.textCargo.getText());
							if(vista.crearUsuario.comboBoxCargo.getSelectedIndex()==1) {
								emple.setJefe(true);
							}else {
								emple.setJefe(false);
							}
							emple.setBoss(Integer.parseInt(vista.crearUsuario.textJefe.getText()));
							
							empleados.add(0, emple);
							JOptionPane.showMessageDialog(vista, "Se ha creado el usuario ", botonPulsado, 1);
							try {
								consult.insertarEmpleados(empleados);
							} catch (SQLException e1) {
								JOptionPane.showMessageDialog(null,"Error al guardar el empleado","Error",JOptionPane.INFORMATION_MESSAGE);
								e1.printStackTrace();
								modelo.escrituraLog.crearLog(e1.toString(), new Object() {} .getClass().getEnclosingMethod().getName(), new Object() {} .getClass().getName());
							}
						}					
					}else {
						JOptionPane.showMessageDialog(null,"Ya existe un usuario con ese ID","Error",JOptionPane.INFORMATION_MESSAGE);
					}				
					
					
					vista.crearUsuario.textCodEmple.setText(null);
					vista.crearUsuario.textNombre.setText(null);
					vista.crearUsuario.textApellido.setText(null);
					vista.crearUsuario.textSueldo.setText(null);
					vista.crearUsuario.textDept.setText(null);
					vista.crearUsuario.textCargo.setText(null);
					vista.crearUsuario.textJefe.setText(null);
					break;
				case "ATRAS":
					vista.cardLayout.show(vista.contentPane, "2");
					
					vista.crearUsuario.textCodEmple.setText(null);
					vista.crearUsuario.textNombre.setText(null);
					vista.crearUsuario.textApellido.setText(null);
					vista.crearUsuario.textSueldo.setText(null);
					vista.crearUsuario.textDept.setText(null);
					vista.crearUsuario.textCargo.setText(null);
					break;
				}
			}
		}
	
	}
}
