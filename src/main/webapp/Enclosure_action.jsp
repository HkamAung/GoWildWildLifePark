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
<%
String etype = request.getParameter("E_type");
String elocation= request.getParameter("K_dob");
DBManager dbM = new DBManager();
try{
	dbM.getConnection();
	out.print("Connection Successfully");
	Enclosure jcm = new Enclosure(etype,elocation);
	EnclosureContentManager kcm = new EnclosureContentManager();
	int rowInserted = kcm.insert(jcm);
	if(rowInserted==1){
		out.print("Successfully inserted");
	}
}
catch(SQLException e){
	e.printStackTrace();
}
%>
<body>

</body>
</html>