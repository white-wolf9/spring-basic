package com.lti.component;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("carPartsImpl3")
public class CarPartsInventoryImpl3 implements CarPartsInventory{

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void addNewPart(CarPart carPart) {
		jdbcTemplate.update("insert into TBL_CARPARTS values(?,?,?,?)",carPart.getPartNo(),carPart.getPartName(),carPart.getCarModel(),carPart.getQuantity());
	}
	
	class CarPartRowMapper implements RowMapper<CarPart> {

		public CarPart mapRow(ResultSet rs, int rowNum) throws SQLException {
			CarPart carPart = new CarPart();
			carPart.setPartNo(rs.getInt(1));
			carPart.setPartName(rs.getString(2));
			carPart.setCarModel(rs.getString(3));
			carPart.setQuantity(rs.getInt(4));
			return carPart;
		}
		
	}
	public List<CarPart> getAvailableparts(){
		String  sql = "select  *  from TBL_CARPARTS where quantity>?";
		List<CarPart> list = jdbcTemplate.query(sql, new CarPartRowMapper(),2);
		return list;
	}

	

}
