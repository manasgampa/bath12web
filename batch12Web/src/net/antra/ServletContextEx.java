package net.antra;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextEx extends HttpServlet{

	public void service(HttpServletRequest request, HttpServletResponse response) {
		
		ServletContext context=getServletContext();
		String url=	context.getInitParameter("url");
		String uname=context.getInitParameter("uName");
		String password=context.getInitParameter("password");
		
		
		System.out.println(url);
		System.out.println(uname);
		System.out.println(password);
		
		
		ServletConfig config=getServletConfig();
		String name=config.getInitParameter("uname");
		System.out.println(name);
		
	}
}
