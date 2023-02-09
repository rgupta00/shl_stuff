package com.employee.dto;

public class CustomerDto {
	private Integer customerId;

	private String customerName;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public CustomerDto() {
	}

	public CustomerDto(String customerName) {
		this.customerName = customerName;
	}

	public CustomerDto(Integer customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}

	// getter and setter methods

}