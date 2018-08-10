package com.jda.service;

import java.util.ArrayList;

import com.jda.model.Person;

public interface Addressbook {
	public ArrayList<Person> add();
	public void edit();
	public void delete();

}
