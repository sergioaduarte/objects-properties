package com.lgi.spring.web.dao.rowmapper.objectIdea;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import com.lgi.spring.web.entities.VDetailsOdfCaIdea;

public class VDetailsOdfCaIdeaRowMapper implements RowMapper<VDetailsOdfCaIdea> {

	private static Logger logger = Logger.getLogger(VDetailsOdfCaIdeaRowMapper.class);

	@Override
	public VDetailsOdfCaIdea mapRow(ResultSet rs, int rowNum) throws SQLException {
		VDetailsOdfCaIdea detailsOdfCaIdea = new VDetailsOdfCaIdea();
		detailsOdfCaIdea.setColumnId(rs.getBigDecimal("column_Id"));
		detailsOdfCaIdea.setColumnName(rs.getString("column_Name"));
		detailsOdfCaIdea.setActions(rs.getString("actions"));
		detailsOdfCaIdea.setDataDefault(rs.getString("data_default"));
		detailsOdfCaIdea.setDataType(rs.getString("data_type"));
		detailsOdfCaIdea.setDefaultLength(rs.getBigDecimal("default_length"));
		detailsOdfCaIdea.setDisplayed(rs.getString("displayed"));
		detailsOdfCaIdea.setGels(rs.getString("gels"));
		detailsOdfCaIdea.setNotif(rs.getString("notif"));
		detailsOdfCaIdea.setNullable(rs.getString("nullable"));
		detailsOdfCaIdea.setNumDistinct(rs.getBigDecimal("num_distinct"));
		detailsOdfCaIdea.setOwner(rs.getString("owner"));
		detailsOdfCaIdea.setPrepost(rs.getString("prepost"));
		detailsOdfCaIdea.setStartop(rs.getString("startop"));
		detailsOdfCaIdea.setTableName(rs.getString("table_name"));
		logger.info("Getting VActionsOdfCaIdea: " + detailsOdfCaIdea.toString());
		return detailsOdfCaIdea;
	}

}
