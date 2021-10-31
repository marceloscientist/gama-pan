package com.json.services;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONObject;


public class WriteJSON {

	public static void main(String[] args) throws FileNotFoundException {

				PrintWriter salvar = new PrintWriter("./src/main/java/test.json");
				JSONObject jo = new JSONObject();

				salvar.write("[");        
		        jo.put("name", "Marcelo");
		        jo.put("lastname", "Carvalho");
		        jo.put("age", "38");
				salvar.write(jo.toJSONString());
				salvar.write(",");
				jo.put("name", "Wendel");
				jo.put("lastname", "Diesel");
				jo.put("age", "23");
				salvar.write(jo.toJSONString());
				salvar.write("]");
				salvar.flush();
				salvar.close();
		    

	}

}
