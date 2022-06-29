package com.example.busticket.pojo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


//@Entity
//@Table(name = "availableinfo")
//public class Availability {
//	@EmbeddedId
//	AvailabilityIdentity availabilityIdentity;
//private int availabletickets;
//@Column(length = 10)
//private int capacity;
//	public AvailabilityIdentity getAvailabilityIdentity() {
//		return availabilityIdentity;
//	}
//
//	public void setAvailabilityIdentity(AvailabilityIdentity availabilityIdentity) {
//		this.availabilityIdentity = availabilityIdentity;
//	}
//
//	public int getCapacity() {
//		return capacity;
//	}
//
//	public void setCapacity(int capacity) {
//		this.capacity = capacity;
//	}
//
//	
//	
//	public int getAvailabletickets() {
//		return availabletickets;
//	}
//
//	public void setAvailabletickets(int availabletickets) {
//		this.availabletickets = availabletickets;
//	}
//
//	public Availability(AvailabilityIdentity availabilityIdentity, int availabletickets, int capacity) {
//		super();
//		this.availabilityIdentity = availabilityIdentity;
//		this.availabletickets = availabletickets;
//		this.capacity = capacity;
//	}
//
//	public Availability() {
//		super();
//	}
//
//	
//
//}
