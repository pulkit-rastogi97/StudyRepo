<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>list of all Availabe products</p>
<table border="2">
<tr>
<th width="30%">Product id</th>
<th width="30%">Product Name</th>
<th width="30%">Product Price</th>
<th width="30%">Add Product</th>
</tr>


<s:forEach items="${cartList}" var="product">
<tr>
<td width="30%">${product.productId }</td>
<td width="30%">${product.productName }</td>
<td width="30%">${product.productPrice }</td>
<td width="30%"><a href="delprod?productId=${product.productId}">delete product</a></td>
</tr>
</s:forEach>
</body>
</html>