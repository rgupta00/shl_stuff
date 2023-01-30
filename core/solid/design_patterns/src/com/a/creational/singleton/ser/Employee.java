package com.a.creational.singleton.ser;

import java.io.Serializable;
import java.util.Date;

class Employee implements Serializable{
	private Integer id;
	private String name;
	private Date hireDay;//mutable

	public Employee(Integer id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.hireDay=date;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", hireDay=" + hireDay
				+ "]";
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public void setHireDay(Date hireDay) {
		this.hireDay = hireDay;
	}

	
}





