package com.lgi.spring.web.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the V_LAYOUT_OBJECT_IDEA database table.
 * 
 */
@Entity
@Table(name="V_LAYOUT_OBJECT_IDEA")
@NamedQuery(name="VLayoutObjectIdea.findAll", query="SELECT v FROM VLayoutObjectIdea v")
public class VLayoutObjectIdea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CLARITY_FIELD_TYPE")
	private String clarityFieldType;

	@Column(name="COLUMN_NAME")
	private String columnName;

	@Column(name="COLUMN_POSITION")
	private String columnPosition;

	@Column(name="DATA_TYPE")
	private String dataType;

	@Column(name="DEFAULT_VALUE")
	private String defaultValue;

	@Column(name="DISPLAY_TYPE")
	private String displayType;

	@Column(name="FIELD_NAME")
	private String fieldName;

	@Column(name="HAS_DEFAULT")
	private String hasDefault;

	@Column(name="IS_READ_ONLY")
	private String isReadOnly;

	@Column(name="IS_VALUE_REQUIRED")
	private String isValueRequired;

	private String nullable;

	@Column(name="NUM_DISTINCT")
	private BigDecimal numDistinct;

	@Column(name="NUM_NULLS")
	private BigDecimal numNulls;

	@Column(name="\"OBJECT\"")
	private String object;

	@Column(name="\"SECTION\"")
	private String section;

	private String subpage;

	@Column(name="TABLE_NAME")
	private String tableName;

	@Column(name="TECHNICAL_PARTITION")
	private String technicalPartition;

	public VLayoutObjectIdea() {
	}

	public String getClarityFieldType() {
		return this.clarityFieldType;
	}

	public void setClarityFieldType(String clarityFieldType) {
		this.clarityFieldType = clarityFieldType;
	}

	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getColumnPosition() {
		return this.columnPosition;
	}

	public void setColumnPosition(String columnPosition) {
		this.columnPosition = columnPosition;
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getDisplayType() {
		return this.displayType;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getHasDefault() {
		return this.hasDefault;
	}

	public void setHasDefault(String hasDefault) {
		this.hasDefault = hasDefault;
	}

	public String getIsReadOnly() {
		return this.isReadOnly;
	}

	public void setIsReadOnly(String isReadOnly) {
		this.isReadOnly = isReadOnly;
	}

	public String getIsValueRequired() {
		return this.isValueRequired;
	}

	public void setIsValueRequired(String isValueRequired) {
		this.isValueRequired = isValueRequired;
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

	public BigDecimal getNumNulls() {
		return this.numNulls;
	}

	public void setNumNulls(BigDecimal numNulls) {
		this.numNulls = numNulls;
	}

	public String getObject() {
		return this.object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getSection() {
		return this.section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getSubpage() {
		return this.subpage;
	}

	public void setSubpage(String subpage) {
		this.subpage = subpage;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTechnicalPartition() {
		return this.technicalPartition;
	}

	public void setTechnicalPartition(String technicalPartition) {
		this.technicalPartition = technicalPartition;
	}

	@Override
	public String toString() {
		return "VLayoutObjectIdea [clarityFieldType=" + clarityFieldType + ", columnName=" + columnName
				+ ", columnPosition=" + columnPosition + ", dataType=" + dataType + ", defaultValue=" + defaultValue
				+ ", displayType=" + displayType + ", fieldName=" + fieldName + ", hasDefault=" + hasDefault
				+ ", isReadOnly=" + isReadOnly + ", isValueRequired=" + isValueRequired + ", nullable=" + nullable
				+ ", numDistinct=" + numDistinct + ", numNulls=" + numNulls + ", object=" + object + ", section="
				+ section + ", subpage=" + subpage + ", tableName=" + tableName + ", technicalPartition="
				+ technicalPartition + "]";
	}

}