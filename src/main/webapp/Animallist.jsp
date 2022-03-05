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
<h1 style="text-align:center;">Animal List</h1>
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
	AnimalsContentManager a = new AnimalsContentManager();
	ArrayList<Animals> Animallist = a.selectAll();
	
%>
<table style="width:100%">
	<tr>
	<th style="width:10%">Animal ID</th>
	<th>Animal Name</th>
	<th>Gender</th>
	<th>Year</th>
	<th>Species ID</th>
	<th>Diet ID</th>
	<th>Keeper ID</th>
	<th>Enclosure ID</th>
	
	</tr>
<%
for(Animals eachElement:Animallist){
%>
<tr>
<td><%=eachElement.getA_id() %></td>
<td><%=eachElement.getA_name() %></td>
<td><%=eachElement.getA_gender() %></td>
<td><%=eachElement.getA_year() %></td>
<td><%=eachElement.getS_id() %></td>
<td><%=eachElement.getD_id() %></td>
<td><%=eachElement.getK_id() %></td>
<td><%=eachElement.getE_id() %></td>
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