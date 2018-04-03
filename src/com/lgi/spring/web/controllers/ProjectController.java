package com.lgi.spring.web.controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgi.spring.web.entities.ObjectsPropers;
import com.lgi.spring.web.services.ObjectsPropersService;

@Controller
public class ProjectController {

	private ObjectsPropersService objectsPropersService;
	private static Logger logger = Logger.getLogger(ProjectController.class);
	
	@Autowired	
	public void setObjectsPropersService(ObjectsPropersService objectsPropersService) {
		this.objectsPropersService = objectsPropersService;
	}

	@RequestMapping("/project")
	public String showProject(Model model) {
		logger.info("SHOWING DATA PROJECT");
		List<ObjectsPropers> objectsPropers = objectsPropersService.getAll();
		model.addAttribute("objectsPropers", objectsPropers);
		return "project";
	}
	
	@RequestMapping("/projectlayout")
	public String showProjectLayout(Model model) {
		logger.info("SHOWING DATA PROJECTLAYOUT");
		
		return "projectlayout";
	}
	
	
}
