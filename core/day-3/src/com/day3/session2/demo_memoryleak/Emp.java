package com.day3.session2.demo_memoryleak;

public class Emp {
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
	
	

}
