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
if(dao.validate(bean))
{
	%>
	<jsp:forward page="welcome.jsp"></jsp:forward>

	<%
}
else{
	out.print("Invalidate Credential");
	%>
	<jsp:include page="index.jsp"></jsp:include>
	<%
}
	%>
</body>
</html>