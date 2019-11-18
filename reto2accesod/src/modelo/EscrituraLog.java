package modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EscrituraLog {

	public static void crearLog(Date fecha, String motivo, String metodo, String clase) {
		String ruta = "ficheros" + File.separator + "log.txt"; //Guarda la ruta del fichero
		FileWriter fichero = null;
		PrintWriter escritor = null;
		try {
			File log = new File(ruta); //Busca si existe el fichero en la ruta especificada
			if(!log.exists())
				JOptionPane.showMessageDialog(new JFrame(), "Fichero log.txt no encontrado.", null, 0);
			fichero = new FileWriter(ruta, true); 
			escritor = new PrintWriter(fichero);
			
			//Se escribe en el archivo
			escritor.println("Fecha: " + fecha + " *** La clase es : " + clase + " *** El metodo es : " + metodo + " *** el motivo por el cual ocurre el  error: " + motivo);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				fichero.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
