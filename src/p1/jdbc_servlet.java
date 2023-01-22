package p1;

import java.sql.*;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class jdbc_servlet
 */
@WebServlet("/jdbc_servlet")
public class jdbc_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		try{
		String id1=request.getParameter("id1");
		String name1=request.getParameter("name1");
		Class.forName("com.mysql.jdbc.Driver");
		String urldb="jdbc:mysql://localhost/demo";
		Connection conn=DriverManager.getConnection(urldb,"root","root");
		Statement stmt=conn.createStatement();
		if(conn!=null){
			out.println("successfully connected");
		}
		String sql="insert into hello values('"+id1+"','"+name1+"')";
		int row=stmt.executeUpdate(sql);
		out.println(row);
		out.println("inserted");
		}
		catch(Exception e)
		{
			
		}
	}

}
