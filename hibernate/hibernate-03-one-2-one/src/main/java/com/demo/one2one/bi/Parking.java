package com.demo.one2one.bi;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


public class Parking {
	
	private int partingId;
	private String parkingLocation;

	private Employee employee;

	public Parking(String parkingLocation) {
		this.parkingLocation = parkingLocation;
	}
}
