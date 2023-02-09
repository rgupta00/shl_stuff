package com.empapp.repo;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.empapp.dto.EmpDeptResponse;
import com.empapp.entity.Department;
@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer>{
	//com.empapp.dto.EmpDeptResponse
	@Query("SELECT new com.empapp.dto.EmpDeptResponse(d.dname, e.name, e.salary) FROM Department d INNER JOIN d.employees e")
	public List<EmpDeptResponse>getEmpDeptInformation();
	
}
