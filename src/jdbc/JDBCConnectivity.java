/*
 * There are 5 steps to connect any java application with the database using JDBC. These steps are as follows:
Register the Driver class
Create connection
Create statement
Execute queries
Close connection
 */

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;

public class JDBCConnectivity {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakilla", "root", "phoenix");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from actor");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}			
			con.close();
		} catch (Exception e) {
			System.out.println(e);// TODO Auto-generated catch block
		}
	}

}
