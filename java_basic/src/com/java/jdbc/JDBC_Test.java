package com.java.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;


public class JDBC_Test {

	public static void main(String[] args)throws Exception {
		
		String driverClassName="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:XE"; //이 컴퓨터라는 뜻
		String username="mire001";
		String password="mire001";
	
		//1.Driver loading
		Class.forName(driverClassName);
		System.out.println("드라이버 로딩 성공");
		
		//2.database connection
		Connection conn=DriverManager.getConnection(url,username,password);
		System.out.println("연결성공");
		
		//3.sql 전송
		String sql="select*from member";
		Statement stmt=conn.createStatement();
		
		//4.결과
		ResultSet rs=stmt.executeQuery(sql);
		
		//5.receive result
		while(rs.next()) {
			String user=rs.getString("username");
			String pwd=rs.getString("password");
			String name=rs.getString("name");
			String email=rs.getString("email");
			String phone=rs.getString("phone");
			Date inDate=rs.getDate("indate");
			
			String inDateStr=new SimpleDateFormat("yyyy-MM-dd").format(inDate);
			System.out.println(user+"\t"+pwd+"\t"+name+"\t"+email+"\t"+phone+"\t"+inDateStr);
		}
	}

}
