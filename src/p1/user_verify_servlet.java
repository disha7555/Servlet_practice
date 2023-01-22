package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class user_verify_servlet
 */
@WebServlet("/user_verify_servlet")
public class user_verify_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String u_login=request.getParameter("uname1");
		String p_login=request.getParameter("pword1");
		HttpSession s=request.getSession();
		String u_regi=(String)s.getAttribute("uname");
		String p_regi=(String)s.getAttribute("pwd");
		if(u_login.equals(u_regi) && p_login.equals(p_regi)){
			
		response.sendRedirect("user_welcome_jsp.jsp");
		}}}

		
	


