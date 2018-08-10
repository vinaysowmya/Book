package com.jda.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.impl.DefaultPrettyPrinter;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.type.TypeReference;

import Utility.utility;

import com.jda.model.Address;
import com.jda.model.Person;

public class AdressbookImplementation implements Addressbook {


//	Utility utility = new Utility();
	public static ArrayList<Person> list = new ArrayList<Person>();
	ObjectMapper mapper = new ObjectMapper();
	utility util=new utility();
	
	
	private Person create() {
		Person person = new Person();
		Address address = new Address(null,null,null);
		System.out.println("Enter  Name");
		person.setname(util.inputString());
	//	System.out.println(person.getname());
		System.out.println("Enter Initial");
		person.setinitial(util.inputString());
		System.out.println("Enter number");
		person.setno(util.inputString());
		System.out.println("Enter street");
		address.setstreet(util.inputString());
		System.out.println("Enter area");
		address.setarea(util.inputString());
		System.out.println("Enter pinCode");
		address.setpin(util.inputString());
		
		person.setAddress(address);
		return person;
	}

	
	public ArrayList<Person> add() {
            list.add(create());
            return list;
     

	}
	int found=0;

	@Override
	public void edit() {
		System.out.println("Enter  person ");
		String Name = util.inputString();
		int size=list.size();
		for(int i=0;i<size;i++)
		{
		Person p=list.get(i);
		if (Name.equals(list.get(i).getname())) {
				found++;
				System.out.println(p);
					edit(p);
				}
			}
		
		if (found == 0)
			System.out.println("Person does't exist");
	}
		private void edit(Person P){
		
		System.out.println("Enter the street");
		P.getAddress().setstreet(util.inputString());
		System.out.println("Enter the area");
		P.getAddress().setarea(util.inputString());
		System.out.println("Enter the pinCode");
		P.getAddress().setpin(util.inputString());
		System.out.println("Enter the new Phone Number");
		String phoneNumber = util.inputString();
		P.setno(phoneNumber);
		

	}


	@Override
	public void delete() {
		System.out.println("Enter name ");
		String name = util.inputString();
		int count = 0;
		ArrayList<Person> remove = new ArrayList<>();
		int size=list.size();
		//System.out.println(size);
		for(int i=0;i<size;i++)
		{
		Person p=list.get(i);
	//	System.out.println(p.getname());
			if (name.equals(p.getname())) {

				remove.add(p);
				count++;
				break;
			}
		}
		list.removeAll(remove);
		if (count == 0)
			System.out.println("Data not found");

	}
	public void sortByName() {
		Collections.sort(list, new SortByName());


	}

	public void sortByZip() {
		Collections.sort(list, new SortByZip());

	}

	public class SortByName implements Comparator<Person> {
		public int compare(Person personOne, Person personTwo) {
			if (personOne.getname().equals(personTwo.getname()))
				return 0;
			else {
				if (personOne.getname().compareTo(personTwo.getname()) > 0) {
					return 1;
				} else {
					return -1;
				}
			}
		}
	}

	public class SortByZip implements Comparator<Person> {
		public int compare(Person p1, Person p2) {
			if (p1.getAddress().getpin().equals(p2.getAddress().getpin()))
				return 0;
			else {
				if (p1.getAddress().getpin().compareTo( p2.getAddress().getpin())>0) {
					return 1;
				} else {
					return -1;
				}
			}
		}

	}
	public void print()
	{
		int size=list.size();
		for(int i=0;i<size;i++)
		{
		Person p=list.get(i);
			System.out.println(p.toString());
		}
	}
	public void save(String filename) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

		writer.writeValue(new File(filename + ".json"), list);

	}
	

	public void close(String filename) {
		list.clear();

	}

	public void saveAs(String newname) throws JsonGenerationException, JsonMappingException, IOException {
	
		save(newname);
		System.out.println("File renamed");

	}
	


}
