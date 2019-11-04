package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import modelo.Conexion;
import modelo.Departamento;


import java.sql.*;

import java.sql.PreparedStatement;

public class lecturaCSV {
	public static Connection Conexión;

	
	public static final String SEPARATOR=";";
	public static final String QUOTE="\"";
	public static ArrayList<Departamento> funcionesDeLectorCsv(String archivo)  throws IOException, ClassNotFoundException, SQLException 
	{
	
		int i = 0;
		String csvFile ="ficheros"+ File.separator+"ArchivoCSV.csv";
		BufferedReader br = null;
		String line = "";
		//Se define separador ","
		
		ArrayList<Departamento>deptlist = new ArrayList<>();
		
		String cvsSplitBy = ";";
		
		
		    br = new BufferedReader(new FileReader(csvFile));
		    while ((line = br.readLine()) != null) {          
		    	Departamento dept = new Departamento();
		        String[] datos = line.split(cvsSplitBy);
		       
		        System.out.println(datos[0] + ", " + datos[1] + ", " + datos[2] );
		    
		        dept.setCod_dept(Integer.parseInt(datos[0]));
		        dept.setLugar(datos[1]);
		        dept.setDnombre(datos[2]);
		       
		       deptlist.add(i,dept);
		    
		       System.out.println("la i es " +i);
		       System.out.println("aaa :"+deptlist.get(i).getCod_dept()+deptlist.get(i).getDnombre()+deptlist.get(i).getLugar());
		       i++;
		      
		       
		     
		    }
		
		return deptlist;
	} 
}
	 
