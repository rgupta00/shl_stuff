package com.day3.session1;
import java.util.*;
class Employee extends Object{
	private int id;
	private String name;
	private String dept;
	private double salary;
	
	public Employee(int id, String name, String dept, double salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=")
		.append(id)
		.append(", name=")
		.append(name)
		.append(", dept=")
		.append(dept)
		.append(", salary=").append(salary).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return 1;
		//return new Random().nextInt();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("it is called...");
		super.finalize();
	}
}
public class B_DemoObjectClass {
//	public int getValue(int index) {
//		
//	}
	
	public static void main(String[] args) {
		
		Employee employee1= new Employee(1, "raj", "IT", 45);
		System.gc();// it is not guranteed...
		
		// :)
		
		System.out.println("------------");
		
		
//		Employee employee2= new Employee(1, "umesh", "IT", 45);
//		//how framework works?
//		//What is Class class in java: it is used hold meta data of the class, java reflection*
//		
//		Class class1=employee1.getClass();
//		
//		Class class2=employee2.getClass();
		
		
		
//		HashSet<Employee> set=new HashSet<Employee>();//*
//		
//		set.add(new Employee(1, "raj", "IT", 45));
//		
//		System.out.println(set.contains(new Employee(1, "raj", "IT", 45)));
		
		
		
		
		//Why it is so imp to override both togater
		//HashMap , HashSet interally "hashing" concepts
		
		
		
//		Employee employee1= new Employee(1, "raj", "IT", 45);
//		
//		Employee employee2= new Employee(1, "raj", "IT", 45);
//		
//		if(employee1.equals(employee2)) {
//			System.out.println("objects are eq");
//		}else
//			System.out.println("not ...");
		
		//Rule : contract bw eq  and hashcode
		///if 2 obje are eq then hashcode must be same
		//if 2 object have same hashcode then they may be same or may not be same
//		System.out.println(employee1.hashCode());
//		System.out.println(employee2.hashCode());
//		
		
		//System.out.println(employee1==employee2);
//		System.out.println(employee1.hashCode());
//		System.out.println(employee2.hashCode());
//		
//		System.out.println(employee1.hashCode()==employee2.hashCode());
	}

}

//final int prime = 31;
//int result = 1;
//result = prime * result + ((dept == null) ? 0 : dept.hashCode());
//result = prime * result + id;
//result = prime * result + ((name == null) ? 0 : name.hashCode());
//long temp;
//temp = Double.doubleToLongBits(salary);
//result = prime * result + (int) (temp ^ (temp >>> 32));








