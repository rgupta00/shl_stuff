package com.bankapp.repo;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.entities.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {
		
	public List<Account> findByName(String name);
}
