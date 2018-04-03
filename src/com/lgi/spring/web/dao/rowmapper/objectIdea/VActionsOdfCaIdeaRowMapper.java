package com.lgi.spring.web.dao.rowmapper.objectIdea;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import com.lgi.spring.web.entities.VActionsOdfCaIdea;

public class VActionsOdfCaIdeaRowMapper implements RowMapper<VActionsOdfCaIdea> {

	private static Logger logger = Logger.getLogger(VActionsOdfCaIdeaRowMapper.class);
	
	@Override
	public VActionsOdfCaIdea mapRow(ResultSet rs, int rowNum) throws SQLException {
		VActionsOdfCaIdea actionsOdfCaIdea = new VActionsOdfCaIdea();
		actionsOdfCaIdea.setAction(rs.getString("action"));
		actionsOdfCaIdea.setColumnId(rs.getBigDecimal("column_Id"));
		actionsOdfCaIdea.setColumnName(rs.getString("column_Name"));
		actionsOdfCaIdea.setCreatedDate(rs.getDate("created_Date"));
		actionsOdfCaIdea.setProcessCode(rs.getString("process_Code"));
		actionsOdfCaIdea.setProcessName(rs.getString("process_Name"));
		actionsOdfCaIdea.setProcessStatus(rs.getString("process_Status"));
		actionsOdfCaIdea.setScriptText(rs.getString("script_Text"));
		actionsOdfCaIdea.setStep(rs.getString("step"));
		actionsOdfCaIdea.setTableName(rs.getString("table_Name"));
		logger.info("Getting VActionsOdfCaIdea: " + actionsOdfCaIdea.toString());
		return actionsOdfCaIdea;
	}

}
