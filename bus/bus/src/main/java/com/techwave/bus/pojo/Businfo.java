package com.techwave.bus.pojo;




public class Businfo {
	
	private int busid;
	private String type;

	private int regno;
	private Route routeid;
	private int price;
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
	public Businfo(int busid, String type, int regno, Route routeid, int price) {
		super();
		this.busid = busid;
		this.type = type;
		this.regno = regno;
		this.routeid = routeid;
		this.price = price;
	}
	public Businfo() {
		super();
	}	
}
