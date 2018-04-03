package com.lgi.spring.web.dao.rowmapper.objectInvestment;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import com.lgi.spring.web.entities.VNotifOdfCaInv;

public class VNotifOdfCaInvRowMapper implements RowMapper<VNotifOdfCaInv> {

	private static Logger logger = Logger.getLogger(VNotifOdfCaInvRowMapper.class);
	
	@Override
	public VNotifOdfCaInv mapRow(ResultSet rs, int rowNum) throws SQLException {
		VNotifOdfCaInv notifOdfCaInv = new VNotifOdfCaInv();
		notifOdfCaInv.setAction(rs.getString("action"));
		notifOdfCaInv.setColumnId(rs.getBigDecimal("column_Id"));
		notifOdfCaInv.setColumnName(rs.getString("column_Name"));
		notifOdfCaInv.setCreatedDate(rs.getDate("created_Date"));
		notifOdfCaInv.setProcessCode(rs.getString("process_Code"));
		notifOdfCaInv.setProcessName(rs.getString("process_Name"));
		notifOdfCaInv.setProcessStatus(rs.getString("process_Status"));
		notifOdfCaInv.setScriptText(rs.getString("script_Text"));
		notifOdfCaInv.setStep(rs.getString("step"));
		notifOdfCaInv.setTableName(rs.getString("table_Name"));
		logger.info("Getting VActionsOdfCaIdea: " + notifOdfCaInv.toString());
		return notifOdfCaInv;
	}

}
