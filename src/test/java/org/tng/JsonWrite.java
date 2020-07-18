package org.tng;

import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWrite {
	
	public static void main(String[] args) throws Throwable {
		
		JSONObject detail=new JSONObject();
		detail.put("FirstName","Vishnu");
		detail.put("Age", "25");
		
		JSONObject emp1=new JSONObject();
		emp1.put("emp1", detail);
		
		JSONObject detail1=new JSONObject();
		detail1.put("FirstName","venkat");
		detail1.put("Age", "26");
		
		JSONObject emp2=new JSONObject();
		emp1.put("emp2", detail1);
		
		JSONArray ja=new JSONArray();
		ja.add(emp1);
		ja.add(emp2);
		
		FileWriter fa=new FileWriter("C:\\Users\\vishn\\eclipse-workspace\\MavenTestng\\data.json");
		fa.write(ja.toJSONString());
		fa.flush();
		
		
		
		
	}

}
