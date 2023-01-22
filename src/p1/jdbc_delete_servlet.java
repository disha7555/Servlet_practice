package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class jdbc_delete_servlet
 */
@WebServlet("/jdbc_delete_servlet")
public class jdbc_delete_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		try{
		String id3=request.getParameter("id3");
		Class.forName("com.mysql.jdbc.Driver");
		String urldb="jdbc:mysql://localhost/demo";
		Connection conn=DriverManager.getConnection(urldb,"root","root");
		Statement stmt=conn.createStatement();
		if(conn!=null){
			out.println("successfully connected");
		}
		String sql="delete from hello where id='"+id3+"'";
		int row=stmt.executeUpdate(sql);
		out.println(row);
		out.println("deleted");
		}
		catch(Exception e)
		{
			
		}
	}

}