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
<h1 style="text-align:center;">Enclosure List</h1>
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
	EnclosureContentManager E = new EnclosureContentManager();
	ArrayList<Enclosure> enclosure = E.selectAll();
	
%>
<table style="width:100%">
	<tr>
	<th style="width:10%">Enclosure_ID</th>
	<th>Enclosure_Type</th>
	<th>Enclosure_Location</th>
	<th>Edit</th>
	<th>Delete</th>
	</tr>
<%
for(Enclosure eachElement:enclosure){
%>
<tr>
<td><%=eachElement.getE_Id()%></td>
<td><%=eachElement.getE_type() %></td>
<td><%=eachElement.getE_location() %></td>
<td><a href="EnclosuresUpdate.jsp?id=<%=eachElement.getE_Id()%>">Edit</a></td>
<td><a href="enclosuresdeletedaction.jsp?id=<%=eachElement.getE_Id()%>">Delete</a></td>
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