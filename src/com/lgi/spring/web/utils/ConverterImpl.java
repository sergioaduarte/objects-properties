package com.lgi.spring.web.utils;

import java.util.function.Function;

import com.lgi.spring.web.entities.VActionsOdfCaIdea;
import com.lgi.spring.web.entities.VActionsOdfCaInv;
import com.lgi.spring.web.entities.VDetailsOdfCaIdea;
import com.lgi.spring.web.entities.VDetailsOdfCaInv;
import com.lgi.spring.web.entities.VGelOdfCaIdea;
import com.lgi.spring.web.entities.VGelOdfCaInv;
import com.lgi.spring.web.entities.VNotifOdfCaIdea;
import com.lgi.spring.web.entities.VNotifOdfCaInv;
import com.lgi.spring.web.entities.VPrePostOdfCaIdea;
import com.lgi.spring.web.entities.VPrePostOdfCaInv;
import com.lgi.spring.web.entities.VStartOdfCaIdea;
import com.lgi.spring.web.entities.VStartOdfCaInv;
import com.lgi.spring.web.utils.interfaces.IConverter;

public class ConverterImpl implements IConverter {

	Function<VGelOdfCaIdea, VGelOdfCaInv> convertGel = new Function<VGelOdfCaIdea, VGelOdfCaInv>() {
		public VGelOdfCaInv apply(VGelOdfCaIdea t) {
			VGelOdfCaInv gelOdfCaInv = new VGelOdfCaInv();
			gelOdfCaInv.setAction(t.getAction());
			gelOdfCaInv.setColumnId(t.getColumnId());
			gelOdfCaInv.setColumnName(t.getColumnName());
			gelOdfCaInv.setCreatedDate(t.getCreatedDate());
			gelOdfCaInv.setProcessCode(t.getProcessCode());
			gelOdfCaInv.setProcessName(t.getProcessName());
			gelOdfCaInv.setProcessStatus(t.getProcessStatus());
			gelOdfCaInv.setScriptText(t.getScriptText());
			gelOdfCaInv.setStep(t.getStep());
			gelOdfCaInv.setTableName(t.getTableName());
			return gelOdfCaInv;
		}
	};
	
	Function<VActionsOdfCaIdea, VActionsOdfCaInv> convertAction = new Function<VActionsOdfCaIdea, VActionsOdfCaInv>() {
		public VActionsOdfCaInv apply(VActionsOdfCaIdea t) {
			VActionsOdfCaInv actionsOdfCaInv = new VActionsOdfCaInv();
			actionsOdfCaInv.setAction(t.getAction());
			actionsOdfCaInv.setColumnId(t.getColumnId());
			actionsOdfCaInv.setColumnName(t.getColumnName());
			actionsOdfCaInv.setCreatedDate(t.getCreatedDate());
			actionsOdfCaInv.setProcessCode(t.getProcessCode());
			actionsOdfCaInv.setProcessName(t.getProcessName());
			actionsOdfCaInv.setProcessStatus(t.getProcessStatus());
			actionsOdfCaInv.setScriptText(t.getScriptText());
			actionsOdfCaInv.setStep(t.getStep());
			actionsOdfCaInv.setTableName(t.getTableName());
			return actionsOdfCaInv;
		}
	};
	
	Function<VNotifOdfCaIdea, VNotifOdfCaInv> convertNotif = new Function<VNotifOdfCaIdea, VNotifOdfCaInv>() {
		public VNotifOdfCaInv apply(VNotifOdfCaIdea t) {
			VNotifOdfCaInv notifOdfCaInv = new VNotifOdfCaInv();
			notifOdfCaInv.setAction(t.getAction());
			notifOdfCaInv.setColumnId(t.getColumnId());
			notifOdfCaInv.setColumnName(t.getColumnName());
			notifOdfCaInv.setCreatedDate(t.getCreatedDate());
			notifOdfCaInv.setProcessCode(t.getProcessCode());
			notifOdfCaInv.setProcessName(t.getProcessName());
			notifOdfCaInv.setProcessStatus(t.getProcessStatus());
			notifOdfCaInv.setScriptText(t.getScriptText());
			notifOdfCaInv.setStep(t.getStep());
			notifOdfCaInv.setTableName(t.getTableName());
			return notifOdfCaInv;
		}
	};

	Function<VPrePostOdfCaIdea, VPrePostOdfCaInv> convertPrePost = new Function<VPrePostOdfCaIdea, VPrePostOdfCaInv>() {
		public VPrePostOdfCaInv apply(VPrePostOdfCaIdea t) {
			VPrePostOdfCaInv prePostOdfCaInv = new VPrePostOdfCaInv();
			prePostOdfCaInv.setAction(t.getAction());
			prePostOdfCaInv.setColumnId(t.getColumnId());
			prePostOdfCaInv.setColumnName(t.getColumnName());
			prePostOdfCaInv.setCreatedDate(t.getCreatedDate());
			prePostOdfCaInv.setProcessCode(t.getProcessCode());
			prePostOdfCaInv.setProcessName(t.getProcessName());
			prePostOdfCaInv.setProcessStatus(t.getProcessStatus());
			prePostOdfCaInv.setScriptText(t.getScriptText());
			prePostOdfCaInv.setStep(t.getStep());
			prePostOdfCaInv.setTableName(t.getTableName());
			return prePostOdfCaInv;
		}
	};

	Function<VStartOdfCaIdea, VStartOdfCaInv> convertStart = new Function<VStartOdfCaIdea, VStartOdfCaInv>() {
		public VStartOdfCaInv apply(VStartOdfCaIdea t) {
			VStartOdfCaInv startOdfCaInv = new VStartOdfCaInv();
			startOdfCaInv.setColumnId(t.getColumnId());
			startOdfCaInv.setColumnName(t.getColumnName());
			startOdfCaInv.setProcessCode(t.getProcessCode());
			startOdfCaInv.setProcessName(t.getProcessName());
			startOdfCaInv.setScriptText(t.getScriptText());
			startOdfCaInv.setTableName(t.getTableName());
			startOdfCaInv.setTriggerOption(t.getTriggerOption());
			startOdfCaInv.setUserStatusCode(t.getUserStatusCode());
			return startOdfCaInv;
		}
	};
	
	Function<VDetailsOdfCaIdea, VDetailsOdfCaInv> convertDetails = new Function<VDetailsOdfCaIdea, VDetailsOdfCaInv>() {
		public VDetailsOdfCaInv apply(VDetailsOdfCaIdea t) {
			VDetailsOdfCaInv detailsOdfCaInv = new VDetailsOdfCaInv();
			detailsOdfCaInv.setColumnId(t.getColumnId());
			detailsOdfCaInv.setColumnName(t.getColumnName());
			detailsOdfCaInv.setTableName(t.getTableName());
			detailsOdfCaInv.setActions(t.getActions());
			detailsOdfCaInv.setDataDefault(t.getDataDefault());
			detailsOdfCaInv.setDataType(t.getDataType());
			detailsOdfCaInv.setDefaultLength(t.getDefaultLength());
			detailsOdfCaInv.setDisplayed(t.getDisplayed());
			detailsOdfCaInv.setGels(t.getGels());
			detailsOdfCaInv.setNotif(t.getNotif());
			detailsOdfCaInv.setNullable(t.getNullable());
			detailsOdfCaInv.setNumDistinct(t.getNumDistinct());
			detailsOdfCaInv.setOwner(t.getOwner());
			detailsOdfCaInv.setPrepost(t.getPrepost());
			detailsOdfCaInv.setStartop(t.getStartop());
			return detailsOdfCaInv;
		}
	};
	
	@Override
	public VGelOdfCaInv convertIntoGel(Object source) {
		if(source instanceof VGelOdfCaIdea)
			return convertGel.apply((VGelOdfCaIdea)source);
		return null;
	}

	@Override
	public VActionsOdfCaInv convertIntoActions(Object source) {
		if(source instanceof VActionsOdfCaIdea)
			return convertAction.apply((VActionsOdfCaIdea)source);
		return null;
	}

	@Override
	public VNotifOdfCaInv convertIntoNotif(Object source) {
		if(source instanceof VNotifOdfCaIdea)
			return convertNotif.apply((VNotifOdfCaIdea)source);
		return null;
	}

	@Override
	public VPrePostOdfCaInv convertIntoPrePost(Object source) {
		if(source instanceof VPrePostOdfCaIdea)
			return convertPrePost.apply((VPrePostOdfCaIdea)source);
		return null;
	}

	@Override
	public VStartOdfCaInv convertIntoStart(Object source) {
		if(source instanceof VStartOdfCaIdea)
			return convertStart.apply((VStartOdfCaIdea)source);
		return null;
	}

	@Override
	public VDetailsOdfCaInv convertIntoDetails(Object source) {
		if(source instanceof VDetailsOdfCaIdea)
			return convertDetails.apply((VDetailsOdfCaIdea)source);
		return null;
	}

}
