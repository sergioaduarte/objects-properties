package com.lgi.spring.web.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the V_ACTIONS_ODF_CA_PROJECT database table.
 * 
 */
@Entity
@Table(name="V_ACTIONS_ODF_CA_PROJECT")
@NamedQuery(name="VActionsOdfCaProject.findAll", query="SELECT v FROM VActionsOdfCaProject v")
public class VActionsOdfCaProject implements Serializable {
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

	@Column(name="SCRIPT_TEXT")
	private String scriptText;

	private String step;

	@Column(name="TABLE_NAME")
	private String tableName;

	public VActionsOdfCaProject() {
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