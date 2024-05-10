package MYSQLData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * create a connection
 * create stmt/query
 * execute stmt/query
 * close connection
 */
public class MYSQLDMLCOMMANDS {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
Statement stmt =con.createStatement();
String s="INSERT INTO student  VALUES(1309,'Chandrasekaran',995272789)";
stmt.execute(s);
con.close();
System.out.println("Query executed....");
	}

}
