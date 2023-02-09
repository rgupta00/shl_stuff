package com.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.entities.Employee;
import com.employee.entities.Parking;
import com.employee.repo.EmployeeRepo;
import com.employee.repo.ParkingRepo;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private EmployeeRepo empRepo;

	@Autowired
	private ParkingRepo parkingRepo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Parking parking1=new Parking("A34");
		Parking parking2=new Parking("Mw6");
		Parking parking3=new Parking("F40");
		
		Employee emp1=new Employee("ekta", 4000.00);
		Employee emp2=new Employee("keshav", 7000.00);
		Employee emp3=new Employee("gunika", 3400.00);
		
		emp1.setParking(parking1);
		emp2.setParking(parking2);
		emp3.setParking(parking3);
		
		parking1.setEmployee(emp1);
		parking2.setEmployee(emp2);
		parking3.setEmployee(emp3);
		
		
		empRepo.save(emp1);
		empRepo.save(emp2);
		empRepo.save(emp3);
		
		parkingRepo.save(parking1);
		parkingRepo.save(parking2);
		parkingRepo.save(parking3);
		
		System.out.println("--------done---------");

	}

}
