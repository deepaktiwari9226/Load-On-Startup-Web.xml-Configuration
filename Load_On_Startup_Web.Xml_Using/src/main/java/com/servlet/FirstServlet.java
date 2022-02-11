package com.servlet;
import java.io.*;
import javax.servlet.*;
public class FirstServlet extends GenericServlet
{
	public FirstServlet() {
		System.out.println(" Servlet Object is created ");
		   }
		   
			@Override
		public void init(ServletConfig config) throws ServletException {
		    System.out.println("Servlet object is Initialized");
			}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) 
	throws ServletException, IOException 
	{
		System.out.println("Service method working ");
      String Firstname	= req.getParameter("fm");	
      String Lastname	= req.getParameter("lm");	
      String email	= req.getParameter("em");	
      String password = req.getParameter("ps");	
      PrintWriter out = res.getWriter();
      out.print("<h1>First-name = </h1>" +Firstname); 
      out.print("<h1>Last-name = </h1>"  +Lastname); 
      out.print("<h1>Email = </h1>"  +email); 
      out.print("<h1>Password = </h1>"  +password); 
      out.close();
     
	}
	@Override
	public void destroy() {
  System.out.println("Close all costly resources");
}

}
