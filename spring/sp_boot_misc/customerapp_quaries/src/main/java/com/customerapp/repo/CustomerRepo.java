package com.customerapp.repo;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.customerapp.dto.CustomerDto;
import com.customerapp.entity.Customer;
//java reflecation and byte code manipulation and annotation processing
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

	//find the name as per email
	@Query("select new com.customerapp.dto.CustomerDto(c.emailId, c.name) from Customer c where c.emailId=:emailId")
	public CustomerDto findNameFromEmail(@Param("emailId")  String emailId);
	
	
//	Optional<Customer> findByEmailId(String emailId);
//	Optional<Customer> findByEmailIdOrName(String emailId, String name);
//	Optional<Customer> findByEmailIdAndName(String emailId, String name);
//	
//	List<Customer> findByDateOfBirthBetween(LocalDate localDate1, LocalDate localDate2);
//	
//	List<Customer> findByDateOfBirthLessThan(LocalDate localDate);
//	
//	Optional<Customer> findByEmailIdNull();
	
}
