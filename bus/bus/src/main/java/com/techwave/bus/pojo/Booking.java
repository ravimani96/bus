package com.techwave.bus.pojo;

import java.time.LocalDate;

public class Booking
{
	private BookingIdentity bookingIdentity;
	private LocalDate dateoftravel;
	private int nooftickets;

	public BookingIdentity getBookingIdentity() {
		return bookingIdentity;
	}
	public void setBookingIdentity(BookingIdentity bookingIdentity) {
		this.bookingIdentity = bookingIdentity;
	}
	public LocalDate getDateoftravel() {
		return dateoftravel;
	}
	public void setDateoftravel(LocalDate dateoftravel) {
		this.dateoftravel = dateoftravel;
	}
	public int getNooftickets() {
		return nooftickets;
	}
	public void setNooftickets(int nooftickets) {
		this.nooftickets = nooftickets;
	}
	public Booking(BookingIdentity bookingIdentity, LocalDate dateoftravel, int nooftickets) {
		super();
		this.bookingIdentity = bookingIdentity;
		this.dateoftravel = dateoftravel;
		this.nooftickets = nooftickets;
	}
	public Booking() {
		super();
	}
	
}
