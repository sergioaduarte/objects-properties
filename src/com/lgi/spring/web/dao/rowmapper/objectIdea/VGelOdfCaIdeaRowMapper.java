package com.lgi.spring.web.dao.rowmapper.objectIdea;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import com.lgi.spring.web.entities.VGelOdfCaIdea;

public class VGelOdfCaIdeaRowMapper implements RowMapper<VGelOdfCaIdea> {

	private static Logger logger = Logger.getLogger(VGelOdfCaIdeaRowMapper.class);
	
	@Override
	public VGelOdfCaIdea mapRow(ResultSet rs, int rowNum) throws SQLException {
		VGelOdfCaIdea gelOdfCaIdea = new VGelOdfCaIdea();
		gelOdfCaIdea.setAction(rs.getString("action"));
		gelOdfCaIdea.setColumnId(rs.getBigDecimal("column_Id"));
		gelOdfCaIdea.setColumnName(rs.getString("column_Name"));
		gelOdfCaIdea.setCreatedDate(rs.getDate("created_Date"));
		gelOdfCaIdea.setProcessCode(rs.getString("process_Code"));
		gelOdfCaIdea.setProcessName(rs.getString("process_Name"));
		gelOdfCaIdea.setProcessStatus(rs.getString("process_Status"));
		gelOdfCaIdea.setScriptText(rs.getString("script_Text"));
		gelOdfCaIdea.setStep(rs.getString("step"));
		gelOdfCaIdea.setTableName(rs.getString("table_Name"));
		logger.info("Getting VGelOdfCaInv: " + gelOdfCaIdea.toString());
		return gelOdfCaIdea;
	}

}
