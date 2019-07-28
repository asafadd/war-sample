package com.asaf;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/hello", loadOnStartup = 1)
public class HelloServlet extends HttpServlet {
	 public void init() throws ServletException {
	        System.out.println("HelloServlet: You should see this in the Instance Logs :-)");
	 }
}
