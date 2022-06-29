package com.example.busticket.pojo;

import java.time.LocalDate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.busticket.pojo.BookingIdentity;

@Entity
@Table(name = "bookinginfo")
public class bookinginfo 
{
	@EmbeddedId
	private BookingIdentity bookingIdentity;
	private LocalDate dateofBooking;
	
	private int nooftickets;
	private String ticketid;
	private String status;

	public BookingIdentity getBookingIdentity() {
		return bookingIdentity;
	}
	public void setBookingIdentity(BookingIdentity bookingIdentity) {
		this.bookingIdentity = bookingIdentity;
	}
	public LocalDate getdateofBooking() {
		return dateofBooking;
	}
	public void setdateofBooking(LocalDate dateoftravel) {
		this.dateofBooking = dateoftravel;
	}
	public int getNooftickets() {
		return nooftickets;
	}
	public void setNooftickets(int nooftickets) {
		this.nooftickets = nooftickets;
	}
	public bookinginfo(BookingIdentity bookingIdentity, LocalDate dateofBooking, int nooftickets,String ticketid) {
		super();
		this.bookingIdentity = bookingIdentity;
		this.dateofBooking = dateofBooking;
		this.nooftickets = nooftickets;
		this.ticketid=ticketid;
	}
	public bookinginfo() {
		super();
	}
	public String getTicketid() {
		return ticketid;
	}
	public void setTicketid(String ticketid) {
		this.ticketid = ticketid;
	}
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}	
}
