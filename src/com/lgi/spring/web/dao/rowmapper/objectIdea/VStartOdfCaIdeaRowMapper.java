package com.lgi.spring.web.dao.rowmapper.objectIdea;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import com.lgi.spring.web.entities.VStartOdfCaIdea;

public class VStartOdfCaIdeaRowMapper implements RowMapper<VStartOdfCaIdea> {

	private static Logger logger = Logger.getLogger(VStartOdfCaIdeaRowMapper.class);

	@Override
	public VStartOdfCaIdea mapRow(ResultSet rs, int rowNum) throws SQLException {
		VStartOdfCaIdea startOdfCaIdea = new VStartOdfCaIdea();
		startOdfCaIdea.setColumnId(rs.getBigDecimal("column_Id"));
		startOdfCaIdea.setColumnName(rs.getString("column_Name"));
		startOdfCaIdea.setProcessCode(rs.getString("process_Code"));
		startOdfCaIdea.setProcessName(rs.getString("process_Name"));
		startOdfCaIdea.setScriptText(rs.getString("script_Text"));
		startOdfCaIdea.setTableName(rs.getString("table_Name"));
		startOdfCaIdea.setTriggerOption(rs.getString("trigger_option"));
		startOdfCaIdea.setUserStatusCode(rs.getString("user_status_code"));
		logger.info("Getting VActionsOdfCaIdea: " + startOdfCaIdea.toString());
		return startOdfCaIdea;
	}

}
