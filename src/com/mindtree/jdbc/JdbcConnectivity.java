package com.mindtree.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/praveen";
		String uname="root";
		String password="root";
		String query="select * from worker where first_name like 'c%'";
		
		
		try {
			Connection con=DriverManager.getConnection(url,uname,password);
			Statement statement=con.createStatement();
			ResultSet rs=statement.executeQuery(query);
			
			while(rs.next()) {
				
					System.out.println(rs.getString(1) +":"+rs.getString(2)+":"+rs.getString(3) +":"+rs.getString(4));
				}
			con.close();
			
		}catch(SQLException e) {
			System.out.println("error");
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		}}