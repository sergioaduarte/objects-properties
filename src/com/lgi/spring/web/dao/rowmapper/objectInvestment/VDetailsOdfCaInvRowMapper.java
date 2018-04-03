package com.lgi.spring.web.dao.rowmapper.objectInvestment;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import com.lgi.spring.web.entities.VDetailsOdfCaInv;

public class VDetailsOdfCaInvRowMapper implements RowMapper<VDetailsOdfCaInv> {

	private static Logger logger = Logger.getLogger(VDetailsOdfCaInvRowMapper.class);

	@Override
	public VDetailsOdfCaInv mapRow(ResultSet rs, int rowNum) throws SQLException {
		VDetailsOdfCaInv detailsOdfCaInv = new VDetailsOdfCaInv();
		detailsOdfCaInv.setColumnId(rs.getBigDecimal("column_Id"));
		detailsOdfCaInv.setColumnName(rs.getString("column_Name"));
		detailsOdfCaInv.setActions(rs.getString("actions"));
		detailsOdfCaInv.setDataDefault(rs.getString("data_default"));
		detailsOdfCaInv.setDataType(rs.getString("data_type"));
		detailsOdfCaInv.setDefaultLength(rs.getBigDecimal("default_length"));
		detailsOdfCaInv.setDisplayed(rs.getString("displayed"));
		detailsOdfCaInv.setGels(rs.getString("gels"));
		detailsOdfCaInv.setNotif(rs.getString("notif"));
		detailsOdfCaInv.setNullable(rs.getString("nullable"));
		detailsOdfCaInv.setNumDistinct(rs.getBigDecimal("num_distinct"));
		detailsOdfCaInv.setOwner(rs.getString("owner"));
		detailsOdfCaInv.setPrepost(rs.getString("prepost"));
		detailsOdfCaInv.setStartop(rs.getString("startop"));
		detailsOdfCaInv.setTableName(rs.getString("table_name"));
		logger.info("Getting VActionsOdfCaIdea: " + detailsOdfCaInv.toString());
		return detailsOdfCaInv;
	}

}
