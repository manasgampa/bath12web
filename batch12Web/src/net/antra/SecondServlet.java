package net.antra;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{
	
	public void init() {
		System.out.println("in init method");
	}
	
	public void service(HttpServletRequest request,HttpServletResponse response) {
		//student code
		//jdbc
		
		ServletContext context=getServletContext();
		String url=	context.getInitParameter("url");
		String uname=context.getInitParameter("uName");
		String password=context.getInitParameter("password");
		System.out.println("second servlet");
	}

	public void destroy() {
		System.out.println("in destroy method");
	}
}
