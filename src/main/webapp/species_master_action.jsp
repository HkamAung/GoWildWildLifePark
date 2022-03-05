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
<% String Stype = request.getParameter("S_type");
    String Sgroup = request.getParameter("S_group");
    String Sstyle = request.getParameter("S_style");
    String Sstates = request.getParameter("S_states");
    out.print("S_type, S_group, S_style, S_states");
    DBManager dbM = new DBManager();
    try{
    	dbM.getConnection();
    	out.print("Connection Successfully");
    	Species species = new Species(Stype, Sgroup, Sstyle, Sstates);
    	SpeciesContentManager Scm = new SpeciesContentManager();
    	int rowInserted = Scm.insert(species);
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