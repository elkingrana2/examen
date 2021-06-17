package com.examen.dto;

//import jdk.internal.icu.util.CodePointTrie.Small;

public class ConnectionToken {
	
	private int id;
	private String host;
	private String userdb;
	private String pass;
	private String db;
	private String token;
	private int port;
	private int user;
	private String type;
	
	
	public ConnectionToken(int id, String host, String userdb, String pass, String db, String token, int port, int user,
			String type) {
		super();
		this.id = id;
		this.host = host;
		this.userdb = userdb;
		this.pass = pass;
		this.db = db;
		this.token = token;
		this.port = port;
		this.user = user;
		this.type = type;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getUserdb() {
		return userdb;
	}
	public void setUserdb(String userdb) {
		this.userdb = userdb;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getDb() {
		return db;
	}
	public void setDb(String db) {
		this.db = db;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	

}
