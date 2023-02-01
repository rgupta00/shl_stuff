package com.demo.one2one.bi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "e_table2")
public class Employee {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;

	
	@JoinColumn(name = "pid_fk",unique = true)
	@OneToOne(cascade = CascadeType.ALL)
	private Parking parking;

	public Employee(String empName) {
		this.empName = empName;
	}
}
