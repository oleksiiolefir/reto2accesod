package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class lectorTXT {
	public static ArrayList<Empleado> lecturaTXT() throws IOException {
		String s1;
        String s2;
        String[] datos = new String[8];
        int cont=0;
        
        // Cargamos el buffer con el contenido del archivo

        BufferedReader br = new BufferedReader (new FileReader ("ficheros"+ File.separator+"datos.txt"));

 
        // s1 será la primera línea
        s1 = br.readLine(); 
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        boolean macarrones=true;
        while(macarrones) {
	        try {
	        	 int numTokens = 0;
	             s1=br.readLine();
	             StringTokenizer st = new StringTokenizer (s1+1);
	             Empleado emple = new Empleado();
	             
	             while (st.hasMoreTokens())
	             {
	            	 
	                 s2 = st.nextToken(";");
	                 numTokens++;
	                 switch (numTokens) {
	                 case 1:
	                	 emple.setId(Integer.parseInt(s2));
	                   break;
	                 case 2:
	                   emple.setNombre(s2);
	                   break;
	                 case 3:
	                   emple.setApellido(s2);
	                   break;
	                 case 4:
	                   emple.setSueldo(Integer.parseInt(s2));
	                   break;
	                 case 5:
	                   emple.setBoss(Integer.parseInt(s2));
	                   break;
	                 case 6:
	                   emple.setCod_dept(Integer.parseInt(s2));
	                   break;
	                 case 7:
	                   if(s2=="TRUE") {
	                	   emple.setJefe(true);
	                   }
	                   else {
	                	   emple.setJefe(false);
	                   }                	 
	                   break;
	                 case 8:
		               emple.setPuesto(s2);
		               break;
	                 case 9:
	                	 empleados.add(cont,emple);
	                	 cont++;
		             break;
	                 }               
	             }
	        } catch (Exception ex) {
	        	macarrones=false;	            
	        }
        }
        return empleados;
	
	}
}
