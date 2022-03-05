package com.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.content.Species;
import com.dbconnector.DBManager;

public class SpeciesContentManager {
	public int insert(Species S) throws ClassNotFoundException, SQLException {
    	int result = -1;
    	//1.get connection
    	DBManager dbM = new DBManager();
    	Connection con = dbM.getConnection();
    	//2.Prepare Statement
    	String sql = "INSERT INTO `gowildwildlife`.`species`\r\n"
    			+ "(`Species_type`,\r\n"
    			+ "`Species_Group`,\r\n"
    			+ "`Conversation_status`,\r\n"
    			+ "`Life_Style`)\r\n"
    			+ "VALUES\r\n"
    			+ "(?, ? ,?, ?)";
    			
    	PreparedStatement pstmt = con.prepareStatement(sql);
    	pstmt.setString(1,S.getSpeciestype());
    	pstmt.setString(2,S.getSpeciesgroup());
    	pstmt.setString(3,S.getSpeciesstatus());
    	pstmt.setString(4,S.getSpecieslifestyle());
    	
    	result = pstmt.executeUpdate();
    	con.close();
    	return result;
    }
}
