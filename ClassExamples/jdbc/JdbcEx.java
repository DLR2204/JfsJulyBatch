package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		(1)Loading the driver class 
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
//		(2)Create the connection
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","july","july");
		
//		(3)Create the statement
		
		Statement stmt = conn.createStatement();
		
//		(4)Excute the statement  DDL -execute(),
		
		stmt.execute("create table product(proId number(10),proName varchar2(10),proPrice number(10))");
		
//		(5)Close the connections
		
		conn.close();
		
		System.out.println("Table is created!!!!!");
	}
}
