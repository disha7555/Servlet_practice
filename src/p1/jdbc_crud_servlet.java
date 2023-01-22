package p1;

import java.io.IOException;
import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class jdbc_crud_servlet
 */
@WebServlet("/jdbc_crud_servlet")
public class jdbc_crud_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
		Class.forName("com.mysql.jdbc.Driver");
		String urldb="jdbc:mysql://localhost/demo";
		Connection conn=DriverManager.getConnection(urldb,"root","root");
		Statement stmt=conn.createStatement();
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String i=request.getParameter("i");
		String j=request.getParameter("j");
		String k=request.getParameter("k");
		String l=request.getParameter("l");
		//out.println(id);
		//out.println(i);
		if(i!=null)
		{
		String sql1="insert into hello values('"+id+"','"+name+"')";
		stmt.executeUpdate(sql1);
		}
		if(j!=null)
		{
			String sql2="update hello set name='"+name+"' where id='"+id+"'";
			stmt.executeUpdate(sql2);
		}
		if(k!=null){
			String sql3="delete from hello where id='"+id+"'";
			stmt.executeUpdate(sql3);
		}
		if(l!=null){
			String sql4="select * from hello where id='"+id+"'";
			ResultSet rs=stmt.executeQuery(sql4);
			out.println("<!DOCTYPE html>");
			  out.println("<html>");
			  //out.println("<head>");
			  //out.println("<meta charset=\"utf-8\">");  // escape the quote marks
			  //out.println("<style>");     // start style
			  // enclose style attributes withing the <style> </style> elements
			  //out.println("td{");        // note leading brace
			  //out.println("padding:15;");
			  //out.println("}");          
			  //out.println("</style>");  // terminate style
			  //out.println("</head>");
			  out.println("<body>");
			out.println("<table border=1 height=10% width=10%>");
			out.println("<tr><th>id</th><th>name</th></tr>");
			while(rs.next())
			{
				String idd = rs.getString("id");  
	            String namm = rs.getString("name");
	            out.println("<tr><td style='padding:25px'>"+idd+"</td><td style='padding:25px'>"+namm+"</td></tr>");
			}
			out.println("</table>");
			out.println("</body></html>");
		}
		}
		catch(Exception e){}
	}}
		
	


