package com.lgi.spring.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgi.spring.web.dao.ObjetsPropersDAO;
import com.lgi.spring.web.entities.ObjectsPropers;

@Service("objetsPropersService")
public class ObjectsPropersService {

	private ObjetsPropersDAO opDao;
	
	@Autowired	
	public void setOpDao(ObjetsPropersDAO opDao) {
		this.opDao = opDao;
	}

	public List<ObjectsPropers> getAll(){
		return opDao.getAll();
	}
	
}
