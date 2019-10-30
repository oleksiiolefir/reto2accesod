package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import modelo.Conexion;



import java.sql.*;

import java.sql.PreparedStatement;

public class lecturaCSV {
	public static Connection Conexión;

	
	public static final String SEPARATOR=";";
	public static final String QUOTE="\"";
	public static void funcionesDeLectorCsv(String archivo)  throws IOException, ClassNotFoundException, SQLException 
	{
		
		String csvFile ="ficheros"+ File.separator+"ArchivoCSV.csv";
		BufferedReader br = null;
		String line = "";
		//Se define separador ","
		String cvsSplitBy = ";";{
		ArrayList<Departamento>deptlist = new ArrayList<>();
		Departamento dept = new Departamento();
		try {
		    br = new BufferedReader(new FileReader(csvFile));
		    while ((line = br.readLine()) != null) {          
		    	int i = 0;
		        String[] datos = line.split(cvsSplitBy);
		        
		     
		        //Imprime datos.
		        
		     
		        
		        System.out.println(datos[0] + ", " + datos[1] + ", " + datos[2] );
		       /* int Nombre = Integer.parseInt(datos[0]);
		          String Marca = datos[1];
		          String k = datos[2];
		         */
		        dept.setCod_dept(Integer.parseInt(datos[0]));
		        dept.setLugar(datos[1]);
		        dept.setDnombre(datos[2]);
		       deptlist.add(dept);
		       
		 
			    String query = "INSERT INTO departamento (COD_DEPT,	LUGAR,	DNOMBRE) values ('"+deptlist.get(i).getCod_dept()+"','"+deptlist.get(i).getLugar()+"','"+deptlist.get(i).getDnombre()+"')";
			    try {
			    	
			    	
			    	Conexion c =  new Conexion();
				  	Connection cin = c.conectar();
				 // dbConnection = getDBConnection();
				  	
				  	 PreparedStatement preparedStatement = null;

		          
		            preparedStatement = cin.prepareStatement(query);

		           
		            // execute insert SQL stetement
		            preparedStatement.executeUpdate();

		            System.out.println("Record is inserted into DBUSER table!");
			    
		           

		        } catch (SQLException e) {

		            System.out.println(e.getMessage());

		        } finally {
		        	if (br != null) {
		    	}
		        }
			    i++;
			}
		    
		    }finally { }}
		
		} 
	}
	 
