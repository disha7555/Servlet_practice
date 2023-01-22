package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.io.*;


import javax.servlet.*;  
import javax.servlet.http.*;  
    

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class jdbc_select_servlet
 */
@WebServlet("/jdbc_select_servlet")
public class jdbc_select_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");  
        out.println("<html><body>");  
		try{
		
		String urldb="jdbc:mysql://localhost/demo";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection(urldb,"root","root");
		Statement stmt=conn.createStatement();
		if(conn!=null){
			out.println("successfully connected");
		}
		String sql="select * from hello";
		ResultSet rs=stmt.executeQuery(sql);
		out.println("<table border=1 width=50% height=50%>");
		out.println("<tr><th>id</th><th>name</th></tr>");
		while(rs.next())
		{
			String i = rs.getString("id");  
            String n = rs.getString("name");
            out.println("<tr><td>"+i+"</td><td>"+n+"</td></tr>");
		}
		out.println("</table>");
		out.println("</html></body>");
		conn.close();
		}
		catch(Exception e)
		{
			
		}
	}

}