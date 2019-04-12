package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
bharathi.thangaraj
 */
public class ServletExample extends HttpServlet{
	
	private String message;
	
	public void init() {
		
		message = "hello world";
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
		
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		out.println("<h1>"+message+"</h1>");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
		
	}
	
	public void destroy() {
		//caal implicitly
	}

}
