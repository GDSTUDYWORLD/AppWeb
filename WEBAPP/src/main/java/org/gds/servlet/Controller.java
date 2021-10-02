package org.gds.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Controller() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String param = request.getParameter("page");
		if(param.equals("login")) {
			getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		} else if(param.equals("signup")) {
			getServletContext().getRequestDispatcher("/signUp.jsp").forward(request, response);
		} else if(param.equals("about")) {
			getServletContext().getRequestDispatcher("/about.jsp").forward(request, response);
		} else {
			getServletContext().getRequestDispatcher("/notFound.jsp").forward(request, response);
		}
		
		response.getWriter().println(request.getParameter("name"));
		response.getWriter().println(request.getParameter("gender"));
		
		PrintWriter out = response.getWriter();
		String[] languages = request.getParameterValues("language"); 
		if(languages != null){
			for(int i=0; i<languages.length;i++){
				out.print(languages[i]);
				out.print("<br />");
			}
		} else{
			out.print("None Selected");
		}
		
		response.getWriter().println(request.getParameter("country"));
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	}
}
