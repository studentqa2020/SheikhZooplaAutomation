package com.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ObjectMap {

	

		public String getconfig(String object) throws IOException {
			String file = "./config.properties";
			FileInputStream fis = new FileInputStream(file);//serilization
			
			Properties Properties = new Properties();
			Properties.load(fis);//Properties and serilization connect here
			Properties.getProperty(object);
			return Properties.getProperty(object);
			
		}

}