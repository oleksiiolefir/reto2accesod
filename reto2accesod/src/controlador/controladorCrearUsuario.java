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
<<<<<<< HEAD
	public controladorCrearUsuario(JframePrincipal vista, PrincipalControlador controlador,	 PrincipalModelo modelo)
 {
=======
	
	public controladorCrearUsuario(JframePrincipal vista, PrincipalControlador controlador, PrincipalModelo modelo) {
>>>>>>> 57067dbb3c2c87e684a43749f920f9a969fafa0e
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
							System.out.println("NO DEBERIA METERSE");
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
							
							try {
								System.out.println("SE METE EN EL TRY");
								consult.insertarEmpleados(empleados);
							} catch (SQLException e1) {
								JOptionPane.showMessageDialog(null,"Error al guardar el empleado","Error",JOptionPane.INFORMATION_MESSAGE);
								e1.printStackTrace();
<<<<<<< HEAD
=======
								modelo.escrituraLog.crearLog(new Date(), e1.toString(), new Object() {} .getClass().getEnclosingMethod().getName(), new Object() {} .getClass().getName());
>>>>>>> 57067dbb3c2c87e684a43749f920f9a969fafa0e
							}
						}					
					}else {
						JOptionPane.showMessageDialog(null,"Ya existe un usuario con ese ID","Error",JOptionPane.INFORMATION_MESSAGE);
					}				
					
					break;
				case "prueba":
					vista.cardLayout.show(vista.contentPane, "2");
					break;
				}
			}
		}
	
	}
}
