package com.hibernateCon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterPage
 */
@WebServlet("/RegisterPage")
public class RegisterPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		    String fname = request.getParameter("fname");
		    String lname = request.getParameter("lname");
	        String password = request.getParameter("upass");
	        String email = request.getParameter("uemail");
	        String phone = request.getParameter("umobile");
	        
	 
	        HttpSession session = request.getSession(true);
	        try {
	            RegisterDetails user = new RegisterDetails();
	            user.addUserDetails(fname,lname,password, email, phone);
	            PrintWriter pw = response.getWriter();
	            pw.println("success");
	        } catch (Exception e) {
	 
	            e.printStackTrace();
	        }
	}

}
