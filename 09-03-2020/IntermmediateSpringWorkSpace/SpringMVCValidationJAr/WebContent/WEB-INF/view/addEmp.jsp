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
<s:form action="addEmp" modelAttribute="newEmp" method="post"> 
<s:label path="empId">Employee Id :: </s:label>
<s:input path="empId"/>
<s:errors path="empId"></s:errors>
<br><br>
<s:label path="empName">Employee Name :: </s:label>
<s:input path="empName"/>
<s:errors path="empName"></s:errors>
<br>
<br>
<s:label path="empSal">Employee Salary :: </s:label>
<s:input path="empSal"/>
<s:errors path="empSal"></s:errors>
<br>
<br>
<s:button type="submit">Add Employee</s:button>
</s:form>

Employee added newly and details are :: 
id is ${addedEmp.empId}<br>
name is ${addedEmp.empName}<br>
salary is ${addedEmp.empSal}<br>
</body>



</html>