package com.lgi.spring.web.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

	private Properties properties;
	
	public PropertiesFile() {
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("com/lgi/spring/web/config/properties/utils.properties");
		this.properties = new Properties();
		try {
			this.properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getPropertyValue(String property) throws IOException {
		// get the value of the property
		return properties.getProperty(property);
	}

}
