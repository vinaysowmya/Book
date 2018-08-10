package com.jda.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import Utility.utility;

import com.jda.model.Person;

public  class NewAdressBookImplementation implements NewAdressBook{


	
	utility util=new utility();
		// TODO Auto-generated method stub
		public void add() throws IOException {
			System.out.println("Enter new Address Book");
			String name = util.inputString();

			File file = new File(name + ".json");
			//file.createNewFile();
			
			if (!file.createNewFile())
			{
				System.out.println("exists");
			}
		}



		public void save(String filename) throws JsonGenerationException, JsonMappingException, IOException {
			AdressbookImplementation address = new AdressbookImplementation();
			address.save(filename);

		}

		public void rename() throws JsonGenerationException, JsonMappingException, IOException {
			System.out.println("Enter the new name");
			String filename=util.inputString();
			AdressbookImplementation address = new AdressbookImplementation();
			address.saveAs(filename);
		}

		
		
		
		

}
