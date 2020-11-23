package com.google.selenium.tets;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty {
	
	public static Properties userData = LoadProperty("E:\\New folder\\eclipce-workspace\\selenium.tets\\src\\main\\java\\register.properties");
	
	private static Properties LoadProperty(String path)
	{
	Properties pro = new Properties();
	
	try {
		FileInputStream stream = new FileInputStream(path);
		pro.load(stream);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return pro;
	
	
	}
	
	
	

}
