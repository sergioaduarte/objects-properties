package com.lgi.spring.web.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the V_START_ODF_CA_CHANGE database table.
 * 
 */
@Entity
@Table(name="V_START_ODF_CA_CHANGE")
@NamedQuery(name="VStartOdfCaChange.findAll", query="SELECT v FROM VStartOdfCaChange v")
public class VStartOdfCaChange implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="COLUMN_ID")
	private BigDecimal columnId;

	@Column(name="COLUMN_NAME")
	private String columnName;

	@Column(name="PROCESS_CODE")
	private String processCode;

	@Column(name="PROCESS_NAME")
	private String processName;

	@Lob
	@Column(name="SCRIPT_TEXT")
	private String scriptText;

	@Column(name="TABLE_NAME")
	private String tableName;

	@Column(name="TRIGGER_OPTION")
	private String triggerOption;

	@Column(name="USER_STATUS_CODE")
	private String userStatusCode;

	public VStartOdfCaChange() {
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

	public String getScriptText() {
		return this.scriptText;
	}

	public void setScriptText(String scriptText) {
		this.scriptText = scriptText;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTriggerOption() {
		return this.triggerOption;
	}

	public void setTriggerOption(String triggerOption) {
		this.triggerOption = triggerOption;
	}

	public String getUserStatusCode() {
		return this.userStatusCode;
	}

	public void setUserStatusCode(String userStatusCode) {
		this.userStatusCode = userStatusCode;
	}

}