package modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
		String csvFile = "\\ArchivoCSV.csv";
		BufferedReader br = null;
		String line = "";
		//Se define separador ","
		String cvsSplitBy = ";";{
		
		try {
		    br = new BufferedReader(new FileReader(csvFile));
		    while ((line = br.readLine()) != null) {                
		        String[] datos = line.split(cvsSplitBy);
		        
		     
		        //Imprime datos.
		        
		     
		        
		        System.out.println(datos[0] + ", " + datos[1] + ", " + datos[2] );
		        int Nombre = Integer.parseInt(datos[0]);
		          String Marca = datos[1];
		          String k = datos[2];
		         
		       
		          
		     
		 
		 
			    String query = "INSERT INTO departamento (COD_DEPT,	LUGAR,	DNOMBRE) values ('"+Nombre+"','"+Marca+"','"+k+"')";
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
		}}
		    }finally { }}
		
		} 
	}
	 
