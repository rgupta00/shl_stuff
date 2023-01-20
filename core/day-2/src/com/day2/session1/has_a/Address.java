package com.day2.session1.has_a;

public class Address {
	private String addressLine;
	private String city;
	private String country;
	private String pinCode;
	
	public Address(String addressLine, String city, String country, String pinCode) {
		super();
		this.addressLine = addressLine;
		this.city = city;
		this.country = country;
		this.pinCode = pinCode;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	public void printAddress() {
		System.out.println("add: "+ addressLine+" city: "+ city+" country "+ country+" pin code "+ pinCode);
	}

}
