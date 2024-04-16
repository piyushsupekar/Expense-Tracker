<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Expense Save</title>
</head>
<body>
    <h1>Expense Saved</h1>
    
    <jsp:useBean id="bean" class="com.expense.ExpensePage" scope="request" />
    
    <%
    // Get request parameters and set them into the bean
    String dateString = request.getParameter("date");
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    Date date = format.parse(dateString);
    
    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
    
    bean.setDate(sqlDate);
    bean.setMoney(Integer.parseInt(request.getParameter("money")));
    bean.setDesc(request.getParameter("desc"));
    
    // Use DAO to save the data
    com.expense.ExpenseDao dao = new com.expense.ExpenseDao();
    boolean r = dao.saveData(bean);
    if (r) {
        out.print("Data Inserted...");
    }
    %>
</body>
</html>


