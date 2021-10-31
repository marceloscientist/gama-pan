package com.json.services;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class ReadJSON {
	public static void main(String[] args) throws Exception 
    {

		JSONArray obj = (JSONArray) new JSONParser().parse(new FileReader("./src/main/java/test.json"));
		 
		  for (Object o : obj)
		  {
		    JSONObject person = (JSONObject) o;

		    String name = (String) person.get("name");
		    System.out.println(name);

		    String age = (String) person.get("age");
		    System.out.println(age);

		    String lastname = (String) person.get("lastname");
		    System.out.println(lastname);
		    

		  }

    }
}