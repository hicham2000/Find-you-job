
package Scrapping;

import java.sql.*;


public class conexion_base {
	public Connection Connection(){
	       try
	 {

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver O.K");
			String url="jdbc:mysql://localhost:3306/test";//PORT DE MYSQL
			String user="root";
			String passwd="";
			Connection con = DriverManager.getConnection(url,user,passwd);
			System.out.println("Connection effective !");
	         return con;
	}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}

