package com.lgi.spring.web.dao.rowmapper.objectInvestment;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import com.lgi.spring.web.entities.VActionsOdfCaInv;

public class VActionsOdfCaInvRowMapper implements RowMapper<VActionsOdfCaInv> {

	private static Logger logger = Logger.getLogger(VActionsOdfCaInvRowMapper.class);
	
	@Override
	public VActionsOdfCaInv mapRow(ResultSet rs, int rowNum) throws SQLException {
		VActionsOdfCaInv actionsOdfCaInv = new VActionsOdfCaInv();
		actionsOdfCaInv.setAction(rs.getString("action"));
		actionsOdfCaInv.setColumnId(rs.getBigDecimal("column_Id"));
		actionsOdfCaInv.setColumnName(rs.getString("column_Name"));
		actionsOdfCaInv.setCreatedDate(rs.getDate("created_Date"));
		actionsOdfCaInv.setProcessCode(rs.getString("process_Code"));
		actionsOdfCaInv.setProcessName(rs.getString("process_Name"));
		actionsOdfCaInv.setProcessStatus(rs.getString("process_Status"));
		actionsOdfCaInv.setScriptText(rs.getString("script_Text"));
		actionsOdfCaInv.setStep(rs.getString("step"));
		actionsOdfCaInv.setTableName(rs.getString("table_Name"));
		logger.info("Getting VActionsOdfCaIdea: " + actionsOdfCaInv.toString());
		return actionsOdfCaInv;
	}

}
