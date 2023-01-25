package com.day5.session1.demo_generics;

public class Product implements Comparable<Product>{
	private int id;
	private String name;
	
	public Product(int id, String name) {
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
	public int compareTo(Product o) {
		return Integer.compare(this.getId(), o.getId());
	}
	
	

}
