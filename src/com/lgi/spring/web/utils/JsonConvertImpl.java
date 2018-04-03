package com.lgi.spring.web.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

import com.lgi.spring.web.utils.interfaces.IJsonConvert;

public class JsonConvertImpl implements IJsonConvert {

	private final PropertiesFile properties = new PropertiesFile();
	private final ObjectMapper mapper = new ObjectMapper();
	private final File catalinaBase = new File(System.getProperty("catalina.base")).getAbsoluteFile();

	public JsonConvertImpl() {
	}

	@Override
	public File getLayoutFile(String propertyFile) throws IOException {
		File file = new File(catalinaBase, propertyFile);
		if (!file.exists())
			file.createNewFile();
		return file;
	}

	@Override
	public <T> void transfornObjectIntoJson(File jsonFile, List<T> listOfValues) {
		try {
			mapper.enable(SerializationConfig.Feature.INDENT_OUTPUT);
			mapper.writeValue(jsonFile, listOfValues);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getObjectFromJson(File jsonFile, T value) {
		try {
			return (T) mapper.readValue(jsonFile, value.getClass());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean containLines(File jsonFile) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(jsonFile));
		try (LineNumberReader lnr = new LineNumberReader(br)) {
			int lnum = 0;
			while (lnr.readLine() != null && (lnum = lnr.getLineNumber()) < 7) {
			}
			return lnum > 1 ? true : false;
		}
	}
}