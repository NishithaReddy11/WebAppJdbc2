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

Product product=(Product)session.getAttribute("product");

%>
<form action="update1" method="post">


Enter product Id: <input type="text" name="pid" value=<%=product.getProductId() %> readonly > <br>

Enter product name: <input type="text" name="txtpname" value=<%=product.getProductName() %> > <br>

Enter product price: <input type="text" name="txtprice" value=<%=product.getPrice() %> > <br>

<input type="submit" value="Update">



</form>
</body>

</html>