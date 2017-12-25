package com.webcrawler.dao;
// Generated Sep 12, 2017 10:44:29 AM by Hibernate Tools 5.1.0.Alpha1

/**
 * RequestCorrelationTbl generated by hbm2java
 */
public class RequestCorrelationTbl implements java.io.Serializable {

	private Integer id;
	private RunIdentTbl runIdentTbl;
	private String foundArgName;
	private String foundArgValue;
	private String foundArgValueExtended;
	private String variable;
	private String corrRegex;

	public RequestCorrelationTbl() {
	}

	public RequestCorrelationTbl(RunIdentTbl runIdentTbl, String foundArgName, String foundArgValue, String foundArgValueExtended, String variable, String corrRegex) {
		this.runIdentTbl = runIdentTbl;
		this.foundArgName = foundArgName;
		this.foundArgValue = foundArgValue;
		this.setFoundArgValueExtended(foundArgValueExtended);
		this.variable = variable;
		this.corrRegex = corrRegex;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public RunIdentTbl getRunIdentTbl() {
		return this.runIdentTbl;
	}

	public void setRunIdentTbl(RunIdentTbl runIdentTbl) {
		this.runIdentTbl = runIdentTbl;
	}

	public String getFoundArgName() {
		return this.foundArgName;
	}

	public void setFoundArgName(String foundArgName) {
		this.foundArgName = foundArgName;
	}

	public String getFoundArgValue() {
		return this.foundArgValue;
	}

	public void setFoundArgValue(String foundArgValue) {
		this.foundArgValue = foundArgValue;
	}

	public String getFoundArgValueExtended() {
		return foundArgValueExtended;
	}

	public void setFoundArgValueExtended(String foundArgValueExtended) {
		this.foundArgValueExtended = foundArgValueExtended;
	}

	public String getVariable() {
		return this.variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

	public String getCorrRegex() {
		return this.corrRegex;
	}

	public void setCorrRegex(String corrRegex) {
		this.corrRegex = corrRegex;
	}

}
