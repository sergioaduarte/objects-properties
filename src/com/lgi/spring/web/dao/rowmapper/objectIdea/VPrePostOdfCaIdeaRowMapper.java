package com.lgi.spring.web.dao.rowmapper.objectIdea;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import com.lgi.spring.web.entities.VPrePostOdfCaIdea;

public class VPrePostOdfCaIdeaRowMapper implements RowMapper<VPrePostOdfCaIdea> {

	private static Logger logger = Logger.getLogger(VPrePostOdfCaIdeaRowMapper.class);
	
	@Override
	public VPrePostOdfCaIdea mapRow(ResultSet rs, int rowNum) throws SQLException {
		VPrePostOdfCaIdea prePostOdfCaIdea = new VPrePostOdfCaIdea();
		prePostOdfCaIdea.setAction(rs.getString("action"));
		prePostOdfCaIdea.setColumnId(rs.getBigDecimal("column_Id"));
		prePostOdfCaIdea.setColumnName(rs.getString("column_Name"));
		prePostOdfCaIdea.setCreatedDate(rs.getDate("created_Date"));
		prePostOdfCaIdea.setProcessCode(rs.getString("process_Code"));
		prePostOdfCaIdea.setProcessName(rs.getString("process_Name"));
		prePostOdfCaIdea.setProcessStatus(rs.getString("process_Status"));
		prePostOdfCaIdea.setScriptText(rs.getString("script_Text"));
		prePostOdfCaIdea.setStep(rs.getString("step"));
		prePostOdfCaIdea.setTableName(rs.getString("table_Name"));
		logger.info("Getting VActionsOdfCaIdea: " + prePostOdfCaIdea.toString());
		return prePostOdfCaIdea;
	}

}
