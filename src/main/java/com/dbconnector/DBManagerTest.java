package com.dbconnector;
import java.sql.*;
import com.content.*;
import com.crud.*;

public class DBManagerTest {
	public static void main(String[] args) {
		//create object of DBManager Class
		DBManager dbM = new DBManager();
		try {
			dbM.getConnection();
			System.out.print("Connection successfully");
			Keeper keeper = new Keeper(null,null,null,null,null);
			keeper.setKeeperName("Dave");
			keeper.setKeeperBirth("2002-8-22");
			keeper.setKeeperEmail("dave@gmail.com");
			keeper.setKeeperPhone("09753517361");
			keeper.setKeeperrank("50");
			
			KeeperContentManager scm = new KeeperContentManager();
			int rowInserted = scm.insert(keeper);
			if(rowInserted==1) {
				System.out.print("Successfully Inserted");
			}
		}
	
	catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}

}
}
