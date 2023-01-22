package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/user_set_servlet")
public class user_set_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fn=request.getParameter("f1");
		String ln=request.getParameter("l1");
		String un=request.getParameter("u1");
		String pw=request.getParameter("p1");
		
		HttpSession s=request.getSession();
		s.setAttribute("fname",fn);
		s.setAttribute("lname",ln);
		s.setAttribute("uname",un);
		s.setAttribute("pwd",pw);
		response.sendRedirect("user_login_jsp.jsp");
		
	}

}
