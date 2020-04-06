package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException {
		
		Class.forName("oracle.jdbc.OracleDriver");
		
	ConnectionManager cm = new ConnectionManager();
	
	cm.getconnection();
		
	}
}
