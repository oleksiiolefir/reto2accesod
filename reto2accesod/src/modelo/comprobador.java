package modelo;

import javax.swing.JOptionPane;
import vista.CrearUsuario;


public class comprobador {
	
	public static Boolean datosCorrectosCodEmple(CrearUsuario panelCrearUsuario) {
		Boolean seguir=true;
		try {
			int codigoEmpleado=Integer.parseInt(panelCrearUsuario.textCodEmple.getText());
			seguir=true;
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Solo se admiten valores numéricos","Error",JOptionPane.INFORMATION_MESSAGE);
			seguir=false;
		}
		return seguir;
	}
	
	public static Boolean datosCorrectosSueldo(CrearUsuario panelCrearUsuario) {
		Boolean seguir=true;
		try {
			int sueldo=Integer.parseInt(panelCrearUsuario.textSueldo.getText());
			if(sueldo<900) {
				JOptionPane.showMessageDialog(null,"Debe ser su sueldo real","Error",JOptionPane.INFORMATION_MESSAGE);
				seguir=false;
			}
			else {
				seguir=true;
			}
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Solo se admiten valores numéricos positivo","Error",JOptionPane.INFORMATION_MESSAGE);
			seguir=false;
		}
		return seguir;
	}
	
	public static Boolean datosCorrectosDepart(CrearUsuario panelCrearUsuario) {
		Boolean seguir=true;
		try {
			int departamento=Integer.parseInt(panelCrearUsuario.textDept.getText());
			seguir=true;
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Solo se admiten valores numéricos","Error",JOptionPane.INFORMATION_MESSAGE);
			seguir=false;
		}
		return seguir;
	}

}
