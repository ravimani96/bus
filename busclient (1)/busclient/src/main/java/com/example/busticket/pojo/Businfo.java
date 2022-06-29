package com.example.busticket.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="businfo")
public class Businfo implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int busid;
	@Column(length=25)
	private String type;

	private int regno;
	@OneToOne
	private Route routeid;
	private int price;
	private int availabletickets;
	private int capacity;

	public int getAvailabletickets() {
		return availabletickets;
	}
	public void setAvailabletickets(int availabletickets) {
		this.availabletickets = availabletickets;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getBusid() {
		return busid;
	}
	public void setBusid(int busid) {
		this.busid = busid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	
	public Route getRouteid() {
		return routeid;
	}
	public void setRouteid(Route routeid) {
		this.routeid = routeid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Businfo() {
		super();
	}
	public Businfo(int busid, String type, int regno, Route routeid, int price, int availabletickets, int capacity) {
		super();
		this.busid = busid;
		this.type = type;
		this.regno = regno;
		this.routeid = routeid;
		this.price = price;
		this.availabletickets = availabletickets;
		this.capacity = capacity;
	}	
}
