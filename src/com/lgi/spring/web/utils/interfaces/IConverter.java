package com.lgi.spring.web.utils.interfaces;

import com.lgi.spring.web.entities.VActionsOdfCaInv;
import com.lgi.spring.web.entities.VDetailsOdfCaInv;
import com.lgi.spring.web.entities.VGelOdfCaInv;
import com.lgi.spring.web.entities.VNotifOdfCaInv;
import com.lgi.spring.web.entities.VPrePostOdfCaInv;
import com.lgi.spring.web.entities.VStartOdfCaInv;

public interface IConverter {

	VGelOdfCaInv convertIntoGel(Object source);
	VActionsOdfCaInv convertIntoActions(Object source);
	VNotifOdfCaInv convertIntoNotif(Object source);
	VPrePostOdfCaInv convertIntoPrePost(Object source);
	VStartOdfCaInv convertIntoStart(Object source);
	VDetailsOdfCaInv convertIntoDetails(Object source);
}
