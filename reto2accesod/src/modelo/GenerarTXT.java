package modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class GenerarTXT {
	
	public static void GenerarTXT(ArrayList <Empleado> lista) {
		 try {
	            String ruta = "datosBBDD1.txt";	            
	            File file = new File(ruta);
	            // Si el archivo no existe es creado
	            if (!file.exists()) {
	                file.createNewFile();
	            }
	            FileWriter fw = new FileWriter(file);
	            BufferedWriter bw = new BufferedWriter(fw);
	            bw.write("EMPLEADOS");
	            bw.newLine();
	            for(int i=0; i<lista.size(); i++) {
	            	bw.write(lista.get(i).getId() + ";" + lista.get(i).getNombre() + ";" + lista.get(i).getApellido() + ";"
	            		+ lista.get(i).getSueldo() + ";" + lista.get(i).getBoss() + ";" + lista.get(i).getCod_dept() + ";"
	            		+ lista.get(i).getJefe() + ";" + lista.get(i).getPuesto());
	            	bw.newLine();
	            }
	            bw.write("-----------------------------------------------------------------------");
	            bw.newLine();
	            bw.write("DEPARTAMENTOS");
	            bw.close();
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	   }

}
