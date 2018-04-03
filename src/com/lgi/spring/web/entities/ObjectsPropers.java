package com.lgi.spring.web.entities;

public class ObjectsPropers {

	private String code;
	private String name;
	
	public ObjectsPropers(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public ObjectsPropers() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ObjectsPropers [code=" + code + ", name=" + name + "]";
	}	
}
