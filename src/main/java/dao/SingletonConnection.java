package dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
	
	private static Connection connection;
	
	static {
		String url="jdbc:mysql://localhost:3306/agence1";
		String user="root";
		String password="";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(url,user,password);
			System.out.println("connexion �tablie !!!");
		} 
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return connection;
	}

}
