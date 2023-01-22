<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="jdbc_crud_servlet" method="get">
ID:<input type="text" name="id">
Name:<input type="text" name="name">
<input type="submit" name="i" value="insert" >
<input type="submit" name="j" value="update">
<input type="submit" name="k" value="delete">
<input type="submit" name="l" value="select">
</form>
</body>
</html>


