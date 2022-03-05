package com.crud;
import com.content.*;
import com.dbconnector.*;
import java.sql.*;
public class KeeperContentManager {
    public int insert(Keeper k) throws ClassNotFoundException, SQLException {
    	int result = -1;
    	//1.get connection
    	DBManager dbM = new DBManager();
    	Connection con = dbM.getConnection();
    	//2.Prepare Statement
    	String sql = "INSERT INTO `gowildwildlife`.`keepers`\r\n"
    			+ "(`Name`,\r\n"
    			+ "`date_of_birth`,\r\n"
    			+ "`email`,\r\n"
    			+ "`phone`,\r\n"
    			+ "`rank`)\r\n"
    			+ "VALUES\r\n"
    			+ "(?,?,?,?,?)";
    			
    	PreparedStatement pstmt = con.prepareStatement(sql);
    	pstmt.setString(1,k.getKeeperName());
    	pstmt.setString(2,k.getKeeperBirth());
    	pstmt.setString(3,k.getKeeperEmail());
    	pstmt.setString(4,k.getKeeperPhone());
    	pstmt.setString(5,k.getKeeperrank());
    	result = pstmt.executeUpdate();
    	con.close();
    	return result;
    }
}
