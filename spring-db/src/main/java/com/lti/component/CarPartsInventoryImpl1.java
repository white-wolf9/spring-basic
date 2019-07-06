package com.lti.component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.lti.interfaces.CarPartsInventory;

@Component("carPartsImpl1")
public class CarPartsInventoryImpl1 implements CarPartsInventory{

	public void addNewPart(CarPart carPart) {
		Connection connection = null;
		PreparedStatement statement = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String user = "hr";
			String pass = "hr";
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",user,pass);
			String query = "insert into TBL_CARPARTS values(?,?,?,?)";
			statement = connection.prepareStatement(query);
			
			statement.setInt(1, carPart.getPartNo());
			statement.setString(2, carPart.getPartName());
			statement.setString(3, carPart.getCarModel());
			statement.setInt(4, carPart.getQuantity());
			statement.executeUpdate();
			System.out.println("Record inserted successfully!");
		}
		catch (ClassNotFoundException e) {
			System.out.println("JDBC driver not found");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			}
			catch (Exception e) {
				
			}
		}
	}
	
	public List<CarPart> getAvailableParts() {
			
			return null;
	}
}

