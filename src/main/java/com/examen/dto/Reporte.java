package com.examen.dto;

import java.security.Timestamp;

public class Reporte {
	
	private int id;
	private String file;
	private int conexion;
	private Timestamp datacreate;
	private String state;
	private String description;
	private String name;
	
	
	public Reporte(int id, String file, int conexion, Timestamp datacreate, String state, String description,
			String name) {
		super();
		this.id = id;
		this.file = file;
		this.conexion = conexion;
		this.datacreate = datacreate;
		this.state = state;
		this.description = description;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public int getConexion() {
		return conexion;
	}
	public void setConexion(int conexion) {
		this.conexion = conexion;
	}
	public Timestamp getDatacreate() {
		return datacreate;
	}
	public void setDatacreate(Timestamp datacreate) {
		this.datacreate = datacreate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
