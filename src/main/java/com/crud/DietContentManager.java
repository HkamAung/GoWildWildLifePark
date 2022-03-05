package com.crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.content.Diet;
import com.content.Enclosure;
import com.dbconnector.DBManager;
public class DietContentManager {
	 public int insert(Diet D) throws ClassNotFoundException, SQLException {
	    	int result = -1;
	    	//1.get connection
	    	DBManager dbM = new DBManager();
	    	Connection con = dbM.getConnection();
	    	//2.Prepare Statement
	    	String sql = "INSERT INTO `gowildwildlife`.`diet`\r\n"
	    			+ "(`Diet_type`,\r\n"
	    			+ "`NumberOfFeed`)\r\n"
	    			+ "VALUES\r\n"
	    			+ "(?, ?)";
	    			
	    	PreparedStatement pstmt = con.prepareStatement(sql);
	    	pstmt.setString(1,D.getD_type());
	    	pstmt.setInt(2,D.getD_number());
	    	
	    	
	    	result = pstmt.executeUpdate();
	    	con.close();
	    	return result;
	    }
	 public ArrayList<Diet> selectAll() throws ClassNotFoundException, SQLException {
			ArrayList<Diet> elements = new ArrayList<Diet>();
			Diet diet;
			//1. get connection
			 DBManager dbMgr = new DBManager();
			 Connection conn = dbMgr.getConnection();
			
			 //2.prepare statement
			 String sql = "SELECT `diet`.`Diet_ID`,\r\n"
			 		+ "    `diet`.`Diet_type`,\r\n"
			 		+ "    `diet`.`NumberOfFeed`\r\n"
			 		+ "FROM `gowildwildlife`.`diet`;";
			 PreparedStatement pstmt=conn.prepareStatement(sql);
			 ResultSet rs = pstmt.executeQuery();
			 
			 while (rs.next()) {
				 diet = new Diet(rs.getInt("Diet_ID"),
						 rs.getString("Diet_type"),
						 rs.getInt("NumberOfFeed"));
				 elements.add(diet);
			 }
				 
			 conn.close();
			 return elements;
		}
	 public Diet getById(int id) throws ClassNotFoundException, SQLException {
			Diet diet = null;
			//1. get connection
				DBManager dbMgr=new DBManager();
				System.out.print(id);
				Connection conn=dbMgr.getConnection();
				String sql = "SELECT `diet`.`Diet_ID`,\r\n"
						+ "    `diet`.`Diet_type`,\r\n"
						+ "    `diet`.`NumberOfFeed`\r\n"
						+ "FROM `gowildwildlife`.`diet` WHERE `diet`.`Diet_ID`=?;";
				 PreparedStatement pstmt=conn.prepareStatement(sql);
				 pstmt.setInt(1, id);
				 ResultSet rs = pstmt.executeQuery();
				 
				 while (rs.next()) {
					 diet = new Diet(rs.getInt("Diet_ID"),
							 rs.getString("Diet_type"),
							 rs.getInt("NumberOfFeed"));
				 }
					 
				conn.close();
				return diet;
		}
	 public int update(Diet d) throws ClassNotFoundException, SQLException{
			
			int result=-1;
			
			//1. get connection
			DBManager dbMgr=new DBManager();
			Connection conn=dbMgr.getConnection();
			
			//2.prepare statement
			
			String sql = "UPDATE `gowildwildlife`.`diet`\r\n"
					+ "SET\r\n"
					+ "`Diet_type` = ?,\r\n"
					+ "`NumberOfFeed` = ?\r\n"
					+ "WHERE `Diet_ID` = ?;";


			PreparedStatement pstmt=conn.prepareStatement(sql);
			
			// first and second paramters inserted 1. course name and course text
			
			pstmt.setInt(3, d.getD_id());
			pstmt.setString(1,d.getD_type() );
			pstmt.setInt(2,d.getD_number() );
			
			
			
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
		    sql = "DELETE FROM `gowildwildlife`.`diet`\r\n"
		    		+ "WHERE `Diet_ID` = ?";
		    PreparedStatement pstmt = conn.prepareStatement(sql);
		    //First parameter is the course id of the course entity
		    pstmt.setInt(1, id);

		    rowsDeleted = pstmt.executeUpdate();
		    return rowsDeleted;
		}
}
