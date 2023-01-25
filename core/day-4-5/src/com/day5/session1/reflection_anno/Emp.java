package com.day5.session1.reflection_anno;
interface Taxable{
	public void dedudeTax();
}
public class Emp implements Taxable{
	private int id;
	private String name;
	
	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emp [id=").append(id).append(", name=").append(name).append("]");
		return builder.toString();
	}

	@Override
	public void dedudeTax() {
		// TODO Auto-generated method stub
		
	}
	
	

}
