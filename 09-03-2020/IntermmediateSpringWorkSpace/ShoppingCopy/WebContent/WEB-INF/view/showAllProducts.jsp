<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Details</title>
</head>
<body>
    <div>
        <h1>Product Details....</h1><br>
            <c:forEach items="${products}" var="entry">
                ${entry.productId},&nbsp&nbsp Product_Name = ${entry.productName},&nbsp&nbsp Product_Price = ${entry.productPrice}&nbsp&nbsp&nbsp&nbsp <a href="addToCart?id=${entry.productId}">Add To Cart</a><br><br>
            </c:forEach>
            
            
         <h1>Cart Details....</h1><br>
            <c:forEach items="${viewCart}" var="entry">
                ${entry.productId},&nbsp&nbsp Product_Name = ${entry.productName},&nbsp&nbsp Product_Price = ${entry.productPrice}&nbsp&nbsp&nbsp&nbsp <a href="removeFromCart?id=${entry.productId}">Remove</a><br><br>
            </c:forEach>
     
    </div>
</body>
</html>