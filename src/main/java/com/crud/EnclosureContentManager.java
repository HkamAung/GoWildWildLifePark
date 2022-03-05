package com.crud;

import java.sql.*;
import com.content.Enclosure;
import com.dbconnector.DBManager;
import java.util.*;

public class EnclosureContentManager {
	 public int insert(Enclosure E) throws ClassNotFoundException, SQLException {
	    	int result = -1;
	    	//1.get connection
	    	DBManager dbM = new DBManager();
	    	Connection con = dbM.getConnection();
	    	//2.Prepare Statement
	    	String sql = "INSERT INTO `gowildwildlife`.`enclosures`\r\n"
	    			+ "(`type`,\r\n"
	    			+ "`location`)\r\n"
	    			+ "VALUES\r\n"
	    			+ "(?,?)";
	    			
	    	PreparedStatement pstmt = con.prepareStatement(sql);
	    	pstmt.setString(1,E.getE_type());
	    	pstmt.setString(2,E.getE_location());
	    	
	    	result = pstmt.executeUpdate();
	    	con.close();
	    	return result;
	    }
	 public ArrayList<Enclosure> selectAll() throws ClassNotFoundException, SQLException {
			ArrayList<Enclosure> elements = new ArrayList<Enclosure>();
			Enclosure E;
			//1. get connection
			 DBManager dbMgr = new DBManager();
			 Connection conn = dbMgr.getConnection();
			
			 //2.prepare statement
			 String sql = "SELECT `enclosures`.`enclosures_ID`,\r\n"
			 		+ "    `enclosures`.`type`,\r\n"
			 		+ "    `enclosures`.`location`\r\n"
			 		+ "FROM `gowildwildlife`.`enclosures`";
			 PreparedStatement pstmt=conn.prepareStatement(sql);
			 ResultSet rs = pstmt.executeQuery();
			 
			 while (rs.next()) {
				 E = new Enclosure(rs.getInt("enclosures_ID"),
						 rs.getString("type"),
						 rs.getString("location"));
				 elements.add(E);
			 }
				 
			 conn.close();
			 return elements;
		}
	public Enclosure getById(int id) throws ClassNotFoundException, SQLException {
		Enclosure E = null;
		//1. get connection
			DBManager dbMgr=new DBManager();
			Connection conn=dbMgr.getConnection();
			String sql = "SELECT `enclosures`.`enclosures_ID`,\r\n"
			 		+ "    `enclosures`.`type`,\r\n"
			 		+ "    `enclosures`.`location`\r\n"
			 		+ "FROM `gowildwildlife`.`enclosures` where `enclosures`.`enclosures_ID` = ? ";
			 PreparedStatement pstmt=conn.prepareStatement(sql);
			 pstmt.setInt(1, id);
			 ResultSet rs = pstmt.executeQuery();
			 
			 while (rs.next()) {
				 E = new Enclosure(rs.getInt("enclosures_ID"),
						 rs.getString("type"),
						 rs.getString("location"));
			 }
				 
			conn.close();
			return E;
	}
	public int update(Enclosure e) throws ClassNotFoundException, SQLException{
		
		int result=-1;
		
		//1. get connection
		DBManager dbMgr=new DBManager();
		Connection conn=dbMgr.getConnection();
		
		//2.prepare statement
		
		String sql = "UPDATE `gowildwildlife`.`enclosures`\r\n"
				+ "SET\r\n"
				+ "`type` = ?,\r\n"
				+ "`location` = ?\r\n"
				+ "WHERE `enclosures_ID` = ?";


		PreparedStatement pstmt=conn.prepareStatement(sql);
		
		// first and second paramters inserted 1. course name and course text
		
		pstmt.setInt(3, e.getE_Id() );
		pstmt.setString(1, e.getE_type());
		pstmt.setString(2, e.getE_location());
		
		
		
		//3.execute statement
		
		result = pstmt.executeUpdate();
		
		return result;
		
	}
	public int delete (int id) throws SQLException, ClassNotFoundException {
	    int rowsDeleted = -1;
	    String sql ;
		//1. get Connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		
		//2. prepare the statement 
	    sql = "DELETE FROM `gowildwildlife`.`enclosures`\r\n"
	    		+ "WHERE `enclosures_ID` = ?";
	    PreparedStatement pstmt = conn.prepareStatement(sql);
	    //First parameter is the course id of the course entity
	    pstmt.setInt(1, id);

	    rowsDeleted = pstmt.executeUpdate();
	    return rowsDeleted;
	}
}