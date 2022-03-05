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
<h1 style="text-align:center;">Diet List</h1>
<style>
th, td {
  border: 1px solid black;
  border-radius: 10px;
  width:20%;
  height:30px;
}
table{
border-collapse: collapse;
}
</style>
</head>
<body>
<%
DBManager dbManager = new DBManager();
try {
	dbManager.getConnection();
	out.println("Connection Succussfully");
	//Select
	DietContentManager dCM = new DietContentManager();
	ArrayList<Diet> diet = dCM.selectAll();
	
%>
<table style="width:100%">
	<tr>
	<th style="width:10%">Diet ID</th>
	<th>Diet Type</th>
	<th>Number of feeds</th>
	<th>Edit</th>
	<th>Delete</th>
	</tr>
<%
for(Diet eachElement:diet){
%>
<tr>
<td><%=eachElement.getD_id() %></td>
<td><%=eachElement.getD_type() %></td>
<td><%=eachElement.getD_number() %></td>
<td><a href="DietUpdate.jsp?id=<%=eachElement.getD_id()%>">Edit</a></td>
<td><a href="dietdeletedaction.jsp?id=<%=eachElement.getD_id()%>">Delete</a></td>
</tr>
<%
}
}
catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
%>

</table>
</body>
</html>