package br.com.opet.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexoes {
	private static String url = "jdbc:mysql://localhost:3306/veiculoDB";
	private static String usuario = "root";
	private static String senha = "admin";
	private static Connection c = null; 
	
	public static Connection pegaConexao(boolean autoCommit) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		c = DriverManager.getConnection(url, usuario, senha);
		c.setAutoCommit(autoCommit);
		return c;
	}
}
