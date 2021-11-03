package org.json.main;

import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
	public static void main(String[] args) {
		//JSONObjectToArray();
		JSONExampleArray1();
		//JSONExampleArray2();
		//JSONExampleStringer();
		//JSONExampleObject1();
		//JSONExampleObject2();
		//JSONExampleObject3();
		//JSONExamplWriter();
		//XMLToExampleConversion();
		//XMLFromExampleConversion();
		//CookieToExampleConversion();
		//CookieFromExampleConversion(); 
		//HTTPToExampleConversion();
		//HTTPFromExampleConversion();
		//CDLToExampleConversion();
		//CDLFromExampleConversion();
		//PropertyToExampleConversion();
		//PropertyFromExampleConversion();

	}
	
	/**
	 * 
	 * Ele cria um Objeto Json chave : valor através de dois arrays. 
	 * O primeiro array em formato de string que serão os valores do objeto JSON 
	 * E o outro array sendo os valores. 
	 *
	 */
	private static void JSONExampleArray1() {
		
		 String arrayStr = 
		            "["+"true,"+"false,"+ "\"true\","+ "\"false\","+"\"hello\","+"23.45e-4,"+
		                "\"23.45\","+"42,"+"\"43\","+"["+"\"world\""+"],"+
		            		"{"+
		                    "\"key1\":\"value1\","+
		                    "\"key2\":\"value2\","+
		                    "\"key3\":\"value3\","+
		                    "\"key4\":\"value4\""+
		                "},"+
		                "0,"+"\"-1\""+
		            "]";

		
		  JSONArray array = new JSONArray(arrayStr);
		  System.out.println("Values array: "+ array);

		
		  JSONArray list = listNumberArray(array.length());
		  System.out.println("Label Array: "+ list.toString());

		  JSONObject object = array.toJSONObject(list);
		  System.out.println("Final JSONOBject: " + object);
	}

	
	private static JSONArray listNumberArray(int max){
		 JSONArray res = new JSONArray();
		for (int i=0; i<max;i++) {
			res.put(String.valueOf(i));
		}
		return res;
	}
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	private static void JSONExampleArray2() {

		  JSONArray array = new JSONArray();
			array.put("value");
			array.put(5);
			array.put(-23.45e67);
			array.put(true);
		
		 JSONArray list = listNumberArray(array.length());
		 JSONObject object = array.toJSONObject(list);
		 System.out.println("Final JSONOBject: " + object);
	}

}
