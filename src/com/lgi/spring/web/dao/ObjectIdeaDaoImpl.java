package com.lgi.spring.web.dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lgi.spring.web.dao.interfaces.IObjectIdeaDao;
import com.lgi.spring.web.dao.rowmapper.objectIdea.VActionsOdfCaIdeaRowMapper;
import com.lgi.spring.web.dao.rowmapper.objectIdea.VDetailsOdfCaIdeaRowMapper;
import com.lgi.spring.web.dao.rowmapper.objectIdea.VGelOdfCaIdeaRowMapper;
import com.lgi.spring.web.dao.rowmapper.objectIdea.VLayoutObjectIdeaRowMapper;
import com.lgi.spring.web.dao.rowmapper.objectIdea.VNotifOdfCaIdeaRowMapper;
import com.lgi.spring.web.dao.rowmapper.objectIdea.VPrePostOdfCaIdeaRowMapper;
import com.lgi.spring.web.dao.rowmapper.objectIdea.VStartOdfCaIdeaRowMapper;
import com.lgi.spring.web.dao.rowmapper.objectInvestment.VActionsOdfCaInvRowMapper;
import com.lgi.spring.web.dao.rowmapper.objectInvestment.VDetailsOdfCaInvRowMapper;
import com.lgi.spring.web.dao.rowmapper.objectInvestment.VGelOdfCaInvRowMapper;
import com.lgi.spring.web.dao.rowmapper.objectInvestment.VNotifOdfCaInvRowMapper;
import com.lgi.spring.web.dao.rowmapper.objectInvestment.VPrePostOdfCaInvRowMapper;
import com.lgi.spring.web.dao.rowmapper.objectInvestment.VStartOdfCaInvRowMapper;
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

@Repository
@Transactional
public class ObjectIdeaDaoImpl implements IObjectIdeaDao{

	private NamedParameterJdbcTemplate jdbc;
	private static Logger logger = Logger.getLogger(ObjectIdeaDaoImpl.class);
	
	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}
	
	@Override
	public List<VLayoutObjectIdea> getIdeaLayout() {
		logger.info("Getting all information for Idea Layout");
		return jdbc.query("select SUBPAGE,OBJECT,SECTION,FIELD_NAME,COLUMN_POSITION,CLARITY_FIELD_TYPE,DATA_TYPE,DISPLAY_TYPE,IS_VALUE_REQUIRED,IS_READ_ONLY,HAS_DEFAULT,TABLE_NAME,COLUMN_NAME,TECHNICAL_PARTITION,DEFAULT_VALUE,NULLABLE,NUM_NULLS,NUM_DISTINCT from V_LAYOUT_OBJECT_IDEA", new VLayoutObjectIdeaRowMapper());
	}

	@Override
	public List<VGelOdfCaInv> getGelInv() {
		logger.info("Getting GEL information for Ideas using ODF_CA_INV");
		return jdbc.query("select * from V_GEL_ODF_CA_INV", new VGelOdfCaInvRowMapper());
	}

	@Override
	public List<VActionsOdfCaInv> getActionsInv() {
		logger.info("Getting Actions information for Ideas using ODF_CA_INV");
		return jdbc.query("select * from V_ACTIONS_ODF_CA_INV", new VActionsOdfCaInvRowMapper());
	}

	@Override
	public List<VStartOdfCaInv> getStartInv() {
		logger.info("Getting Start information for Ideas using ODF_CA_INV");
		return jdbc.query("select * from V_START_ODF_CA_INV", new VStartOdfCaInvRowMapper());
	}

	@Override
	public List<VNotifOdfCaInv> getNotifInv() {
		logger.info("Getting Notification information for Ideas using ODF_CA_INV");
		return jdbc.query("select * from V_NOTIF_ODF_CA_INV", new VNotifOdfCaInvRowMapper());
	}

	@Override
	public List<VPrePostOdfCaInv> getPrePostInv() {
		logger.info("Getting PRE or POST information for Ideas using ODF_CA_INV");
		return jdbc.query("select * from V_PRE_POST_ODF_CA_INV", new VPrePostOdfCaInvRowMapper());
	}

	@Override
	public List<VDetailsOdfCaInv> getDetailsInv() {
		logger.info("Getting DETAILS information for Ideas using ODF_CA_INV");
		return jdbc.query("select * from V_DETAILS_ODF_CA_INV", new VDetailsOdfCaInvRowMapper());
	}
	
	@Override
	public List<VGelOdfCaIdea> getGelIdea() {
		logger.info("Getting GEL information for Ideas using ODF_CA_IDEA");
		return jdbc.query("select * from V_GEL_ODF_CA_IDEA", new VGelOdfCaIdeaRowMapper());
	}
	
	@Override
	public List<VActionsOdfCaIdea> getActionsIdea() {
		logger.info("Getting Actions information for Ideas using ODF_CA_IDEA");
		return jdbc.query("select * from V_ACTIONS_ODF_CA_IDEA", new VActionsOdfCaIdeaRowMapper());
	}

	@Override
	public List<VStartOdfCaIdea> getStartIdea() {
		logger.info("Getting Actions information for Ideas using ODF_CA_IDEA");
		return jdbc.query("select * from V_START_ODF_CA_IDEA", new VStartOdfCaIdeaRowMapper());
	}

	@Override
	public List<VNotifOdfCaIdea> getNotifIdea() {
		logger.info("Getting Notification information for Ideas using ODF_CA_IDEA");
		return jdbc.query("select * from V_NOTIF_ODF_CA_IDEA", new VNotifOdfCaIdeaRowMapper());
	}

	@Override
	public List<VPrePostOdfCaIdea> getPrePostIdea() {
		logger.info("Getting PRE or POST information for Ideas using ODF_CA_IDEA");
		return jdbc.query("select * from V_PRE_POST_ODF_CA_IDEA", new VPrePostOdfCaIdeaRowMapper());
	}

	@Override
	public List<VDetailsOdfCaIdea> getDetailsIdea() {
		logger.info("Getting DETAILS information for Ideas using ODF_CA_IDEA");
		return jdbc.query("select * from V_DETAILS_ODF_CA_IDEA", new VDetailsOdfCaIdeaRowMapper());
	}

	
	
	
	
}
