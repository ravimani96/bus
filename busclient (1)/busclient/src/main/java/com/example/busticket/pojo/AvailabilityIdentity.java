package com.example.busticket.pojo;

import java.io.Serializable;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

//@Embeddable
//public class AvailabilityIdentity implements Serializable {
//	
//	@ManyToOne
//	private Businfo businfo;
//	private LocalDate journeydate;
//	
//	@Override
//	public int hashCode() {
//		return Objects.hash(businfo, journeydate);
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		AvailabilityIdentity other = (AvailabilityIdentity) obj;
//		return Objects.equals(businfo, other.businfo) && Objects.equals(journeydate, other.journeydate);
//	}
//	
//
//	public Businfo getBusinfo() {
//		return businfo;
//	}
//	public void setBusinfo(Businfo businfo) {
//		this.businfo = businfo;
//	}
//	public LocalDate getJourneydate() {
//		return journeydate;
//	}
//	public void setJourneydate(LocalDate journeydate) {
//		this.journeydate = journeydate;
//	}
//	public AvailabilityIdentity(Businfo businfo, LocalDate journeydate) {
//		super();
//		this.businfo = businfo;
//		this.journeydate = journeydate;
//	}
//	public AvailabilityIdentity() {
//		super();
//	}
//	
//
//}
