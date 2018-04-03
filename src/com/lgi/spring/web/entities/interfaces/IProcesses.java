package com.lgi.spring.web.entities.interfaces;

import java.util.Date;

public abstract class IProcesses {

	String processName;
	String processCode;
	String scriptText;
	String processStatus;
	Date createdDate;
	String columnName;
	String tableName;
	String columnId;

	public IProcesses(String processName, String processCode, String scriptText, String processStatus, Date createdDate,
			String columnName, String tableName, String columnId) {
		this.processName = processName;
		this.processCode = processCode;
		this.scriptText = scriptText;
		this.processStatus = processStatus;
		this.createdDate = createdDate;
		this.columnName = columnName;
		this.tableName = tableName;
		this.columnId = columnId;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getProcessCode() {
		return processCode;
	}

	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public String getScriptText() {
		return scriptText;
	}

	public void setScriptText(String scriptText) {
		this.scriptText = scriptText;
	}

	public String getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getColumnId() {
		return columnId;
	}

	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}
}
