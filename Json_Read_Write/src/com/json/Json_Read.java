package com.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

public class Json_Read {
	

			public static void main(String[] args) {
				
				JSONParser parser = new JSONParser();

				try(Reader reader = new FileReader("Jsonwrite.json")) {
					
					JSONObject jsonObject = (JSONObject) parser.parse(reader);
		            System.out.println(jsonObject);
			
					String name = (String) jsonObject.get("name");
					System.out.println("name :"+name);
					
					String Collage = (String) jsonObject.get("Collage");
					System.out.println("Collage :"+Collage);


					String Deparment = (String) jsonObject.get("Deparment");
					System.out.println("Deparment :"+Deparment);

					String Branch = (String) jsonObject.get("Branch");
					System.out.println("Branch :"+Branch);

					String year = (String) jsonObject.get("year");
					System.out.println("Year :"+year);
					

					JSONArray Sub = (JSONArray) jsonObject.get("Subjects");
					
					Iterator<String> iterator =  Sub.iterator();
					
					
					while (iterator.hasNext()) {
						System.out.println("subjects :"+iterator.next());
						
					}

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					e.printStackTrace();
				}
			

		}
	}


