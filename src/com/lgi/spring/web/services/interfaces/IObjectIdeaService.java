package com.lgi.spring.web.services.interfaces;

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

public interface IObjectIdeaService {

	List<VLayoutObjectIdea> getIdeaLayout();

	List<VGelOdfCaInv> getGelOdfCaInv();

	List<VGelOdfCaIdea> getGelOdfCaIdea();

	List<VGelOdfCaInv> getInfoForIdeaGel();

	List<VActionsOdfCaInv> getActionsOdfCaInv();

	List<VActionsOdfCaIdea> getActionsOdfCaIdea();

	List<VActionsOdfCaInv> getInfoForIdeaAction();

	List<VNotifOdfCaInv> getNotifOdfCaInv();

	List<VNotifOdfCaIdea> getNotifOdfCaIdea();

	List<VNotifOdfCaInv> getInfoForIdeaNotif();
	
	List<VPrePostOdfCaInv> getPrePostOdfCaInv();

	List<VPrePostOdfCaIdea> getPrePostOdfCaIdea();

	List<VPrePostOdfCaInv> getInfoForIdeaPrePost();
	
	List<VStartOdfCaInv> getStartOdfCaInv();

	List<VStartOdfCaIdea> getStartOdfCaIdea();

	List<VStartOdfCaInv> getInfoForIdeaStart();
	
	List<VDetailsOdfCaInv> getDetailsOdfCaInv();

	List<VDetailsOdfCaIdea> getDetailsOdfCaIdea();

	List<VDetailsOdfCaInv> getInfoForIdeaDetails();
}
