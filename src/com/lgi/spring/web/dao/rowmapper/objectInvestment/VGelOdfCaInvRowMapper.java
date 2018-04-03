package com.lgi.spring.web.dao.rowmapper.objectInvestment;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import com.lgi.spring.web.entities.VGelOdfCaInv;

public class VGelOdfCaInvRowMapper implements RowMapper<VGelOdfCaInv> {

	private static Logger logger = Logger.getLogger(VGelOdfCaInvRowMapper.class);
	
	@Override
	public VGelOdfCaInv mapRow(ResultSet rs, int rowNum) throws SQLException {
		VGelOdfCaInv gelOdfCaInv = new VGelOdfCaInv();
		gelOdfCaInv.setAction(rs.getString("action"));
		gelOdfCaInv.setColumnId(rs.getBigDecimal("column_Id"));
		gelOdfCaInv.setColumnName(rs.getString("column_Name"));
		gelOdfCaInv.setCreatedDate(rs.getDate("created_Date"));
		gelOdfCaInv.setProcessCode(rs.getString("process_Code"));
		gelOdfCaInv.setProcessName(rs.getString("process_Name"));
		gelOdfCaInv.setProcessStatus(rs.getString("process_Status"));
		gelOdfCaInv.setScriptText(rs.getString("script_Text"));
		gelOdfCaInv.setStep(rs.getString("step"));
		gelOdfCaInv.setTableName(rs.getString("table_Name"));
		logger.info("Getting VGelOdfCaInv: " + gelOdfCaInv.toString());
		return gelOdfCaInv;
	}

}
