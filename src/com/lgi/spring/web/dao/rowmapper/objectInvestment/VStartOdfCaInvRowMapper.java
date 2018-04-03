package com.lgi.spring.web.dao.rowmapper.objectInvestment;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import com.lgi.spring.web.entities.VStartOdfCaInv;

public class VStartOdfCaInvRowMapper implements RowMapper<VStartOdfCaInv> {

	private static Logger logger = Logger.getLogger(VStartOdfCaInvRowMapper.class);

	@Override
	public VStartOdfCaInv mapRow(ResultSet rs, int rowNum) throws SQLException {
		VStartOdfCaInv startOdfCaInv = new VStartOdfCaInv();
		startOdfCaInv.setColumnId(rs.getBigDecimal("column_Id"));
		startOdfCaInv.setColumnName(rs.getString("column_Name"));
		startOdfCaInv.setProcessCode(rs.getString("process_Code"));
		startOdfCaInv.setProcessName(rs.getString("process_Name"));
		startOdfCaInv.setScriptText(rs.getString("script_Text"));
		startOdfCaInv.setTableName(rs.getString("table_Name"));
		startOdfCaInv.setTriggerOption(rs.getString("trigger_option"));
		startOdfCaInv.setUserStatusCode(rs.getString("user_status_code"));
		logger.info("Getting VActionsOdfCaIdea: " + startOdfCaInv.toString());
		return startOdfCaInv;
	}

}
