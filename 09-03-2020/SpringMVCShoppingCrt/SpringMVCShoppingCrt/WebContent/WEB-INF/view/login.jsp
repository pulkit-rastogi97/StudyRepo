<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form  action="login"  modelAttribute="newLogin" method="post">
<s:label path="username">Username</s:label>
<s:input path="username"/>
<s:errors path="username" ></s:errors>
<br>
<br>

<s:label path="password">Password</s:label>
<s:input path="password"/>
<s:errors path="password"></s:errors>
<br>
<br>
<button type="submit">Submit</button>



</s:form>
</body>
</html>