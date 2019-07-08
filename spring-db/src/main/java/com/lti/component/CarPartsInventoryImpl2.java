package com.lti.component;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("carPartsImpl2")
public class CarPartsInventoryImpl2 implements CarPartsInventory{

	@Autowired
	private DataSource dataSource;
	
	public void addNewPart(CarPart carPart) {
		Connection conn=null;	
		PreparedStatement stmt=null;	
			try {
				
				conn = dataSource.getConnection();
				String sql="insert into TBL_CARPARTS values(?,?,?,?)";
				stmt=conn.prepareStatement(sql);
				
				stmt.setInt(1,carPart.getPartNo());
				stmt.setString(2, carPart.getPartName());
				stmt.setString(3,carPart.getCarModel());
				stmt.setInt(4, carPart.getQuantity());
				stmt.executeUpdate();	
				
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
			finally {
				try {
					conn.close();
				}
				catch(Exception e) {
					
				}
			}
		}
	
	public List<CarPart> getAvailableparts(){
		
		return null;
	}

	

}
