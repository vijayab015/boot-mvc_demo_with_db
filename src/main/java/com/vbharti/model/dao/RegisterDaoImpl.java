package com.vbharti.model.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vbharti.model.RegisterModel;


@Repository
public class RegisterDaoImpl implements RegisterDao {
	
	@Autowired
	
	private JdbcTemplate jdbcTemplate;
	
	String sql="insert into register(fname,lname,email,address) values (?,?,?,?)";

	@Override
	public void register(RegisterModel rm) {
		System.out.println("step 2");
		
		jdbcTemplate.update(sql,rm.getfName(),rm.getlName(),rm.getEmail(),rm.getAddress());
		
		System.out.println("registred successfully");

	}

}
