package com.lgi.spring.web.controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgi.spring.web.entities.VActionsOdfCaInv;
import com.lgi.spring.web.entities.VDetailsOdfCaInv;
import com.lgi.spring.web.entities.VGelOdfCaInv;
import com.lgi.spring.web.entities.VLayoutObjectIdea;
import com.lgi.spring.web.entities.VNotifOdfCaInv;
import com.lgi.spring.web.entities.VPrePostOdfCaInv;
import com.lgi.spring.web.entities.VStartOdfCaInv;
import com.lgi.spring.web.services.interfaces.IObjectIdeaService;

@Controller
public class IdeaController {

	private IObjectIdeaService objectIdeaService;
	private static Logger logger = Logger.getLogger(IdeaController.class);
	
	@Autowired	
	public void setObjectIdeaService(IObjectIdeaService objectIdeaService) {
		this.objectIdeaService = objectIdeaService;
	}

	@RequestMapping("/idea")
	public String showHome(Model model) {
		logger.info("SHOWING DATA");
		return "idea";
	}
	
	@RequestMapping("/idea/idealayout")
	public String showIdeaLayout(Model model) {
		logger.info("SHOWING DATA IDEALAYOUT");
		List<VLayoutObjectIdea> objectIdeas = objectIdeaService.getIdeaLayout();
		model.addAttribute("objectIdeas", objectIdeas);
		return "idealayout";
	}
	
	@RequestMapping("/idea/ideacustomize")
	public String showIdeaCustomize() {
		logger.info("SHOWING DATA IDEACUSTOMIZE");
		return "ideacustomize";
	}	
	
	@RequestMapping("/idea/customize/ideaactions")
	public String showIdeaCustomizeActions(Model model) {
		logger.info("SHOWING DATA IDEAACTIONS");
		List<VActionsOdfCaInv> actionsOdfCaInvs = objectIdeaService.getInfoForIdeaAction();
		model.addAttribute("ideasActions", actionsOdfCaInvs);
		return "ideaactions";
	}	
	
	@RequestMapping("/idea/customize/ideaconditions")
	public String showIdeaCustomizConditions(Model model) {
		logger.info("SHOWING DATA IDEACONDITIONS");
		List<VPrePostOdfCaInv> prePostOdfCaInvs = objectIdeaService.getInfoForIdeaPrePost();
		model.addAttribute("ideasconditions", prePostOdfCaInvs);
		return "ideaconditions";
	}	
	
	@RequestMapping("/idea/customize/ideadetails")
	public String showIdeaCustomizedetails(Model model) {
		logger.info("SHOWING DATA IDEADETAILS");
		List<VDetailsOdfCaInv> ideasDetails = objectIdeaService.getInfoForIdeaDetails();
		model.addAttribute("ideasdetails", ideasDetails);
		return "ideadetails";
	}	
	
	@RequestMapping("/idea/customize/ideagel")
	public String showIdeaCustomizeGel(Model model) {
		logger.info("SHOWING DATA IDEAGEL");
		List<VGelOdfCaInv> gelOdfCaInvs = objectIdeaService.getInfoForIdeaGel();
		model.addAttribute("ideasGel", gelOdfCaInvs);
		return "ideagel";
	}	
	
	@RequestMapping("/idea/customize/ideanotifications")
	public String showIdeaCustomizeNotifications(Model model) {
		logger.info("SHOWING DATA IDEANOTIFICATIONS");
		List<VNotifOdfCaInv> notifOdfCaInvs = objectIdeaService.getInfoForIdeaNotif();
		model.addAttribute("ideasnotifications", notifOdfCaInvs);
		return "ideanotifications";
	}	
	
	@RequestMapping("/idea/customize/ideastart")
	public String showIdeaCustomizeStart(Model model) {
		logger.info("SHOWING DATA IDEASTART");
		List<VStartOdfCaInv> startOdfCaInvs = objectIdeaService.getInfoForIdeaStart();
		model.addAttribute("ideasstart", startOdfCaInvs);
		return "ideastart";
	}	
}
