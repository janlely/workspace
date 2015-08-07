package org.g4studio.core.metatype.impl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;

import org.g4studio.core.metatype.Dto;

@SuppressWarnings({ "rawtypes", "serial" })
public class BaseDto extends HashMap implements Dto, Serializable {

	
	public BaseDto(){}
	
	@SuppressWarnings("unchecked")
	public BaseDto(String key, Object value){
		put(key, value);
	}
	
	public BaseDto(Boolean success){
		setSuccess(success);
	}
	
	public BaseDto(Boolean success, String msg){
		setSuccess(success);
		setMsg(msg);
	}
	
	
	@Override
	public Integer getAsInteger(String pStr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getAsLong(String pStr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAsString(String pStr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal getAsBigDecimal(String pStr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getAsDate(String pStr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAsList(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Timestamp getAsTimestamp(String pStr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean getAsBoolean(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDefaultAList(List pList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDefaultBList(List pList) {
		// TODO Auto-generated method stub

	}

	@Override
	public List getDefaultAList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getDefaultBList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDefaultJson(String jsonString) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDefaultJson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toXml(String pStyle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toXml() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toJson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void println() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toJson(String pFormat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSuccess(Boolean pSuccess) {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean getSuccess() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMsg(String pMsg) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getMsg() {
		// TODO Auto-generated method stub
		return null;
	}

}
