package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controler
 */
public class Controler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operation=request.getParameter("oper");
		
		
	
		
		if(operation.equalsIgnoreCase("add")) {
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.forward(request, response);
		}
		else if(operation.equalsIgnoreCase("update")) {
			RequestDispatcher rd=request.getRequestDispatcher("index1.html");
			rd.forward(request, response);
		}
		else if(operation.equalsIgnoreCase("delete")) {
			RequestDispatcher rd=request.getRequestDispatcher("index2.html");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("main.html");
			PrintWriter writer=response.getWriter();
			rd.include(request, response);
			writer.println(("<center> <span style = 'color:red'> Invalid operation </span> </cener>"));
		}
		
		
		
	}

}
