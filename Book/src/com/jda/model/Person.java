package com.jda.model;

public class Person {
	String name;
	String no;
	String initial;
	Address address;;
	
	public void setname(String name)
	{
		this.name=name;
	}
	public void setno(String no)
	{
		this.no = no;
	}
	public void setinitial(String initial)
	{
		this.initial = initial;
	}
	public String getno()
	{
		return no;
	}
	public String getname()
	{
		return name;
	}
	public String getinitial()
	{
		return initial;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "{ Name : " + name + "\nInitial  : " + initial + "\nAddress  " + address + "\nPhone Number : "
				+ no + "}";
	}

}
