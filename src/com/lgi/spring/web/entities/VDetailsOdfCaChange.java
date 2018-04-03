package com.lgi.spring.web.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the V_DETAILS_ODF_CA_CHANGE database table.
 * 
 */
@Entity
@Table(name="V_DETAILS_ODF_CA_CHANGE")
@NamedQuery(name="VDetailsOdfCaChange.findAll", query="SELECT v FROM VDetailsOdfCaChange v")
public class VDetailsOdfCaChange implements Serializable {
	private static final long serialVersionUID = 1L;

	private String actions;

	@Column(name="COLUMN_ID")
	private BigDecimal columnId;

	@Column(name="COLUMN_NAME")
	private String columnName;

	@Column(name="DATA_DEFAULT")
	private Object dataDefault;

	@Column(name="DATA_TYPE")
	private String dataType;

	@Column(name="DEFAULT_LENGTH")
	private BigDecimal defaultLength;

	private String displayed;

	private String gels;

	private String notif;

	private String nullable;

	@Column(name="NUM_DISTINCT")
	private BigDecimal numDistinct;

	private String owner;

	private String prepost;

	private String startop;

	@Column(name="TABLE_NAME")
	private String tableName;

	public VDetailsOdfCaChange() {
	}

	public String getActions() {
		return this.actions;
	}

	public void setActions(String actions) {
		this.actions = actions;
	}

	public BigDecimal getColumnId() {
		return this.columnId;
	}

	public void setColumnId(BigDecimal columnId) {
		this.columnId = columnId;
	}

	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public Object getDataDefault() {
		return this.dataDefault;
	}

	public void setDataDefault(Object dataDefault) {
		this.dataDefault = dataDefault;
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public BigDecimal getDefaultLength() {
		return this.defaultLength;
	}

	public void setDefaultLength(BigDecimal defaultLength) {
		this.defaultLength = defaultLength;
	}

	public String getDisplayed() {
		return this.displayed;
	}

	public void setDisplayed(String displayed) {
		this.displayed = displayed;
	}

	public String getGels() {
		return this.gels;
	}

	public void setGels(String gels) {
		this.gels = gels;
	}

	public String getNotif() {
		return this.notif;
	}

	public void setNotif(String notif) {
		this.notif = notif;
	}

	public String getNullable() {
		return this.nullable;
	}

	public void setNullable(String nullable) {
		this.nullable = nullable;
	}

	public BigDecimal getNumDistinct() {
		return this.numDistinct;
	}

	public void setNumDistinct(BigDecimal numDistinct) {
		this.numDistinct = numDistinct;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPrepost() {
		return this.prepost;
	}

	public void setPrepost(String prepost) {
		this.prepost = prepost;
	}

	public String getStartop() {
		return this.startop;
	}

	public void setStartop(String startop) {
		this.startop = startop;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}