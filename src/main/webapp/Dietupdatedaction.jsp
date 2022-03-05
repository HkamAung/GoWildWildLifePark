<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.crud.*" %>
 <%@ page import="com.dbconnector.*" %>
 <%@ page import="com.content.*" %>
 <%@ page import="java.sql.*" %>
 <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int id = Integer.valueOf(request.getParameter("dId"));
String type = request.getParameter("dtype");
int numberoffeed = Integer.valueOf(request.getParameter("numberoffeed"));
DietContentManager dcm = new DietContentManager();
Diet diet = new Diet(id,type,numberoffeed);
int rowsAffected;
try {

    rowsAffected = dcm.update(diet);
    out.println("No of rows affected - " + rowsAffected);

}catch (SQLException e){
    out.println(e.getMessage());

}
%>
</body>
</html>