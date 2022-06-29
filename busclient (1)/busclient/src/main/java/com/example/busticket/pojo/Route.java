package com.example.busticket.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="routeinfo")
public class Route 
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int routeid;
	@Column(length=25)
private String fromplace;
private String toplace;

public int getRouteid() 
{
	return routeid;
}

public void setRouteid(int routeid)
{
	this.routeid = routeid;
}

public String getFromplace() 
{
	return fromplace;
}

public void setFromplace(String fromplace)
{
	this.fromplace = fromplace;
}

public String getToplace() 
{
	return toplace;
}

public void setToplace(String toplace) 
{
	this.toplace = toplace;
}

public Route(int routeid, String fromplace, String toplace) 
{
	super();
	this.routeid = routeid;
	this.fromplace = fromplace;
	this.toplace = toplace;
}

public Route() 
{
	super();
}
















}
