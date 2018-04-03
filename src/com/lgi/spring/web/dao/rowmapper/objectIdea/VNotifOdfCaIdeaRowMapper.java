package com.lgi.spring.web.dao.rowmapper.objectIdea;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import com.lgi.spring.web.entities.VNotifOdfCaIdea;

public class VNotifOdfCaIdeaRowMapper implements RowMapper<VNotifOdfCaIdea> {

	private static Logger logger = Logger.getLogger(VNotifOdfCaIdeaRowMapper.class);
	
	@Override
	public VNotifOdfCaIdea mapRow(ResultSet rs, int rowNum) throws SQLException {
		VNotifOdfCaIdea notifOdfCaIdea = new VNotifOdfCaIdea();
		notifOdfCaIdea.setAction(rs.getString("action"));
		notifOdfCaIdea.setColumnId(rs.getBigDecimal("column_Id"));
		notifOdfCaIdea.setColumnName(rs.getString("column_Name"));
		notifOdfCaIdea.setCreatedDate(rs.getDate("created_Date"));
		notifOdfCaIdea.setProcessCode(rs.getString("process_Code"));
		notifOdfCaIdea.setProcessName(rs.getString("process_Name"));
		notifOdfCaIdea.setProcessStatus(rs.getString("process_Status"));
		notifOdfCaIdea.setScriptText(rs.getString("script_Text"));
		notifOdfCaIdea.setStep(rs.getString("step"));
		notifOdfCaIdea.setTableName(rs.getString("table_Name"));
		logger.info("Getting VActionsOdfCaIdea: " + notifOdfCaIdea.toString());
		return notifOdfCaIdea;
	}

}
