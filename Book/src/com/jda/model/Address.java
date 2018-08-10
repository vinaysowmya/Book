package com.jda.model;

public class Address {
	
	String area;
	String street;
	String pin;
	public Address(String street, String area, String pin)
	{
		
		this.street=street;
		this.area=area;
		this.pin=pin;
	}
	
	public void setstreet(String street)
	{
		this.street=street;
	}
	public void setarea(String area)
	{
		this.area=area;
	}
	public void setpin(String pin)
	{
		this.pin=pin;
	}
	
	public String getstreet()
	{
		return street;
	}
	public String getarea()
	{
		return area;
	}
	public String getpin()
	{
		return pin;
	}
	@Override
	public String toString() {
		return "\n { Street  : " + street + "\n  area : " + area + "\n  pin   : " + pin+"}" ;
	}

}
