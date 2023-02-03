package com.bankapp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
@Primary
public class AccountDaoJdbcTemplateImpl implements AccountDao {

	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public AccountDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Account> getAllAccounts() {	
		return jdbcTemplate.query("select * from accounts", new AccountRowMapper());
	}

	@Override
	public Account getById(int accId) {
		return jdbcTemplate.queryForObject("select * from accounts where id=?", new AccountRowMapper(), accId);
	}

	@Override
	public void updateAccount(Account account) {
		jdbcTemplate.update("update accounts set balance=? where id=?", new Object[] {account.getBalance(), account.getId()});
	}

	@Override
	public void addAccount(Account account) {
		jdbcTemplate.update("insert into accounts(name, balance) values(?,?)", new Object[] {account.getName(), account.getBalance()});
	}

	@Override
	public void deleteAccount(int accId) {
		jdbcTemplate.update("delete * from accounts where id=?", accId);
	}

}
