package com.techwave.bus.pojo;

import java.time.LocalDate;

public class BookingIdentity 
{
		
	private Businfo busid;
		
	private	CustomerRegistration custid;
	private LocalDate dateofbooking;
	
	public Businfo getBusid() {
		return busid;
	}
	public void setBusid(Businfo busid) {
		this.busid = busid;
	}
	public CustomerRegistration getCustid() {
		return custid;
	}
	public void setCustid(CustomerRegistration custid) {
		this.custid = custid;
	}
	public LocalDate getDateofbooking() {
		return dateofbooking;
	}
	public void setDateofbooking(LocalDate dateofbooking) {
		this.dateofbooking = dateofbooking;
	}
	public BookingIdentity(Businfo busid, CustomerRegistration custid, LocalDate dateofbooking) {
		super();
		this.busid = busid;
		this.custid = custid;
		this.dateofbooking = dateofbooking;
	}
	public BookingIdentity() {
		super();
	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(busid, custid, dateofbooking);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		BookingIdentity other = (BookingIdentity) obj;
//		return Objects.equals(busid, other.busid) && Objects.equals(custid, other.custid)
//				&& Objects.equals(dateofbooking, other.dateofbooking);
//	}

}
