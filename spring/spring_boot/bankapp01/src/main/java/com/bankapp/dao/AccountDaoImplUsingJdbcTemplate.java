package com.bankapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
//@Primary
public class AccountDaoImplUsingJdbcTemplate implements AccountDao{

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public AccountDaoImplUsingJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public List<Account> getAllAccounts() {
		return jdbcTemplate.query("select * from accounts", new AccountRowMapper());
	}

}
