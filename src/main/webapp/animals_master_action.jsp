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
String A_Name = request.getParameter("animalsname");
String A_Gender = request.getParameter("gender");
int A_Year = Integer.valueOf(request.getParameter("Date_of_Birth"));
int SID = Integer.valueOf (request.getParameter("SID"));
int DID = Integer.valueOf (request.getParameter("DID"));
int KID = Integer.valueOf (request.getParameter("KID"));
int EID = Integer.valueOf (request.getParameter("EID"));
out.print (A_Name);
out.print (A_Gender);
out.print (A_Year);
out.print (SID);
out.print (DID);
out.print (KID);
out.print (EID);
DBManager dbM = new DBManager();
try{
	dbM.getConnection();
	out.print("Connection Successfully");
	Animals animals = new Animals(A_Name, A_Gender, A_Year, SID, DID, KID, EID);
	AnimalsContentManager Acm = new AnimalsContentManager();
	int rowInserted = Acm.insert(animals);
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