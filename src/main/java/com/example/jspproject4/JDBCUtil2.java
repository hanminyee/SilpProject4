package com.example.jspproject4;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil2 {
	public static Connection getConnection(){  
	    Connection con=null;  
	    try{  
	        Class.forName("org.mariadb.jdbc.Driver");
	        con= DriverManager.getConnection("jdbc:mariadb://walab.handong.edu:3306/p233_22200336?user=p233_22200336&password=Lai9ir");
	    }catch(Exception e){
	    	System.out.println(e);
	    }  
	    return con;  
	}  
	
	public static void main(String ars[]) {
		Connection conn = getConnection();
		if(conn != null)
			System.out.println("DB 연결됨!");
		else
			System.out.println("DB 연결중 오류 !");
	}
}