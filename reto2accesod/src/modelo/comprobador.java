package modelo;

import javax.swing.JOptionPane;
import vista.CrearUsuario;


public class comprobador {
	
	public void datosCorrectosCodEmple(CrearUsuario panelCrearUsuario) {
		try {
			int codigoEmpleado=Integer.parseInt(panelCrearUsuario.textCodEmple.getText());
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Solo se admiten valores numéricos","Error",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void datosCorrectosSueldo(CrearUsuario panelCrearUsuario) {
		try {
			int sueldo=Integer.parseInt(panelCrearUsuario.textSueldo.getText());
			if(sueldo<900) {
				JOptionPane.showMessageDialog(null,"Debe ser su sueldo real","Error",JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				sueldo=(Integer) null;
			}
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Solo se admiten valores numéricos positivo","Error",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void datosCorrectosDepart(CrearUsuario panelCrearUsuario) {
		try {
			int departamento=Integer.parseInt(panelCrearUsuario.textDept.getText());
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Solo se admiten valores numéricos","Error",JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
