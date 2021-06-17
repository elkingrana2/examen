package com.examen.dto;

import java.security.Timestamp;

public class Seguimiento {
	
	private int id;
	private int report;
	private Timestamp datagenerate;
	private byte state;
	private String result;
	private String datailrequest;
	private String type;
	private String filegenerate;
	
	
	
	public Seguimiento(int id, int report, Timestamp datagenerate, byte state, String result, String datailrequest,
			String type, String filegenerate) {
		super();
		this.id = id;
		this.report = report;
		this.datagenerate = datagenerate;
		this.state = state;
		this.result = result;
		this.datailrequest = datailrequest;
		this.type = type;
		this.filegenerate = filegenerate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getReport() {
		return report;
	}
	public void setReport(int report) {
		this.report = report;
	}
	public Timestamp getDatagenerate() {
		return datagenerate;
	}
	public void setDatagenerate(Timestamp datagenerate) {
		this.datagenerate = datagenerate;
	}
	public byte getState() {
		return state;
	}
	public void setState(byte state) {
		this.state = state;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getDatailrequest() {
		return datailrequest;
	}
	public void setDatailrequest(String datailrequest) {
		this.datailrequest = datailrequest;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFilegenerate() {
		return filegenerate;
	}
	public void setFilegenerate(String filegenerate) {
		this.filegenerate = filegenerate;
	}
	
	
	
	

}
