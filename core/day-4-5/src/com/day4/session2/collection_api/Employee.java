package com.day4.session2.collection_api;

import java.util.Comparator;

class NameThenSalarySorter implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		int val= o1.getName().compareTo(o2.getName());
		if(val==0) {
			val=Double.compare(o2.getSalary(), o1.getSalary());
		}
		return val;
	}
}


class NameSorter implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class SalarySorter implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return Double.compare(o2.getSalary(), o1.getSalary());
	}
	
}



final public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private void foof(double salary) {
        this.salary = salary;
    }


    public Employee(int id, String name, double salary){
	this.id=id;
        this.name = name;
        this.salary = salary;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Employee employee = (Employee) o;

        if (id != employee.id)
            return false;
        if (Double.compare(employee.salary, salary) != 0)
            return false;
        return name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return name.length();
    }

	@Override
	public int compareTo(Employee o) {
		return Integer.compare(this.getId(), o.getId());
		
	}

  
}
