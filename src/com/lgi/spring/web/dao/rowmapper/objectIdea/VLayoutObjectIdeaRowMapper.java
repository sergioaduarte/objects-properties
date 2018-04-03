package com.lgi.spring.web.dao.rowmapper.objectIdea;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import com.lgi.spring.web.entities.VLayoutObjectIdea;

public class VLayoutObjectIdeaRowMapper implements RowMapper<VLayoutObjectIdea> {

	private static Logger logger = Logger.getLogger(VLayoutObjectIdeaRowMapper.class);
	
	@Override
	public VLayoutObjectIdea mapRow(ResultSet rs, int rowNum) throws SQLException {
		VLayoutObjectIdea vLayoutObjectIdea = new VLayoutObjectIdea();
		vLayoutObjectIdea.setClarityFieldType(rs.getString("CLARITY_FIELD_TYPE"));
		vLayoutObjectIdea.setColumnName(rs.getString("COLUMN_NAME"));
		vLayoutObjectIdea.setColumnPosition(rs.getString("COLUMN_POSITION"));
		vLayoutObjectIdea.setDataType(rs.getString("DATA_TYPE"));
		vLayoutObjectIdea.setDisplayType(rs.getString("DISPLAY_TYPE"));
		vLayoutObjectIdea.setFieldName(rs.getString("FIELD_NAME"));
		vLayoutObjectIdea.setHasDefault(rs.getString("HAS_DEFAULT"));
		vLayoutObjectIdea.setDefaultValue(rs.getString("DEFAULT_VALUE"));
		vLayoutObjectIdea.setIsReadOnly(rs.getString("IS_READ_ONLY"));
		vLayoutObjectIdea.setNullable(rs.getString("NULLABLE"));
		vLayoutObjectIdea.setNumDistinct(rs.getBigDecimal("NUM_DISTINCT"));
		vLayoutObjectIdea.setNumNulls(rs.getBigDecimal("NUM_NULLS"));
		vLayoutObjectIdea.setObject(rs.getString("OBJECT"));
		vLayoutObjectIdea.setSection(rs.getString("SECTION"));
		vLayoutObjectIdea.setSubpage(rs.getString("SUBPAGE"));
		vLayoutObjectIdea.setTableName(rs.getString("TABLE_NAME"));
		vLayoutObjectIdea.setTechnicalPartition(rs.getString("TECHNICAL_PARTITION"));
		vLayoutObjectIdea.setIsValueRequired(rs.getString("IS_VALUE_REQUIRED"));
		logger.info("Getting vLayoutObjectIdea: " + vLayoutObjectIdea.toString());
		return vLayoutObjectIdea;
	}

}
