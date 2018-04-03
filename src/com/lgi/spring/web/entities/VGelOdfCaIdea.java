package com.lgi.spring.web.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the V_GEL_ODF_CA_IDEA database table.
 * 
 */
@Entity
@Table(name="V_GEL_ODF_CA_IDEA")
@NamedQuery(name="VGelOdfCaIdea.findAll", query="SELECT v FROM VGelOdfCaIdea v")
public class VGelOdfCaIdea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"ACTION\"")
	private String action;

	@Column(name="COLUMN_ID")
	private BigDecimal columnId;

	@Column(name="COLUMN_NAME")
	private String columnName;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="PROCESS_CODE")
	private String processCode;

	@Column(name="PROCESS_NAME")
	private String processName;

	@Column(name="PROCESS_STATUS")
	private String processStatus;

	@Lob
	@Column(name="SCRIPT_TEXT")
	private String scriptText;

	private String step;

	@Column(name="TABLE_NAME")
	private String tableName;

	public VGelOdfCaIdea() {
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
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

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getProcessCode() {
		return this.processCode;
	}

	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public String getProcessName() {
		return this.processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getProcessStatus() {
		return this.processStatus;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public String getScriptText() {
		return this.scriptText;
	}

	public void setScriptText(String scriptText) {
		this.scriptText = scriptText;
	}

	public String getStep() {
		return this.step;
	}

	public void setStep(String step) {
		this.step = step;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}