package com.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Json_Write {

		public static void main(String[] args)  {
			
		JSONObject obj = new JSONObject();
		obj.put("name", "Kalyani Jumade");
		obj.put("Collage", "BCOE");
		obj.put("Deparment", "B.E");
		obj.put("Branch", "C.S");
		obj.put("year", "2015");
		
	ArrayList<String> al=new ArrayList<>();
	al.add("java");
	al.add("C++");
	
		JSONArray list = new JSONArray();
	
		list.add(al);
		
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

	



