package com.lgi.spring.web.dao.interfaces;

import java.util.List;

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

public interface IObjectIdeaDao {

	List<VLayoutObjectIdea> getIdeaLayout();
	
	List<VGelOdfCaInv> getGelInv();	
	List<VActionsOdfCaInv> getActionsInv();
	List<VStartOdfCaInv> getStartInv();
	List<VNotifOdfCaInv> getNotifInv();
	List<VPrePostOdfCaInv> getPrePostInv();
	List<VDetailsOdfCaInv> getDetailsInv();
	
	List<VGelOdfCaIdea> getGelIdea();
	List<VActionsOdfCaIdea> getActionsIdea();
	List<VStartOdfCaIdea> getStartIdea();
	List<VNotifOdfCaIdea> getNotifIdea();
	List<VPrePostOdfCaIdea> getPrePostIdea();
	List<VDetailsOdfCaIdea> getDetailsIdea();
}
