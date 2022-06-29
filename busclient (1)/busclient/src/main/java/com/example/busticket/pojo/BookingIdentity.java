package com.example.busticket.pojo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;


@Embeddable
public class BookingIdentity implements Serializable 
{	
	private  int busid;
	private	int custid;
	private LocalDate dateoftravel;
	
	public BookingIdentity(int busid, int custid, LocalDate dateoftravel) {
		super();
		this.busid = busid;
		this.custid = custid;
		this.dateoftravel = dateoftravel;
	}
	public BookingIdentity() {
		super();
	}
	public int getBusid() {
		return busid;
	}
	public void setBusid(int busid) {
		this.busid = busid;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public LocalDate getDateoftravel() {
		return dateoftravel;
	}
	public void setDateoftravel(LocalDate dateoftravel) {
		this.dateoftravel = dateoftravel;
	}
	@Override
	public int hashCode() {
		return Objects.hash(busid, custid, dateoftravel);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingIdentity other = (BookingIdentity) obj;
		return busid == other.busid && custid == other.custid && Objects.equals(dateoftravel, other.dateoftravel);
	}
}
