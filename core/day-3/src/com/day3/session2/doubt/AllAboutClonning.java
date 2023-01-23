package com.day3.session2.doubt;
//class Employee--> object 
//clonning is a process of making duplicate copy of the objeect
//marker interface 
class Emp  implements Cloneable {
	private int id;
	private String name;
	private String dept;
	private double salary;
	
	public Emp(int id, String name, String dept, double salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

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
		builder.append("Emp [id=").append(id).append(", name=").append(name).append(", dept=").append(dept)
				.append(", salary=").append(salary).append("]");
		return builder.toString();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}



	
}
public class AllAboutClonning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Emp e=new Emp(1, "raj", "Sales", 56);
		//make a copy of it, clonning
		System.out.println(e.hashCode());
		Emp e2=(Emp) e.clone();
		System.out.println(e2.hashCode());
		System.out.println(e2);
	}

}












