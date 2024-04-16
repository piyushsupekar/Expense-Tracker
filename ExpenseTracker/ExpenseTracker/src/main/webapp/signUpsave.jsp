<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bean" class="com.expense.Login"></jsp:useBean>
<jsp:setProperty property="*" name="bean"/>
<jsp:useBean id="dao" class="com.expense.LoginDao"></jsp:useBean>
<% 
boolean r=(dao.saveUser(bean));
if(r)
{
	out.print("User Created...");
%>
<jsp:include page="index.jsp"></jsp:include>
<%
}
else{
	out.print("Error Creating user");
%>
<jsp:include page="index.jsp"></jsp:include>
<%
}
%>
</body>
</html>