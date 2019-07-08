package com.lti.component;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component("carPartsImpl4")
public class CarPartsInventoryImpl4 implements CarPartsInventory{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void addNewPart(CarPart carPart) {
		entityManager.persist(carPart);
	}
	
	public List<CarPart> getAvailableparts(){
		return entityManager.createQuery("select  c from CarPart as c").getResultList();
	}

	

}
