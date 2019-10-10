package com.json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Json_Write {

		public static void main(String[] args) throws JSONException {
			
		JSONObject obj = new JSONObject();
		obj.put("name", "Rohan Sharma");
		obj.put("Collage", "COEP");
		obj.put("Deparment", "B.E");
		obj.put("Branch", "C.S");
		obj.put("year", "2nd year");
		
	ArrayList<String> al=new ArrayList<>();
	al.add("java");
	al.add("C++");
	
		JSONArray list = new JSONArray();
	
		list.put(al);
		
		obj.put("Subjects", list);

		try (FileWriter file = new FileWriter("Jsonwrite.json")) {
			 
			file.write(obj.toString());

			file.flush();

		}
		catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(obj);
		 
	}
		}

	



