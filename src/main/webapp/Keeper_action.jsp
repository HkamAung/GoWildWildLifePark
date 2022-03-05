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
<title>Keeper Action</title>
</head>
<body>
<%
String kName = request.getParameter("K_name");
String dob = request.getParameter("K_dob");
String email = request.getParameter ("K_email");
String phone = request.getParameter ("K_phone");
String type = request.getParameter ("K_type");
DBManager dbM = new DBManager();
try{
	dbM.getConnection();
	out.print("Connection Successfully");
	Keeper keeper = new Keeper(kName, dob, email, phone, type);
	KeeperContentManager kcm = new KeeperContentManager();
	int rowInserted = kcm.insert(keeper);
	if(rowInserted==1){
		out.print("Successfully inserted");
	}
}
catch(SQLException e){
	e.printStackTrace();
}
%>
</body>
</html>