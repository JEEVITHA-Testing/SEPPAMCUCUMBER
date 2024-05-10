package MYSQLData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class MYSQLCONTROLCOMMAND {
public static void main(String[] args) throws SQLException
{

/*
 * create a connection
 * create stmt/query
 * execute stmt/query
 * store data in resultset
 * close connection
 */

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
Statement stmt =con.createStatement();
//String s="INSERT INTO student  VALUES(1309,'Chandrasekaran',995272789)";
String s="Select stu_id,sname from student";
ResultSet rs=stmt.executeQuery(s);
while(rs.next())
{
	int cn=rs.getInt("stu_id");
	String name=rs.getString("sname");
	System.out.println(cn+" "+name);
}
con.close();
System.out.println("Query executed....");
}
}
