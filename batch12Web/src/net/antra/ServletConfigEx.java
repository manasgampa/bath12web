package net.antra;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigEx extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) {
		
			ServletConfig config=getServletConfig();
			String name=config.getInitParameter("uname");
			System.out.println(name);
			
			
	}

}
