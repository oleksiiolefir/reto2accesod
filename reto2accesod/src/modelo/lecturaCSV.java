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
	public static Connection Conexion;

	
	public static final String SEPARATOR=";";
	public static final String QUOTE="\"";
	public static ArrayList<Departamento> funcionesDeLectorCsv()  throws IOException, ClassNotFoundException, SQLException 
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
		        dept.setCod_dept(Integer.parseInt(datos[0]));
		        dept.setLugar(datos[1]);
		        dept.setDnombre(datos[2]);
		        deptlist.add(i,dept);      
		        i++;        
		    }
		
		return deptlist;
	} 
}
	 
