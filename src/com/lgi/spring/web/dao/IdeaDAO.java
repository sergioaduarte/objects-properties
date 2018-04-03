package com.lgi.spring.web.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.lgi.spring.web.entities.ObjectsPropers;

@Component("ideaDAO")
public class IdeaDAO {

	private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	public IdeaDAO(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public List<ObjectsPropers> getAll() {
		
/*		return jdbc.query("select code, name from niku.inv_investments where ODF_OBJECT_CODE = 'project' order by 1 desc", new RowMapper<ObjectsPropers>() {

			public ObjectsPropers mapRow(ResultSet rs, int rowNum) throws SQLException {
				ObjectsPropers objectsPropers = new ObjectsPropers();

				objectsPropers.setCode(rs.getString("code"));
				objectsPropers.setName(rs.getString("name"));

				return objectsPropers;
			}

		});*/
		return null;
	}
	
	
}
