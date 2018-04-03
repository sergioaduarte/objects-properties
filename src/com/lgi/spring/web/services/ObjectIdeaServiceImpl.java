package com.lgi.spring.web.services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgi.spring.web.dao.ObjectIdeaDaoImpl;
import com.lgi.spring.web.dao.interfaces.IObjectIdeaDao;
import com.lgi.spring.web.entities.VActionsOdfCaIdea;
import com.lgi.spring.web.entities.VActionsOdfCaInv;
import com.lgi.spring.web.entities.VDetailsOdfCaIdea;
import com.lgi.spring.web.entities.VDetailsOdfCaInv;
import com.lgi.spring.web.entities.VGelOdfCaIdea;
import com.lgi.spring.web.entities.VGelOdfCaInv;
import com.lgi.spring.web.entities.VLayoutObjectIdea;
import com.lgi.spring.web.entities.VNotifOdfCaIdea;
import com.lgi.spring.web.entities.VNotifOdfCaInv;
import com.lgi.spring.web.entities.VPrePostOdfCaIdea;
import com.lgi.spring.web.entities.VPrePostOdfCaInv;
import com.lgi.spring.web.entities.VStartOdfCaIdea;
import com.lgi.spring.web.entities.VStartOdfCaInv;
import com.lgi.spring.web.services.interfaces.IObjectIdeaService;
import com.lgi.spring.web.utils.ConverterImpl;
import com.lgi.spring.web.utils.JsonConvertImpl;
import com.lgi.spring.web.utils.PropertiesFile;

@Service("objectIdeaService")
public class ObjectIdeaServiceImpl implements IObjectIdeaService{

	private IObjectIdeaDao oIDao;
	private final PropertiesFile properties = new PropertiesFile();
	private static Logger logger = Logger.getLogger(ObjectIdeaDaoImpl.class);
	
	@Autowired	
	public void setOpDao(IObjectIdeaDao oIDao) {
		this.oIDao = oIDao;
	}

	@Override
	public List<VLayoutObjectIdea> getIdeaLayout() {
		logger.info("Start getIdeaLayout()");
		JsonConvertImpl jsonConvert = new JsonConvertImpl();
		List<VLayoutObjectIdea> result = new ArrayList<VLayoutObjectIdea>();
		
		try {
			File layoutFile = jsonConvert.getLayoutFile(properties.getPropertyValue("json.file.path.idea.layout"));
			if(jsonConvert.containLines(layoutFile))
				result = jsonConvert.getObjectFromJson(layoutFile, result);
			else {
				result = oIDao.getIdeaLayout();
				jsonConvert.transfornObjectIntoJson(layoutFile, result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<VGelOdfCaInv> getGelOdfCaInv() {
		logger.info("Start getGelOdfCaInv()");
		JsonConvertImpl jsonConvert = new JsonConvertImpl();
		List<VGelOdfCaInv> result = new ArrayList<VGelOdfCaInv>();
		
		try {
			File layoutFile = jsonConvert.getLayoutFile(properties.getPropertyValue("json.file.path.idea.customize.odf.inv.gel"));
			if(jsonConvert.containLines(layoutFile))
				result = jsonConvert.getObjectFromJson(layoutFile, result);
			else {
				result = oIDao.getGelInv();
				jsonConvert.transfornObjectIntoJson(layoutFile, result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<VGelOdfCaIdea> getGelOdfCaIdea() {
		logger.info("Start getGelOdfCaInv()");
		JsonConvertImpl jsonConvert = new JsonConvertImpl();
		List<VGelOdfCaIdea> result = new ArrayList<VGelOdfCaIdea>();
		
		try {
			File layoutFile = jsonConvert.getLayoutFile(properties.getPropertyValue("json.file.path.idea.customize.odf.idea.gel"));
			if(jsonConvert.containLines(layoutFile))
				result = jsonConvert.getObjectFromJson(layoutFile, result);
			else {
				result = oIDao.getGelIdea();
				jsonConvert.transfornObjectIntoJson(layoutFile, result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<VGelOdfCaInv> getInfoForIdeaGel() {
		List<VGelOdfCaIdea> gelOdfCaIdeas = getGelOdfCaIdea();
		List<VGelOdfCaInv> gelOdfCaInvs = getGelOdfCaInv();
		
		for (VGelOdfCaIdea vGelOdfCaIdea : gelOdfCaIdeas) {
			gelOdfCaInvs.add(new ConverterImpl().convertIntoGel(vGelOdfCaIdea));
		}
		return gelOdfCaInvs;
	}

	@Override
	public List<VActionsOdfCaInv> getActionsOdfCaInv() {
		logger.info("Start getActionsOdfCaInv()");
		JsonConvertImpl jsonConvert = new JsonConvertImpl();
		List<VActionsOdfCaInv> result = new ArrayList<VActionsOdfCaInv>();
		
		try {
			File layoutFile = jsonConvert.getLayoutFile(properties.getPropertyValue("json.file.path.idea.customize.odf.inv.action"));
			if(jsonConvert.containLines(layoutFile))
				result = jsonConvert.getObjectFromJson(layoutFile, result);
			else {
				result = oIDao.getActionsInv();
				jsonConvert.transfornObjectIntoJson(layoutFile, result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<VActionsOdfCaIdea> getActionsOdfCaIdea() {
		logger.info("Start getActionsOdfCaIdea()");
		JsonConvertImpl jsonConvert = new JsonConvertImpl();
		List<VActionsOdfCaIdea> result = new ArrayList<VActionsOdfCaIdea>();
		
		try {
			File layoutFile = jsonConvert.getLayoutFile(properties.getPropertyValue("json.file.path.idea.customize.odf.idea.action"));
			if(jsonConvert.containLines(layoutFile))
				result = jsonConvert.getObjectFromJson(layoutFile, result);
			else {
				result = oIDao.getActionsIdea();
				jsonConvert.transfornObjectIntoJson(layoutFile, result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<VActionsOdfCaInv> getInfoForIdeaAction() {
		List<VActionsOdfCaIdea> actionsOdfCaIdeas = getActionsOdfCaIdea();
		List<VActionsOdfCaInv> actionsOdfCaInvs = getActionsOdfCaInv();
		
		for (VActionsOdfCaIdea vActionsOdfCaIdea : actionsOdfCaIdeas) {
			actionsOdfCaInvs.add(new ConverterImpl().convertIntoActions(vActionsOdfCaIdea));
		}
		return actionsOdfCaInvs;
	}

	@Override
	public List<VNotifOdfCaInv> getNotifOdfCaInv() {
		logger.info("Start getNotifOdfCaInv()");
		JsonConvertImpl jsonConvert = new JsonConvertImpl();
		List<VNotifOdfCaInv> result = new ArrayList<VNotifOdfCaInv>();
		
		try {
			File layoutFile = jsonConvert.getLayoutFile(properties.getPropertyValue("json.file.path.idea.customize.odf.inv.notification"));
			if(jsonConvert.containLines(layoutFile))
				result = jsonConvert.getObjectFromJson(layoutFile, result);
			else {
				result = oIDao.getNotifInv();
				jsonConvert.transfornObjectIntoJson(layoutFile, result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<VNotifOdfCaIdea> getNotifOdfCaIdea() {
		logger.info("Start getNotifOdfCaIdea()");
		JsonConvertImpl jsonConvert = new JsonConvertImpl();
		List<VNotifOdfCaIdea> result = new ArrayList<VNotifOdfCaIdea>();
		
		try {
			File layoutFile = jsonConvert.getLayoutFile(properties.getPropertyValue("json.file.path.idea.customize.odf.idea.notification"));
			if(jsonConvert.containLines(layoutFile))
				result = jsonConvert.getObjectFromJson(layoutFile, result);
			else {
				result = oIDao.getNotifIdea();
				jsonConvert.transfornObjectIntoJson(layoutFile, result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<VNotifOdfCaInv> getInfoForIdeaNotif() {
		List<VNotifOdfCaIdea> notifOdfCaIdeas = getNotifOdfCaIdea();
		List<VNotifOdfCaInv> notifOdfCaInvs = getNotifOdfCaInv();
		
		for (VNotifOdfCaIdea vNotifOdfCaIdea : notifOdfCaIdeas) {
			notifOdfCaInvs.add(new ConverterImpl().convertIntoNotif(vNotifOdfCaIdea));
		}
		return notifOdfCaInvs;
	}

	@Override
	public List<VPrePostOdfCaInv> getPrePostOdfCaInv() {
		logger.info("Start getPrePostOdfCaInv()");
		JsonConvertImpl jsonConvert = new JsonConvertImpl();
		List<VPrePostOdfCaInv> result = new ArrayList<VPrePostOdfCaInv>();
		
		try {
			File layoutFile = jsonConvert.getLayoutFile(properties.getPropertyValue("json.file.path.idea.customize.odf.inv.prepost"));
			if(jsonConvert.containLines(layoutFile))
				result = jsonConvert.getObjectFromJson(layoutFile, result);
			else {
				result = oIDao.getPrePostInv();
				jsonConvert.transfornObjectIntoJson(layoutFile, result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<VPrePostOdfCaIdea> getPrePostOdfCaIdea() {
		logger.info("Start getPrePostOdfCaIdea()");
		JsonConvertImpl jsonConvert = new JsonConvertImpl();
		List<VPrePostOdfCaIdea> result = new ArrayList<VPrePostOdfCaIdea>();
		
		try {
			File layoutFile = jsonConvert.getLayoutFile(properties.getPropertyValue("json.file.path.idea.customize.odf.idea.prepost"));
			if(jsonConvert.containLines(layoutFile))
				result = jsonConvert.getObjectFromJson(layoutFile, result);
			else {
				result = oIDao.getPrePostIdea();
				jsonConvert.transfornObjectIntoJson(layoutFile, result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<VPrePostOdfCaInv> getInfoForIdeaPrePost() {
		List<VPrePostOdfCaIdea> prePostOdfCaIdeas = getPrePostOdfCaIdea();
		List<VPrePostOdfCaInv> prePostOdfCaInvs = getPrePostOdfCaInv();
		
		for (VPrePostOdfCaIdea vPrePostOdfCaIdea : prePostOdfCaIdeas) {
			prePostOdfCaInvs.add(new ConverterImpl().convertIntoPrePost(vPrePostOdfCaIdea));
		}
		return prePostOdfCaInvs;
	}

	@Override
	public List<VStartOdfCaInv> getStartOdfCaInv() {
		logger.info("Start getStartOdfCaInv()");
		JsonConvertImpl jsonConvert = new JsonConvertImpl();
		List<VStartOdfCaInv> result = new ArrayList<VStartOdfCaInv>();
		
		try {
			File layoutFile = jsonConvert.getLayoutFile(properties.getPropertyValue("json.file.path.idea.customize.odf.inv.start"));
			if(jsonConvert.containLines(layoutFile))
				result = jsonConvert.getObjectFromJson(layoutFile, result);
			else {
				result = oIDao.getStartInv();
				jsonConvert.transfornObjectIntoJson(layoutFile, result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<VStartOdfCaIdea> getStartOdfCaIdea() {
		logger.info("Start getStartOdfCaIdea()");
		JsonConvertImpl jsonConvert = new JsonConvertImpl();
		List<VStartOdfCaIdea> result = new ArrayList<VStartOdfCaIdea>();
		
		try {
			File layoutFile = jsonConvert.getLayoutFile(properties.getPropertyValue("json.file.path.idea.customize.odf.idea.start"));
			if(jsonConvert.containLines(layoutFile))
				result = jsonConvert.getObjectFromJson(layoutFile, result);
			else {
				result = oIDao.getStartIdea();
				jsonConvert.transfornObjectIntoJson(layoutFile, result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<VStartOdfCaInv> getInfoForIdeaStart() {
		List<VStartOdfCaIdea> startOdfCaIdeas = getStartOdfCaIdea();
		List<VStartOdfCaInv> startOdfCaInvs = getStartOdfCaInv();
		
		for (VStartOdfCaIdea vStartOdfCaIdea : startOdfCaIdeas) {
			startOdfCaInvs.add(new ConverterImpl().convertIntoStart(vStartOdfCaIdea));
		}
		return startOdfCaInvs;
	}

	@Override
	public List<VDetailsOdfCaInv> getDetailsOdfCaInv() {
		logger.info("Start getDetailsOdfCaInv()");
		JsonConvertImpl jsonConvert = new JsonConvertImpl();
		List<VDetailsOdfCaInv> result = new ArrayList<VDetailsOdfCaInv>();
		
		try {
			File layoutFile = jsonConvert.getLayoutFile(properties.getPropertyValue("json.file.path.idea.customize.odf.inv.details"));
			if(jsonConvert.containLines(layoutFile))
				result = jsonConvert.getObjectFromJson(layoutFile, result);
			else {
				result = oIDao.getDetailsInv();
				jsonConvert.transfornObjectIntoJson(layoutFile, result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<VDetailsOdfCaIdea> getDetailsOdfCaIdea() {
		logger.info("Start getDetailsOdfCaIdea()");
		JsonConvertImpl jsonConvert = new JsonConvertImpl();
		List<VDetailsOdfCaIdea> result = new ArrayList<VDetailsOdfCaIdea>();
		
		try {
			File layoutFile = jsonConvert.getLayoutFile(properties.getPropertyValue("json.file.path.idea.customize.odf.idea.details"));
			if(jsonConvert.containLines(layoutFile))
				result = jsonConvert.getObjectFromJson(layoutFile, result);
			else {
				result = oIDao.getDetailsIdea();
				jsonConvert.transfornObjectIntoJson(layoutFile, result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<VDetailsOdfCaInv> getInfoForIdeaDetails() {
		List<VDetailsOdfCaIdea> detailsOdfCaIdeas = getDetailsOdfCaIdea();
		List<VDetailsOdfCaInv> detailsOdfCaInvs = getDetailsOdfCaInv();
		
		for (VDetailsOdfCaIdea vStartOdfCaIdea : detailsOdfCaIdeas) {
			detailsOdfCaInvs.add(new ConverterImpl().convertIntoDetails(vStartOdfCaIdea));
		}
		return detailsOdfCaInvs;
	}
}