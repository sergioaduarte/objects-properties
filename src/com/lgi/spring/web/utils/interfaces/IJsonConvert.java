package com.lgi.spring.web.utils.interfaces;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface IJsonConvert {

	File getLayoutFile(String propertyFile) throws IOException;
	<T> void transfornObjectIntoJson(File jsonFile,List<T> listOfValues);
	public <T> T getObjectFromJson(File jsonFile, T value);
	public boolean containLines(File jsonFile) throws IOException;
}
