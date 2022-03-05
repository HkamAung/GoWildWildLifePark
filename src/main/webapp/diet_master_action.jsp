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
<% String D_type = request.getParameter("diettype");
int D_number = Integer.valueOf(request.getParameter("dietnumber"));
DBManager dbM = new DBManager();
try{
	dbM.getConnection();
	out.print("Connection Successfully");
	Diet diet = new Diet(D_type, D_number);
	DietContentManager Dcm = new DietContentManager();
	int rowInserted = Dcm. insert(diet);
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