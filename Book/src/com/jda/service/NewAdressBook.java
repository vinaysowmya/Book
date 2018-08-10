package com.jda.service;

import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.jda.model.Person;

public interface NewAdressBook {
	public void add() throws IOException;
	//public void read(String name) throws JsonParseException, JsonMappingException, IOException;
	public void save(String name) throws JsonGenerationException, JsonMappingException, IOException;
	public void rename() throws JsonGenerationException, JsonMappingException, IOException;

}
