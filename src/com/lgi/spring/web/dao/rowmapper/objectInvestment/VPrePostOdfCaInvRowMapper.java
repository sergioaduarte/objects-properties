package com.lgi.spring.web.dao.rowmapper.objectInvestment;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import com.lgi.spring.web.entities.VPrePostOdfCaInv;

public class VPrePostOdfCaInvRowMapper implements RowMapper<VPrePostOdfCaInv> {

	private static Logger logger = Logger.getLogger(VPrePostOdfCaInvRowMapper.class);
	
	@Override
	public VPrePostOdfCaInv mapRow(ResultSet rs, int rowNum) throws SQLException {
		VPrePostOdfCaInv prePostOdfCaInv = new VPrePostOdfCaInv();
		prePostOdfCaInv.setAction(rs.getString("action"));
		prePostOdfCaInv.setColumnId(rs.getBigDecimal("column_Id"));
		prePostOdfCaInv.setColumnName(rs.getString("column_Name"));
		prePostOdfCaInv.setCreatedDate(rs.getDate("created_Date"));
		prePostOdfCaInv.setProcessCode(rs.getString("process_Code"));
		prePostOdfCaInv.setProcessName(rs.getString("process_Name"));
		prePostOdfCaInv.setProcessStatus(rs.getString("process_Status"));
		prePostOdfCaInv.setScriptText(rs.getString("script_Text"));
		prePostOdfCaInv.setStep(rs.getString("step"));
		prePostOdfCaInv.setTableName(rs.getString("table_Name"));
		logger.info("Getting VActionsOdfCaIdea: " + prePostOdfCaInv.toString());
		return prePostOdfCaInv;
	}

}
