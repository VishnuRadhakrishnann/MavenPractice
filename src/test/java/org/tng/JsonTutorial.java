package org.tng;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonTutorial {
	public static void main(String[] args) throws Throwable {
		
		JSONParser parser=new JSONParser();
		FileReader f=new FileReader("C:\\Users\\vishn\\eclipse-workspace\\MavenTestng\\data.json");
		
		Object ob = parser.parse(f);
		
		JsonPojo jp=new JsonPojo();
		JSONObject j=(JSONObject)ob;
		 String s1 = j.get("name").toString();
		 jp.setName(s1);
		 String s2 = j.get("age").toString();
		 int i = Integer.parseInt(s2);
		 jp.setAge(i);
		 String s3 = j.get("username").toString();
		 jp.setUsername(s3);
		 String s4 = j.get("mobno").toString();
		 Long lo = Long.valueOf(s4);
		 jp.setMobno(lo);
		 
		 System.out.println(jp.getName());
		 System.out.println(jp.getAge());
		 System.out.println(jp.getUsername());
		 System.out.println(jp.getMobno());
		 
		
		
	
		
		
	}
	

}
