package modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class GenerarTXT {
	
	public static void GenerarTXT(ArrayList <Empleado> lista,ArrayList <Departamento> Departamento) {
		 try {
	            String ruta = ("ficheros"+ File.separator+"datosBBDD1.txt");	            
	            File file = new File(ruta);
	            // Si el archivo no existe es creado
	            if (!file.exists()) {
	                file.createNewFile();
	            }
	            FileWriter fw = new FileWriter(file);
	            BufferedWriter bw = new BufferedWriter(fw);
	            bw.write("EMPLEADOS:");
	            bw.newLine();
	            bw.newLine();
	            for(int i=0; i<lista.size(); i++) {
	            	bw.write("***************** Empleado " + (i+1)  + " *****************");
	            	bw.newLine();
	            	bw.write("ID = " + lista.get(i).getId());
		            bw.newLine();
		            bw.write("NOMBRE = " + lista.get(i).getNombre());
		            bw.newLine();
		            bw.write("APELLIDO = " + lista.get(i).getApellido());
		            bw.newLine();
		            bw.write("SUELDO = " + lista.get(i).getSueldo());
		            bw.newLine();
		            bw.write("BOSS = " + lista.get(i).getBoss());
		            bw.newLine();
		            bw.write("CODIGO DEPARTAMENTO = " + lista.get(i).getCod_dept());
		            bw.newLine();
		            bw.write("JEFE = " + lista.get(i).getJefe());
		            bw.newLine();
		            bw.write("PUESTO = " + lista.get(i).getPuesto());
		            bw.newLine();
		            bw.newLine();
	            }
	            
	            bw.write("-----------------------------------------------------------------");
	            bw.newLine();
	            bw.newLine();
	            bw.write("DEPARTAMENTOS:");
	            bw.newLine();
	            bw.newLine();
	            for(int i=0; i<Departamento.size(); i++) {
	            	bw.write("***************** Departamento " + (i+1) + " *****************");
	            	bw.newLine();
	            	bw.write("CODIGO DEPARTAMENTO = " + Departamento.get(i).getCod_dept());
	            	bw.newLine();
	            	bw.write("LUGAR = " + Departamento.get(i).getLugar());
	            	bw.newLine();
	            	bw.write("NOMBRE DEPARTAMENTO " + Departamento.get(i).getDnombre());
	            	bw.newLine();
	            }
	            bw.close();
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	   }

}
