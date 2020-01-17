<%@ page import="java.util.*" %>

<%@ page import="com.deloitte.estore.model.Product" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

Product products=(Product)session.getAttribute("products");

%>



<table border="1">

<tr>

<th>Prod Id</th>

<th>Prod Name</th>

<th>Prod Price</th>

</tr>

<%



	out.println("<tr><td>"+products.getProductId()+"</td>");

	out.println("<td>"+products.getProductName()+"</td>");

	out.println("<td>"+products.getPrice()+"</td>");

	

//response.sendRedirect("update.jsp");
%>

</table>
</body>
</html>
