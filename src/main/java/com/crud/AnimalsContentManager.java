package com.crud;

import com.content.*;
import java.util.*;
import com.dbconnector.*;
import java.sql.*;
public class AnimalsContentManager {
	 public int insert(Animals A) throws ClassNotFoundException, SQLException {
	    	int result = -1;
	    	//1.get connection
	    	DBManager dbM = new DBManager();
	    	Connection con = dbM.getConnection();
	    	//2.Prepare Statement
	    	String sql = "INSERT INTO `gowildwildlife`.`animal`\r\n"
	    			+ "(`animal_name`,\r\n"
	    			+ "`gender`,\r\n"
	    			+ "`year`,\r\n"
	    			+ "`sId`,\r\n"
	    			+ "`dId`,\r\n"
	    			+ "`kId`,\r\n"
	    			+ "`eId`)\r\n"
	    			+ "VALUES\r\n"
	    			+ "(?,?,?,?,?,?,?)";
	    			
	    	PreparedStatement pstmt = con.prepareStatement(sql);
	    	pstmt.setString(1,A.getA_name());
	    	pstmt.setString(2,A.getA_gender());
	    	pstmt.setInt(3,A.getA_year());
	    	pstmt.setInt(4,A.getS_id());
	    	pstmt.setInt(5,A.getD_id());
	    	pstmt.setInt(6,A.getK_id());
	    	pstmt.setInt(7,A.getE_id());
	    	result = pstmt.executeUpdate();
	    	con.close();
	    	return result;
	    }
	 public ArrayList<Animals> selectAllAnimalsByKeeperName() throws ClassNotFoundException, SQLException{
			ArrayList<Animals> AnimalList = new ArrayList<Animals>();
			Animals animal;
			//1. get connection
			DBManager dbMgr = new DBManager();
			Connection conn = dbMgr.getConnection();
			//2. prepare statement
			String sql ="select animal.idanimal, animal.animal_name, animal.gender , animal.year, keepers.Keepers_ID, keepers.Name\r\n"
					+ "from animal left join keepers on animal.kId=keepers.Keepers_ID ;";
			PreparedStatement pstmt =conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			//populate the array list from the record of the table_html
			while (rs.next()) {
				 animal = new Animals(rs.getInt("idanimal"),
						rs.getString("animal_name"),
						rs.getString("gender"),
						rs.getInt("year"),
						rs.getInt("Keepers_ID"),
						rs.getString("Name"));
				AnimalList.add(animal);//add entity object into collection
			}
			conn.close();
			return AnimalList;
		}
		public ArrayList<Animals> selectTotalAnimalCount() throws ClassNotFoundException, SQLException{
			ArrayList<Animals> AnimalList = new ArrayList<Animals>();
			Animals animal;
			//1. get connection
			DBManager dbMgr = new DBManager();
			Connection conn = dbMgr.getConnection();
			//2. prepare statement
			String sql ="select keepers.Name , count(animal.idanimal) as totalanimal \r\n"
					+ "from animal left join keepers on animal.kId=keepers.Keepers_ID group by Keepers_ID ;";
			PreparedStatement pstmt =conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			//populate the array list from the record of the table_html
			while (rs.next()) {
				 animal = new Animals(rs.getString("Name"),
						rs.getInt("totalanimal"));
				AnimalList.add(animal);//add entity object into collection
			}
			conn.close();
			return AnimalList;
		}
		public ArrayList<Animals> selectAll() throws ClassNotFoundException, SQLException{
			ArrayList<Animals> AnimalList = new ArrayList<Animals>();
			Animals animal;
			//1. get connection
			DBManager dbMgr = new DBManager();
			Connection conn = dbMgr.getConnection();
			//2. prepare statement
			String sql ="SELECT `animal`.`idanimal`,\r\n"
					+ "    `animal`.`animal_name`,\r\n"
					+ "    `animal`.`gender`,\r\n"
					+ "    `animal`.`year`,\r\n"
					+ "    `animal`.`sId`,\r\n"
					+ "    `animal`.`dId`,\r\n"
					+ "    `animal`.`kId`,\r\n"
					+ "    `animal`.`eId`\r\n"
					+ "FROM `gowildwildlife`.`animal`;";
			PreparedStatement pstmt =conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			//populate the array list from the record of the table_html
			while (rs.next()) {
				 animal = new Animals(rs.getInt("idanimal"),
						 			  rs.getString("animal_name"),
						 			  rs.getString("gender"),
						 			  rs.getInt("year"),
						 			  rs.getInt("sId"),
						 			  rs.getInt("dId"),
						 			  rs.getInt("kId"),
						 			  rs.getInt("eId"));
				AnimalList.add(animal);//add entity object into collection
			}
			conn.close();
			return AnimalList;
		}
		
}
