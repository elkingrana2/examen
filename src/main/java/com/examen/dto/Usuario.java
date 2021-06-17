package com.examen.dto;

public class Usuario {
	
	private int id;
	private String usuario;
	private String email;
	private String pass;
	private int role;
	private int state;
	
	public Usuario(int id, String usuario, String email, String pass, int role, int state) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.email = email;
		this.pass = pass;
		this.role = role;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	

}
