package net.antra;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		ServletContext context=getServletContext();
		String url=	context.getInitParameter("url");
		String uname=context.getInitParameter("uName");
		String password=context.getInitParameter("password");
		
		String id=request.getParameter("empId");
		String name=request.getParameter("EmpName");
		String sal=request.getParameter("sal");
		int id1=Integer.parseInt(id);
		int sal1=Integer.parseInt(sal);
		
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?)");
			pstmt.setInt(1, id1);
			pstmt.setString(2, name);
			pstmt.setInt(3, sal1);
			pstmt.execute();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
		
		PrintWriter out=response.getWriter();
		out.println("Hi Servlet the values are:");
		
		out.println(id);
		out.println(name);
		out.println(sal);
		
	} 

}
